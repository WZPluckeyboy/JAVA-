package IO流.System类;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBufferedReader {
    public static void main(String[] args) {
        try (BufferedReader buf =new BufferedReader ( new InputStreamReader ( System.in ) )){
            System.out.println ("请输入信息：" );
            String str=buf.readLine ();
            System.out.println ("输入的信息为："+str );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}
