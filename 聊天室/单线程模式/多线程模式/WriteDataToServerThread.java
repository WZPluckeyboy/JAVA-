package 聊天室.单线程模式.多线程模式;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
public class WriteDataToServerThread  extends Thread{
    private  final Socket socket;
    public WriteDataToServerThread(Socket socket) {
        this.socket=socket;
    }
    @Override
    public void run() {
        try {
            OutputStream out=this.socket.getOutputStream ();
            PrintStream printStream=new PrintStream ( out );
            Scanner scanner=new Scanner ( System.in );
            while(true){
                System.out.print("请输入:" );
                String message=scanner.nextLine ();
                printStream.println ( message );
                printStream.flush ();
                if(message.equals ( "bye" )){
                    break;
                }
            }
            this.socket.close ();
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}
