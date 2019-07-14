package 聊天室.单线程模式.多线程模式;
import java.io.IOException;
import java.net.Socket;
public class MultiThreadClient {
    public static void main(String[] args) {
        String defaultHost="127.0.0.1";
        int defaultPort=4406;
        String host=defaultHost;
        int port = defaultPort;
        for(String arg:args){
            if(arg.startsWith ( "--port=" )){
                String portStr=arg.substring ( "--port=".length () );
                try {
                    port = Integer.parseInt ( portStr );
                }catch(NumberFormatException e){
                    port=defaultPort;
                }
            }
            if(arg.startsWith ( "--host=" )){
                String hostStr=arg.substring ( "--host".length () );
                host=hostStr;
            }
        }
        try {
            Socket socket=new Socket (host,port  );
            //发数据收数据
            new WriteDataToServerThread(socket).start ();
            new ReadDataFromServerThread(socket).start ();
        } catch (IOException e) {
            e.printStackTrace ( );
        }

    }
}
