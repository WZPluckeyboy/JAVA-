package 集合框架库.Map集合;
import java.util.Map;
//可排序Map
public class TreeMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new java.util.TreeMap <> (  );
        map.put ( 2,"c" );
        map.put ( 0,"a" );
        map.put ( 1,"b" );
        System.out.println (map );
    }
}
