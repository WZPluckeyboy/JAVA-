package 反射.反射与类操作;
interface  IFruit{}
interface Message{}
class CLS implements IFruit,Message{
    public static void main(String[] args) {
        System.out.println ("子类信息" );
    }
}
public class 取得父类信息 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class cls=CLS.class;
        Object object=cls.newInstance ();
        System.out.println (cls );
        System.out.println (object );
        System.out.println (cls.getPackage () );//返回带有Package的包名
        System.out.println (cls.getPackage ().getName () );//返回不带Package的包名
        System.out.println (cls.getSuperclass ().getName () );//得到父类名称
        System.out.println (cls.getSimpleName () );//只返回类名
        System.out.println (cls.getName () );//带有报名的类名
        Class[]  iClass =cls.getInterfaces ();//返回接口
        for( Class class1: iClass){
            System.out.println ( class1);
        }
    }
}
