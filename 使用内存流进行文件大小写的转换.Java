package IO流.内存流;
import com.sun.xml.internal.bind.v2.util.ByteArrayOutputStreamEx;
import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import java.io.*;
//通过内存流实现大小写的转换
public class Test {
    public static void main(String[] args) throws IOException {
        String msg="hello word";
        ByteArrayInputStream input = new ByteArrayInputStream (msg.getBytes ( ) );
        ByteArrayOutputStream output=new ByteArrayOutputStreamEx (  );
        int temp=-1;
        while((temp=input.read())!=-1){
            temp=Character.toUpperCase ( temp );
                output.write (temp );
        }
byte[] newData= output .toByteArray ();
        System.out.println (new String(newData) );
            input.close ();
            output.close ();
    }
}
