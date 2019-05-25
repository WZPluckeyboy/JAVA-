package IO流;
import java.io.File;
import java.io.IOException;
public class 目录操作 {
    public static void main(String[] args) throws IOException {
        File file=new File("D:"+File.separator+"输入输出流"+
        File.separator+"输入流"+File.separator+"输出流"+File.separator+"HellWord.java");
        if(file.exists ()){
            System.out.println ("文件存在,不需要创建" );
        }
        else{
            File partentfile=file.getParentFile ();
            if(!partentfile.exists ()){
                boolean effect =partentfile.mkdirs ();
                if(effect){
                    System.out.println ("父目录不存在，并创建成功！" );
                }
                else{
                    System.out.println ("父目录不存在，并创建失败！" );
                }
            }
            else{
                System.out.println ("父目录存在！" );
                boolean effect=file.createNewFile ();
                if(effect) {
                    System.out.println ( "父目录存在并且文件创建成功！" );
                }
                else{
                    System.out.println ("目录存在但文件创建失败！" );
                    }
            }
        }
    }
}