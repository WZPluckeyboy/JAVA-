package 聊天室.单线程模式;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class SingleThreadServer {
    public static void main(String[] args)  {
        //1.准备地址和端口
        //127.0.0.1  4406
        int port=4406;
        try {
            //2.创建serverSocket
            ServerSocket serverSocket=new ServerSocket ( port );
            System.out.println ("服务端启动了，运行在"+serverSocket.getLocalSocketAddress () );
            //3.等待客户端连接
            //阻塞方法
            Socket socket=serverSocket.accept ();
            //4.数据的接受
            InputStream in=socket.getInputStream ();
            Scanner scanner=new Scanner (in  );
            System.out.println ( "客户端说："+scanner.nextLine ());
            //5.数据的发送
            OutputStream out=socket.getOutputStream ();
            PrintStream printStream=new PrintStream ( out );
            printStream.println ( "欢迎，欢迎" );
            printStream.flush ();
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}
