package IO流.内存流;
import java.io.*;
//把两个文件合并为一个，在此处需要准备三个文件，一个为最终合并后的文件，另两个为
//需要操作的文件
public class 内存流进行文件的合并 {
    public static void main(String[] args) {
        String path="D:"+File.separator+"Test"+File.separator;
        try (InputStream fa=new FileInputStream ( path+"view.jpg" );
             InputStream fb=new FileInputStream ( path+"timg.jpg" );
        FileOutputStream out=new FileOutputStream ( path+"data.jpg" );
        ByteArrayOutputStream memeryout=new ByteArrayOutputStream (  )){
            int len=-1;
            byte[] buff =new byte[1024];
            while((len=fa.read ( buff ))!=-1){
                memeryout.write ( buff,0,len );
            }
            while((len=fb.read ( buff ))!=-1){
                memeryout.write ( buff,0,len );
            }
            byte[] memeryData=memeryout.toByteArray ();
            out.write ( memeryData );
            out.flush ();
        } catch (FileNotFoundException e) {
            e.printStackTrace ( );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}