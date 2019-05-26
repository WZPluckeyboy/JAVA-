package IO流.字节流与字符流.字符流;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class TestWriter {
    public static void main(String[] args) {
        File file=new File ( "D:"+File.separator+"Test"+
                File.separator+"test2.txt" );
        if(!(file.isFile ()||file.exists ()||file.getParentFile ().exists ())){
            file.getParentFile ().mkdirs ();
        }
        try(FileWriter writer=new FileWriter ( file,true )){
            writer.write ( 65 );
            writer.write ( "你好吗" );
            String str="你呀";
            writer.append ( str );
            writer.write (str,0,2 );
            writer.flush ();
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}
