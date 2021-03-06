一、引用静态方法
@FunctionalInterface
interface Iutil<P,R>{
    //将Integer转化为String
   /* String convert(Integer value);*/
     R convert(P p);
}
public class  Test {
    public static void main(String[] args) {
        Iutil <Integer, String> iutil = (p) -> {
            return String.valueOf ( p );
        };
        Iutil <Integer, String> iu =String::valueOf;
        System.out.println (iu.convert ( 10 ) );
    }
}
二、引用动态方法
interface Iutil1<R>{
    R switchPara();
}
public classTest {
    public static void main(String[] args) {
     Iutil1 <String> iutil1=new Iutil1 <String> ( ) {
         @Override
         public String switchPara() {
             return "hello".toUpperCase ();//将小写变为大写
         }
     } ;
        Iutil1 <String> iutil12="hello"::toUpperCase;
        System.out.println (iutil12.switchPara () );
    }
}
三、引用类中的普通方法
interface Iutil3<P,R> {
    R compare(P p1, P p2);
}
public  class Test  {
    public static void main(String[] args) {
        Iutil3 <Integer, Integer> iutil3 = (p1, p2) ->{
            return p1-p2;
        };
        Integer a=new Integer ( 100 );
        a.compareTo ( new Integer ( 120 ) );
        Iutil3 <Integer, Integer> iutil31=Integer::compareTo;//通过类型：成员方进行引用
        System.out.println (iutil3.compare ( 10,40 ) );
    }
}
四、构造方法的引用
class Person{
    private  String name;
    private int age;
    public Person(){};
    public Person(int age,String name){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "("+name+","+age+")";
    }
}
interface  ObjectFactory<P1,P2,R>{
    R createObject(P1 p1,P2 p2);
}
public class 构造方法的引用 {
    public static void main(String[] args) {
        Person person1=new Person (  );
       Person person2=new Person (34, "jack");
       ObjectFactory<Integer,String,Person> factory =(p1,p2)->{
           return new Person ( p1,p2);
       };
      Person  person3=factory.createObject ( 20,"Alice" );
        ObjectFactory<Integer,String,Person> factory1 =Person::new;
      Person person4=factory1.createObject ( 21,"Tom" );
        System.out.println (person4 );
    }
}
