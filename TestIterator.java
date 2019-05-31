package 集合框架库.集合的输出形式;
import java.util.*;
class Person7 implements Comparable<Person7> {
    private String name;
    private int age;
    private  String[] skill;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Person7 )) return false;
        Person7 person7 = (Person7) o;
        return age == person7.age &&
                Objects.equals ( name, person7.name ) &&
                Arrays.equals ( skill, person7.skill );
    }

    @Override
    public int hashCode() {

        int result = Objects.hash ( name, age );
        result = 31 * result + Arrays.hashCode ( skill);
        return result;
    }
    @Override
    public String toString() {
        return "Person6{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skill=" + Arrays.toString ( skill ) +
                '}';
    }

    @Override

    public int compareTo(Person7 o) {
        if(this.age>o.age){
            return  1;
        }
        else if(this.age<o.age){
            return -1;
        }
        else{
            return this.name.compareTo(o.name);
        }


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

    public String[] getSkill() {
        return skill;
    }
    public void setSkill(String[] skill) {
        this.skill = skill;
    }

}
public class TestIterator {
    public static void main(String[] args) {
        Person7 person1=new Person7 ();
        person1.setName ( "PHP" );
        person1.setAge ( 10 );
        person1.setSkill ( new String[]{"play","eat","drink"} );
        Person7 person2=new Person7 ();
        person2.setAge ( 20 );
        person2.setName ( "JAVA" );
        person2.setSkill ( new String[]{"watch","rap","eat"} );
        Person7 person3=new Person7 ();
        person3.setName ( "python" );
        person3.setAge ( 40 );
        person3.setSkill ( new String[] {"Play","rap","drink"} );
        Person7 person4=new Person7 ();
        person4.setName ( "JAVA" );
        person4.setAge ( 20 );
        person4.setSkill ( new String[]{"watch","rap","eat"} );
        List<Person7> list=new ArrayList <> (  );
        list.add(person1);
        list.add ( person2 );
        list.add ( person3 );
        list.add ( person4 );
        System.out.println (list );
        Iterator<Person7> iterator=list.iterator ();
        while(iterator.hasNext ()){
            Person7 person=iterator.next ();
            System.out.println (person );
        }
    }
}
