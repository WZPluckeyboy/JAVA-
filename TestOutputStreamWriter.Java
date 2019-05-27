package IO流.字节流与字符流.转换流;
import java.io.*;
public class TestOutputStreamWriter {
    public static void main(String[] args) {
        File file=new File ( "D:" +File.separator+"Test"+
                File.separator+"Test3.txt");
        if(!file.getParentFile ().exists ()){
            file.getParentFile ().mkdirs ();
        }
       try(OutputStream outputStream = new FileOutputStream ( file );
          Writer writer= new OutputStreamWriter (  outputStream  )) {
            String str="我爱你中国";
            writer.write ( str );
            writer.write ( 65 );
            writer.flush ();
       } catch (FileNotFoundException e) {
           e.printStackTrace ( );
       } catch (IOException e) {
           e.printStackTrace ( );
       }
    }
}