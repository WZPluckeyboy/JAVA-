package IO流;
import java.io.File;
import  java.io.IOException;
import  java.util.Date;
//1.取出文件信息
/*public class 文件信息 {
    public static void main(String[] args) {
        File file=new File("D:"+File.separator+"输入输出流"+
                File.separator+"输入流"+File.separator+"输出流"+File.separator+"HellWord.java");
        if(file.exists ()&&file.isFile ()){
            System.out.println ("文件大小："+file.length () );
            System.out.println ("最后一次修改日期："+new Date(file.lastModified ()));
            System.out.println("是否能够执行：" + file.canExecute());
            System.out.println("文件名：" + file.getName());
            System.out.println("是否是文件：" + file.isFile());
            System.out.println("是否是目录：" + file.isDirectory());
            System.out.println("是否是隐藏文件：" + file.isHidden());
            System.out.println("文件大小(字节)：" + file.length());
        }
    }
}*/
//2.列出目录的全部组成
public class 文件信息 {
    public static void main(String[] args) {
        File file = new File ( "D:" + File.separator + "输入输出流" +
                File.separator + "输入流" + File.separator + "输出流"  );
        if (file.exists ( ) && file.isFile ( )) {
            File[] files=file.listFiles ();
            for(File result: files){
                System.out.println (result );
            }

        }
    }
}