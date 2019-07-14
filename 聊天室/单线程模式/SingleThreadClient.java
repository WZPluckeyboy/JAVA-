package 聊天室.单线程模式;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class SingleThreadClient {
    public static void main(String[] args) {
        //1.服务端地址和端口
        //127.0.0.1  4406
        String ip="127.0.0.1";
        int port = 4406;
        //2.Socket
        try {
            Socket socket=new Socket ( ip,port );
            //3.数据的发送
            OutputStream out=socket.getOutputStream ();
            PrintStream printStream=new PrintStream ( out );
            printStream.println ( "服务器我来了" );
            printStream.flush ();
            //4.数据的接受
            InputStream in=socket.getInputStream ();
            Scanner scanner=new Scanner (in  );
            System.out.println ( "来自服务的数据："+scanner.nextLine ());
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}
