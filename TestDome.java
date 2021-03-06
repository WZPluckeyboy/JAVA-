package 集合框架库.Map集合.Properties属性文件的操作;

import java.io.*;
import java.util.Iterator;
import java.util.Properties;
/*public class TestDome {
    public static void main(String[] args) {
        Properties properties=new Properties (  );
        properties.setProperty ( "xa","xian" );
        properties.setProperty ( "sh","shanghai" );
        properties.setProperty ( "sx","shanxi" );
        System.out.println (properties.get ( "xa" ) );
        System.out.println (properties.get ( "sh" ) );
        System.out.println (properties.get ( "sx" ) );

    }
}*/
//将属性输出到文件
/*public class TestDome {
    public static void main(String[] args) {
Properties properties=new Properties (  );
        properties.setProperty ( "xa","xian" );
        properties.setProperty ( "sh","shanghai" );
        properties.setProperty ( "sx","shanxi" );
         File file=new File ( "D:"+File.separator+"Test"+File.separator+"test1.properties");
        try {
            properties.store ( new FileOutputStream ( file ),"test.properties" );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}*/
//通过属性文件读取内容
public class TestDome {
    public static void main(String[] args) {
        Properties properties=new Properties (  );
        File file=new File ( "D:"+File.separator+"Test"+File.separator+"test1.properties" );
        try {
            properties.load ( new FileInputStream ( file));
        } catch (IOException e) {
            e.printStackTrace ( );
        }
        System.out.println (properties.getProperty ( "sx" ) );
    }
}