package 反射.反射与类操作;
import java.lang.reflect.Method;
interface  Person1{
  void  print();
}
class Student implements Person1{
    private String name;
    private int age;
    private String skill;
    public Student(){}
    public Student(String name, int age,String skill){
        this.name=name;
        this.age=age;
        this.skill=skill;
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

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
    public  String toString(){
        return "Person [name="+name+", age="+age+", skill="+skill+"]";
    }

    @Override
    public void print() {
        System.out.println (toString () );
    }
}
public class 反射调用普通方法 {
    public static void main(String[] args) {
        Class classz=Person.class;
        //返回一个类中所有的普通方法
        Method[] methods=classz.getMethods ();
        for(Method method :methods){
            System.out.println (method );
        }
        System.out.println ("===========================" );
        Method[] methods1=classz.getDeclaredMethods ();
        for(Method method:methods1){
            System.out.println (methods1);
        }
        // 取得指定的普通方法


    }
}