package 集合框架库;
//在list下的基本操作
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
public class TestArraylist {
    public static void main(String[] args) {
       List<String> list=new ArrayList<> ();
       list.add("hello");
       list.add("bit");
       list.add("word");
       list.add("Java");
       list.add("python");
        System.out.println (list );
        System.out.println ( "表长度："+list.size());
        System.out.println ("移除元素："+list.remove("bit") );
        System.out.println ("是否包含元素："+list.contains ( "word" ) );
        System.out.println ("表是否为空："+list.isEmpty () );
     for(String i:list){
         System.out.println (i );
     }
     System.out.println ("============================" );
     for(int i=0;i<list.size();i++){
         System.out.println (list.get(i) );
     }
    }
}
//在list的父类类collection
class TestList{
    public static void main(String[] args) {
        Collection<String> list=new ArrayList <> (  );
        list.add("唱");
        list.add("跳");
        list.add("跳");
        list.add("rap");
        list.add ( "打篮球" );
        System.out.println (list );
Object[] result=list.toArray ();
        System.out.println (Arrays.toString(result ));

    }
}
