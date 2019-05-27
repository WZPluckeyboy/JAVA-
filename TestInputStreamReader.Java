package IO流.字节流与字符流.转换流;
import java.io.*;
public class TestInputStreamReader {
    public static void main(String[] args) {
        File file=new File ( "D:" +File.separator+"Test"+
                File.separator+"Test3.txt");
        if(!file.exists ()){
            throw new IllegalArgumentException ( "文件不存在无法读取" );
        }
        try(InputStream inputStream=new FileInputStream ( file );
        Reader reader=new InputStreamReader ( inputStream )){
            char[] buff=new char[1024];
            int len=-1;
            while((len=reader.read ( buff ))!=-1){
                System.out.println ( new String(buff,0,len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace ( );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}