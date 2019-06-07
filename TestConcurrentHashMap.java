package 集合框架库.Map集合;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
//通过多线程处理，更安全
public class TestConcurrentHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new ConcurrentHashMap <> (  );
        map.put ( 1,"Java" );
        map.put ( 2,"PH" );
        map.put ( 3,"python" );
        map.put ( 4,"C++" );
        map.put ( 1,"JAVA" );
        System.out.println (map );

    }
}
