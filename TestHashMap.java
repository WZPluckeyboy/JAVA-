package 集合框架库.Map集合;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class TestHashMap {
    public static void main(String[] args) {
        Map <Integer, String> map = new HashMap <> ( );
        map.put ( 1,"hello" );
        map.put ( 2,"bit" );
        map.put ( 3,"JAVA" );
        map.put ( 4,"C++" );
        map.put ( 5,"C" );
        Set<Integer> set=map.keySet ();
        Iterator<Integer> iterator=set.iterator ();
        while(iterator.hasNext ()){
            System.out.print (iterator.next () );
        }
        System.out.println (map );
        System.out.println ( map.get ( 2) );
        System.out.println (map.containsKey ( 12 ) );
        System.out.println (map.containsKey ( 4 ) );
        System.out.println ("集合元素的个数："+map.size () );
        System.out.println ("集合元素的所有value："+map.values () );
    }
}