package 聊天室.单线程模式.多线程模式;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class ClientHander implements Runnable{
    private static final Map<String,Socket> socketMap =new ConcurrentHashMap <> (  );
    private  final Socket client;
    private  String name;
     public ClientHander(Socket client) {
         this.client=client;
    }
    @Override
    public void run() {
        try {
            InputStream in=this.client.getInputStream ();
            Scanner scanner=new Scanner ( in );
            while(true){
            String line =scanner.nextLine ();
           if(line.startsWith ( "register:" )){
            String [] segments= line.split ( ":" );
            if(segments.length==2 &&segments[0].equals ( "register" )){
           String name=segments[1];
           register(name);
     }
   continue;
}
if(line.startsWith ( "groupChat:" )){
       String[] segments=line.split ( ":" );
       if(segments.length==2&&segments[0].equals ( "groupChat" )){
           String message=segments[1];
           groupChat(message);
       }
    continue;
}
if(line.startsWith ( "privateChat:" )){
              String[] segments=line.split ( ":" );
              if(segments.length==3&&segments[0].equals ( "privateChat" )){
                  String name=segments[1];
                  String message=segments[2];
                  privateChat(name,message);
              }
  continue;
}
if(line .equalsIgnoreCase ( "bye" )){
               quitChat();
    break;
}
            }
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }

    private void quitChat() {
         socketMap.remove ( this.name );
        System.out.println (this.name+"下线了" );
        printOnlineClient ();
    }
    private void privateChat(String name, String message) {
         Socket socket=socketMap.get(name);
         if(socket!=null){
             sendMessage ( socket,message );
             System.out.println (this.name+"说" +message);
         }
    }

    private void groupChat(String message) {
         for(Map.Entry<String,Socket> entry:socketMap.entrySet ()){
             Socket socket=entry.getValue ();
             if(socket==this.client){
                 continue;
             }
             sendMessage ( socket,this.name+"说" +message);
         }
    }
    private void register(String name) {
         this.name=name;
         socketMap.put ( name,this.client );
         System.out.println (name+"注册到系统中" );
         sendMessage ( this.client,"欢迎"+name+"注册成功" );
         printOnlineClient ();
    }
    private  void printOnlineClient(){
        System.out.println ("当前在线客户端有："+socketMap.size ()+"个，名称类表如下：" );
        for(String name :socketMap.keySet ()){
            System.out.println (name );
        }
    }
    //发送消息到指定客户端与服务端对等的消息
    private  void sendMessage(Socket socket, String message){
        try {
            OutputStream out=this .client.getOutputStream ();
            PrintStream printStream=new PrintStream ( out );
            printStream.println ( message );
            printStream.flush ();
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}
public class MultiThreadServer {
    public static void main(String[] args) {
        int defaultPort=4406;
        int port=defaultPort;
        for(String arg:args){
            if(arg.startsWith ( "--port=" )){
                String portStr=arg.substring ( "--port=".length () );
                try {
                    port = Integer.parseInt ( portStr );
                }catch(NumberFormatException e){
                    port=defaultPort;
                }
            }
        }
        final ExecutorService executorService=Executors.newFixedThreadPool ( 2*Runtime.getRuntime ().availableProcessors () );
        try {
            ServerSocket serverSocket=new ServerSocket ( port) ;
            System.out.println ("服务端启动，运行在:"+serverSocket.getLocalSocketAddress () );
            while(true) {
                final Socket socket = serverSocket.accept ( );
                System.out.println ("客户端连接，来自："+socket.getRemoteSocketAddress () );
                executorService.execute ( new ClientHander (socket) );
            }
        } catch (IOException e) {
            e.printStackTrace ( );
        }finally {
            executorService.shutdown ();
        }
    }
}
