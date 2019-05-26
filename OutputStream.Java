package IO流.字节流与字符流;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
    //1.最原始的方法
/*public class OutputStreamTest {
    public static void main(String[] args) {
        File file =new File ( "D:"+File.separator+"输入输出流"
                +File.separator+"输入流"+File.separator+"输出流"+File.separator+"Hello.txt");
        //判断目录是否存在，若不存在，自己创建
        File parent=file.getParentFile ();
        if(!parent.exists ()){
            parent.mkdirs();
        }
        FileOutputStream outputStream=null;
        try {
            outputStream=new FileOutputStream ( file );
            outputStream.write ( 65 );
            outputStream.write ( 97 );
            outputStream.write ( 99 );
            String str="I 哎@￥& _!！\n";
            byte[] strByte=str.getBytes ();
            outputStream.write ( strByte );
            outputStream.flush ();
        } catch (java.io.IOException e) {
            e.printStackTrace ( );
        }finally {
            if (outputStream != null) {
                try {
                    outputStream.close ( );
                } catch (IOException e) {
                    e.printStackTrace ( );
                }
            }
        }
    }
}*/
//2.第二种方法:自动关闭方式
    public class OutputStreamTest {
        public static void main(String[] args) {
            File file = new File ( "D:" + File.separator + "输入输出流"
                    + File.separator + "输入流" + File.separator + "输出流" + File.separator + "Hello.txt" );
            File parent = file.getParentFile ( );
            if (!parent.exists ( )) {
                parent.mkdir ( );
            }
            try (FileOutputStream outputStream = new FileOutputStream ( file, true )) {
               outputStream.write ( 75 );
               outputStream.write ( 90 );
               outputStream.write ( 100 );
               String str="我不黑浮游！!";
               byte[] strByte=str.getBytes ();
               outputStream.write ( strByte );
            } catch (FileNotFoundException e) {
                e.printStackTrace ( );
            } catch (IOException e) {
                e.printStackTrace ( );
            }
        }
    }
