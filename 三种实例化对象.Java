package 反射;
import java.util.Date;

//获取实例化对象的三种方法
//1.任何类的实例化对象可以通过Object类中的getClass（)方法取得Class类对象
public class Test {
    public static void main(String[] args) {
        Date date=new Date();
        Class aClass = date.getClass();
        System.out.println (date.getClass () );
    }
}
//2."类.class",直接根据某个具体的类型的类来取得Class类的实例化对象
class  test2{
    public static void main(String[] args) {
        System.out.println (Date.class );
    }
}
//3.使用Class类提供的方法
class test3{
    public static void main(String[] args) {
        Class<?> cls = null ;try {
            cls = Class.forName ( "java.util.Date" );
        } catch (ClassNotFoundException e) {
            e.printStackTrace ( );
        }
        System.out.println (cls.getName () );
    }
