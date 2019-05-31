package 集合框架库.Comparable接口与Comparator接口;

import java.io.Serializable;
import java.util.*;

class Person6 implements Serializable ,Comparable<Person6> {
    private String name;
    private int age;
    private String[] skill;

    @Override
    public int compareTo(Person6 o) {
        if(this.skill.length>o.skill.length){
            return  1;
        }
       else if(this.skill.length<o.skill.length){
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Person6 )) return false;
        Person6 person6 = (Person6) o;
        return age == person6.age &&
                Objects.equals ( name, person6.name ) &&
                Arrays.equals ( skill, person6.skill );
    }
    @Override
    public int hashCode() {
        int result = Objects.hash ( name, age );
        result = 31 * result + Arrays.hashCode ( skill );
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
}
public class TestComparable {
    public static void main(String[] args) {
      Class cls=Person6.class;
        try {
            Person6 person1= (Person6) cls.newInstance ();
            person1.setName ( "libai" );
            person1.setAge ( 20 );
            String[] str={"rap","song","read","play"};
            person1.setSkill ( str);
            Person6 person2=(Person6) cls.newInstance ();
            person2.setAge ( 30 );
            person2.setName ( "hanxin" );
            String[] strings={"eat","drink","song"};
            person2.setSkill ( strings );
              Person6 person3=(Person6) cls.newInstance ();
              person3.setName ( "lubann" );
              person3.setAge ( 24 );
              person3.setSkill ( new String[]{"slape","write","watch"} );
           Set<Person6> set=new TreeSet<> ( );
           set.add(person1);
           set.add ( person2 );
           set.add ( person3 );
            System.out.println (set );
            Iterator<Person6> iterator=set.iterator ();
            while(iterator.hasNext ()){
               Person6 person=iterator.next ();
               if(person.equals (person2 )){
                   iterator.remove ();
               }
            }
            System.out.println (set );
        } catch (InstantiationException e) {
            e.printStackTrace ( );
        } catch (IllegalAccessException e) {
            e.printStackTrace ( );
        }
    }
}
