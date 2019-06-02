package 集合框架库.Map集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Map中Iterator的使用
public class TestIterator {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap <> (  );
        map.put ( 1,"hello" );
        map.put ( 2,"bit" );
        map.put ( 3,"Java" );
        Set<Map.Entry<Integer,String>>  set=map.entrySet ();
        Iterator<Map.Entry<Integer,String>> iterator=set.iterator ();
        while(iterator.hasNext ()){
            Map.Entry<Integer,String> entry=iterator.next ();
            System.out.println (entry.getKey ()+"="+entry.getValue () );
        }
    }
}
