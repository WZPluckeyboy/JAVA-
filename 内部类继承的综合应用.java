package Lianxi;

import java.util.Scanner;

class A{
    private String name;
    public String setName(String name){
        this.name=name;
        return name;
    }
}
class B{
    private int age;
    public int SetAge(int age){
        this.age=age;
        return age;
    }
}
class Out{
    private String school;
    private class Int1 extends A{
        private int age;
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine ( );
        public Int1 (int age ){
            this .age=age;
        }
        public int getAge() {
            return age;
        }

        public String getName(){
            return  super.setName (name);

        }
    }
    private class Int2 extends B{
        private String name;
        Scanner input = new Scanner(System.in);
        int age= input.nextInt ();
        public Int2(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return super.SetAge (age );
        }
        }
        public Out(String school){
        this.school=school;
        }
    Scanner input = new Scanner(System.in);
    int age= input.nextInt ();
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine ( );
         public  String person1() {
             Int1 person1 = new Int1 ( age );
            return ("姓名："+person1.getName ()+"  \t"+"年龄："+person1.getAge ()+"  \t"+"学校："+school+"\t");
         }
         public String person2(){
        Int2 person2=new Int2(name);
        return ("姓名："+person2.getName ()+"  \t"+"年龄："+person2.getAge ()+"  \t"+school+"  \t");
         }
}
public class 内部类与继承 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String school= scanner.nextLine ( );
        Out people=new Out(school);
        System.out.println (people.person1 () );
        System.out.println (people.person2 () );
    }
}
