package 集合框架库.Map集合;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//与HashMap类似，属于同步处理
public class TestHashtable {
    public static void main(String[] args) {
        Hashtable<Integer,String> map=new Hashtable<> (  );
        map.put ( 1,"JAVA" );
        map.put(2,"PHP");
        map.put ( 3,"python" );
        map.put ( 4,"C++" );
        map.put ( 5,"C" );
        System.out.println (map );
        //1.将map集合转为Set集合
        Set<Map.Entry<Integer,String>> set=map.entrySet ();
        Iterator<Map.Entry<Integer,String>> iterator=set.iterator ();
        while (iterator.hasNext ()){
            Map.Entry<Integer,String> entry=iterator.next ();
            System.out.println (entry.getKey ()+"="+entry.getValue () );
        }
    }
}
