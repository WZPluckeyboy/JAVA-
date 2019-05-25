package IO流;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
//1.最原始的创建方式
/*public class 创建新文件 {
    public static void main(String[] args) {
        File file = new File ( "D:\\javatest\\test2.java" );
        try {
            file.createNewFile ();
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}*/
//2.由于在不同的系统下，斜杠的方向不一样，因此用File.separator来代替斜杠，便于文件的兼容
class 创建文件2{
    public static void main(String[] args) throws IOException {
        File file=new File ( "D:"+File.separator
                +"javatest"+File.separator+"test2.java" );
        if(file.exists ()){
            boolean effect=file.delete ();
         if(effect) {
             File file2 = new File ( "D:" + File.separator
                     + "javatest" + File.separator + "test3.java" );
             if(file2.exists ( )) {
                 file2.delete ();
                 System.out.println ( "文件存在并成功删除,新文件存在不需创建新文件,并删除新文件！" );
             }
             else{
                 file2.createNewFile ( );
                 System.out.println ("创建新文件成功" );
             }
         }
         else{
             System.out.println ("文件存在,并删除失败" );
         }
        }
        else{
            boolean effect=file.createNewFile ();
            if(effect){
                System.out.println ("文件不存在,并创建成功！" );
            }
            else{
                System.out.println ("文件不存在，并创建失败" );
            }
        }

    }
}
