import java.lang.reflect.Field;
//一个参数的
class Person <T>{
    private T message;
    public T getMessage() {
        return message;
    }
    public void setMessage(T message) {
        this.message = message;
    }
    public void testMethod1(T t){
        System.out.println (t );
    }
}
public class TestDome {
    public static void main(String[] args) {
       Person<Integer>  person1 =new Person <> ();
       Person<String >  person2 =new Person <> ();
        System.out.println (person1.getClass ()==person2.getClass () );  //打印结果为true,因为My Class<integer>和My Class<String>在JVM中的Class都是MyClass.class.都属于T类下的。
    }
}
//两的参数的
class MyClass1<T,E>{
    private T age;
    private E name;

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }
    public void testMethod2(T t){
        System.out.println (t );
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
    public void testMethod3(E e){
        System.out.println (e );
    }

    public static void main(String[] args) {
        MyClass<Integer,String> myClass=new MyClass <> ();
        MyClass<String ,Integer> myClass2=new MyClass <>();
        System.out.println (myClass.getClass ()==myClass2.getClass () );     //对于两个参数同样使用
        Class cls=myClass.getClass ();
        Field[] fields =cls.getDeclaredFields ();
        for(Field field:fields){
            System.out.println (field.getType () );
        }

    }
}
//由以上程序可以得出以下两个结论：
// 1.打印结果为true,因为My Class<integer>和My Class<String>在JVM中的Class都是MyClass.class.都属于T类下的。
//2.在泛型类被泛型擦除的时候，之前泛型类中的类型参数部分如果没有指定上限，则会被转乘Object类，如果指定了上限就会被替换为类型上限如下：
class MyClass<T extends Integer,E extends String>{
    private T age;
    private E name;

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }
    public void testMethod2(T t){
        System.out.println (t );
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
    public void testMethod3(E e){
        System.out.println (e );
    }

    public static void main(String[] args) {
        MyClass<Integer,String> myClass=new MyClass <> ();
        Class cls=myClass.getClass ();
        Field[] fields =cls.getDeclaredFields ();
        for(Field field:fields){
            System.out.println (field.getType () );
        }

    }
}