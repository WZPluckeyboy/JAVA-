package 集合框架库.集合的输出形式;

import java.util.*;
class Person8 {
    private int age;
    private String name;

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
        return "Person8{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Person8 )) return false;
        Person8 person8 = (Person8) o;
        return age == person8.age &&
                Objects.equals ( name, person8.name );
    }
    @Override
    public int hashCode() {
        return Objects.hash ( age, name );
    }
}

public class TestListIterator {
    public static void main(String[] args) {
        Person8 person1 = new Person8 ( );
        person1.setName ( "PHP" );
        person1.setAge ( 10 );
        Person8 person2 = new Person8 ( );
        person2.setName ( "C++" );
        person2.setAge ( 20 );
        Person8 person3 = new Person8 ( );
        person3.setName ( "pytho" );
        person3.setAge ( 30 );
        Person8 person4 = new Person8 ( );
        person4.setName ( "C++" );
        person4.setAge ( 20 );
        LinkedList <Person8> linkedList = new LinkedList <> ( );
        linkedList.add ( person1 );
        linkedList.add ( person2 );
        linkedList.add ( person3 );
        linkedList.add ( person4 );
        System.out.println ( linkedList );
        System.out.println ( linkedList.contains ( person2 ) );
        linkedList.remove ( person3 );
        ListIterator <Person8> listIterator =linkedList.listIterator (  );
        //从前往后输出
        while (listIterator.hasNext ()){
            Person8 person=listIterator.next ();
            System.out.print ("--->" );
            System.out.print (person );
        }
        System.out.println ("从后往前" );
        while (listIterator.hasPrevious ()){
            System.out.print (listIterator.previous () );
            System.out.print("<--" );
        }
    }
}
