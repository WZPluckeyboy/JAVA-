package IO流.打印流;
import java.io.*;
public class TestPrintWriter {
    public static void main(String[] args) {
        File file =new File ( "D:"+File.separator+"Test"+File.separator+"df" +File.separator+"hello2.txt");
      File partent=file.getParentFile ();
        if(!partent.exists ()) {
            boolean s = partent.mkdirs ( );
            if (!s) {
                throw new IllegalArgumentException ( "文件创建失败" );
            }
        }
        PrintWriter printWriter= null;
            try {
                printWriter = new PrintWriter ( new FileOutputStream ( file ) );
            } catch (FileNotFoundException e) {
                e.printStackTrace ( );
            }
            printWriter.print ( 65 );
               printWriter.print ( "this is a cat" );
               String str="hello";
               printWriter.print ( str );
               printWriter.flush ();
               printWriter.close ();
        }
    }