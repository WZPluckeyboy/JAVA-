package 集合框架库.集合的输出形式;
import java.util.Enumeration;
import java.util.Vector;
public class TestEnumeration {
    public static void main(String[] args) {
        Vector<String> vector=new Vector <> (  );
        vector.add ( "Hello" );
        vector.add ( "bit" );
        vector.add ( "world" );
        vector.add ("hello");
        Enumeration<String> enumeration=vector.elements ();
        while (enumeration.hasMoreElements ()){
            while ((enumeration.hasMoreElements ())){
                System.out.println (enumeration.nextElement () );
            }
        }
    }
}
