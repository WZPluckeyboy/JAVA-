package 集合框架库.集合的输出形式;

import java.util.ArrayList;
import java.util.List;

public class TestForeach {
    public static void main(String[] args) {
        List<String> list=new ArrayList <> (  );
        list.add ( "PHP" );
        list.add ( "JAVA" );
        list.add ( "python" );
        list.add ( "C++" );
        for(String str:list){
            System.out.print (str+" -->" );
        }
    }
}
