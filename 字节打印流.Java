import java.io.*;
//字节流打印
public class TestPrintStream {
    public static void main(String[] args) {
        File file=new File ( "D:"+File.separator+"Test"+File.separator+"Helloword1.txt" );
        try(PrintStream printStream=new PrintStream ( new FileOutputStream ( file ) )) {
            printStream.print ( "姓名" );
            printStream.println ( "张三" );
            String str="hello";
            printStream.flush ();
        } catch (FileNotFoundException e) {
            e.printStackTrace ( );
        }
    }
}
