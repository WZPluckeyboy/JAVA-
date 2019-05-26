package IO流.字节流与字符流;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//一、手动关闭的方式读取
/*public class InputStreamTest {
    public static void main(String[] args) {
        File file = new File ( "D:" + File.separator + "输入输出流"
                + File.separator + "输入流" + File.separator + "输出流" + File.separator + "Hello.txt" );
    if(!file.exists ()){
        throw new IllegalArgumentException ( "文件不存在无法操作！" );
    }
        FileInputStream inputStream= null;
        try {
            inputStream = new FileInputStream ( file );
            //方式一：一个一个读
            /*int value =-1;
            while((value=inputStream.read ())!=-1){
                System.out.print ((char)value+" " );
            }*/
            //方式二：一次读取多个数据
           /* byte[] buff=new byte[10];
            int len=-1;
            while((len=inputStream.read ( buff ))!=-1){
                System.out.println (new  String(buff,0,len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace ( );
        } catch (IOException e) {
            e.printStackTrace ( );
        }finally {
           if(inputStream!=null) {
               try {
                   inputStream.close ();
               } catch (IOException e) {
                   e.printStackTrace ( );
               }
           }
        }
    }
    }*/
   // 二、自动关闭的方式读取
public class InputStreamTest {
       public static void main(String[] args) {
           File file = new File ( "D:" + File.separator + "输入输出流"
                   + File.separator + "输入流" + File.separator + "输出流" + File.separator + "Hello.txt" );
           if(!file.exists ()){
                       throw new IllegalArgumentException ( "文件不存在无法操作" );
           }
           try(FileInputStream inputStream=new FileInputStream ( file )){
               //方式一：一个一个读
           /*int value =-1;
            while((value=inputStream.read ())!=-1){
                System.out.print ((char)value+" " );
            }*/
               //方式二：一次读取多个数据
           byte[] buff=new byte[10];
            int len=-1;
            while((len=inputStream.read ( buff ))!=-1){
                System.out.println (new  String(buff,0,len));
            }

           } catch (FileNotFoundException e) {
               e.printStackTrace ( );
           } catch (IOException e) {
               e.printStackTrace ( );
           }
       }
   }