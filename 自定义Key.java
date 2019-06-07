package 集合框架库.Map集合;
//自定义Key，需要覆写equals和hash方法。
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Person{
    private  int age;
    private  String name;
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Person )) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals ( name, person.name );
    }

    @Override
    public int hashCode() {

        return Objects.hash ( age, name );
    }
}
public class 自定义Key {
    public static void main(String[] args) {
        Map<Person,String> map=new HashMap<> ();
        map.put ( new Person (15,"张三"),"zhangsan" );
        System.out.println (map.get ( new Person ( 15,"张三" ) ) );
    }
}
