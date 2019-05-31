package 集合框架库.Comparable接口与Comparator接口;
import java.util.*;

class  Person{
    private String name;
    private  int age;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Person )) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals ( name, person.name );
    }
    @Override
    public int hashCode() {
        return Objects.hash ( name, age );
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class AscNameCompartor implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName ().substring ( 0,1 ).toUpperCase ().compareTo ( o2.getName ().substring ( 0,1 ) .toUpperCase ());
    }
}
class DescNameCompartor  implements  Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName ().toCharArray ().length-o2.getName ().toCharArray ().length;
    }
}
public class TestComparator {
    public static void main(String[] args) {
        Person person1=new Person ();
        Person person2=new Person ();
        Person person3=new Person ();
        person1.setAge ( 10 );
        person1.setName ( "libai" );
        person2.setAge ( 20 );
        person2.setName ( "hanxin" );
        person3.setAge ( 30 );
        person3.setName ( "luban" );
        Set<Person> set=new TreeSet <> (new AscNameCompartor() );
        set.add ( person1 );
        set.add ( person2 );
        set.add ( person3 );
        System.out.println (set );
        Iterator<Person> iterator=set.iterator ();
        while(iterator.hasNext ()){
            Person person=iterator.next ();
            System.out.println (person );
        }
Set<Person> set1=new TreeSet <> (  new DescNameCompartor ());
set1.add ( person1 );
set1.add ( person2 );
set1.add ( person3 );
        System.out.println (set1 );
    }
}
