package IO流.System类;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/*public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println ("请输入内容！" );
        if(scanner.hasNext ()) {    //有输入内容，不判断空字符串
            System.out.println ( "输入内容：" + scanner.next ( ) );
        }
    }
}*/
//使用Scanner操作文件
/*public class TestScanner{
    public static void main(String[] args) {
        try(Scanner scan=new Scanner ( new FileInputStream ( new File ("D:"
                +File.separator+"Test"+File.separator+"sf.txt") ) )){
            scan.useDelimiter ( "\n" );    //自定义分隔符
            while (scan.hasNext ()){
                System.out.println (scan.next () );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace ( );
        }
    }
}*/
//利用正则表达式进行判断
public class TestScanner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner ( System.in )) {
            System.out.println ( "请输入生日！" );
            if (scanner.hasNext ( "\\d{4}-\\d{2}-\\d{2}" )) {
                String birthday = scanner.nextLine ( );
                System.out.println ( "输入的生日为：" + birthday );
            } else {
                System.out.println ("输入的为非法参数" );
            }
        }
    }
}


