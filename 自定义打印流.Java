package IO流.打印流;
import java.io.*;
public class MyPrintStream {
    private OutputStream out;
    public MyPrintStream(OutputStream out){
        this.out=out;
    }
    public  void write(int value){
        this.write ( String.valueOf ( value ) );
    }
    public void write(double value){
        write(String.valueOf ( value ));
    }
    public void write(String value){
      byte[] data=  value.getBytes ();
        try {
            this.out.write ( data );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
    public static void main(String[] args) {
        File file =new File ( "D:"+File.separator+"Test"+File.separator+"Helloword.txt" );
       try(OutputStream out=new FileOutputStream (  file);){
           MyPrintStream myPrintStream3=new MyPrintStream ( out );
           myPrintStream3.write ( 45 );
           myPrintStream3.write ( "shiju" );
       } catch (FileNotFoundException e) {
           e.printStackTrace ( );
       } catch (IOException e) {
           e.printStackTrace ( );
       }
    }
}
