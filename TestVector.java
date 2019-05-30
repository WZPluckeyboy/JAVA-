package 集合框架库;
import java.util.List;
import java.util.Vector;
public class TestVector {
    public static void main(String[] args) {
        List<String> list =new Vector <> (  );
        list.add ( "PHP" );
        list.add ( "JAVA" );
        list.add ( "python" );
        list.add ( "C++" );
        list.set ( 2 ,"C");
        System.out.println (list );
        Object[] objects=list.toArray ();
        for(Object obj:objects){
            System.out.println (obj );
            list.remove ( obj );
        }
        System.out.println ("表是否为空:"+list.isEmpty () );
        list.remove ( "python" );
        System.out.println ( );
    }
}

