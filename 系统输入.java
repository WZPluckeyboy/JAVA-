package IO流.System类;

import java.io.IOException;
import java.io.InputStream;

public class 系统输入 {
    public static void main(String[] args) throws IOException {
        InputStream in=System.in;
        byte[] data=new byte[1024];
        System.out.println ("请输入信息" );
        int temp=in.read ( data );
        System.out.println (new String(data,0,temp) );
    }
}
