package 聊天室.单线程模式.多线程模式;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;
public class ReadDataFromServerThread extends Thread {
    private  final Socket socket;
    public ReadDataFromServerThread(Socket socket) {
        this.socket=socket;
    }
    @Override
    public void run() {
        try {
            InputStream in=this.socket.getInputStream ();
            Scanner scanner=new Scanner ( in );
            while(true){
                String message=scanner.nextLine ();
                System.out.println ("来自服务端的消息"+message );
            }
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}
