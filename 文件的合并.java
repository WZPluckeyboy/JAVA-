package IO流.字节流与字符流;
import java.io.*;
public class 文件的合并 {
    //把字符数组转化为字符串路径
  public  static String srcFilePath2(String[] srcFiles){
        String srcFilePath3=null;
        String srcFilePath1="";
        for(int i=0;i<srcFiles.length-1;i++) {
              srcFilePath1 +=srcFiles[i] + File.separator;
        }
        srcFilePath3=srcFilePath1+srcFiles[srcFiles.length-1];
        return srcFilePath3;
    }
    //合并代码
    public static void merge(String[]  srcFiles,String destFilePath) {
        //1.参数判断
        if (srcFiles.length == 0) {
            throw new IllegalArgumentException ( "源文件不能为空！" );
        }
        if (destFilePath == null) {
            throw new IllegalArgumentException ( "路径不能为空" );
        }
        File sf = new File ( srcFilePath2 ( srcFiles ) );
        File df = new File ( destFilePath );
        //2.遍历scr
        try (FileInputStream inputStream = new FileInputStream ( sf );
             FileOutputStream outputStream = new FileOutputStream ( df, true )) {
            byte[] data = new byte[1024];
            int len = -1;
            while (( len = inputStream.read ( data ) ) != -1) {
                outputStream.write ( data, 0, len );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace ( );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
    public static void main(String[] args) {
        String[] srcFiles={"D:","Test","view.jpg"};
String destFilePath="D:"+File.separator+"Test"+File.separator+"df"+File.separator+
        "timg.jpg";
   merge (srcFiles,destFilePath);

    }
}