一、程序异常处理格式
1.public class Mac{
public static void main(String[] args) {
System.out.println ("[1].数学计算开始前" );
try{
System.out.println ("2.进行数学计算："+10/0 );
}
catch(ArithmeticException e){
System.out.println  ("异常已被处理" );
System.out.println ("3.数学计算结束" );
}
}
2.  public class Mac{
public static void main(String[] args) {
 System.out.println ("[1].数学计算开始前" );
 try{
 System.out.println ("2.进行数学计算："+10/0 );
        }
        catch(ArithmeticException e){
3.public class Mac{
    public static void main(String[] args) {
        System.out.println ("[1].数学计算开始前" );
        try{
            System.out.println ("2.进行数学计算："+10/0 );
        }
        catch(ArithmeticException e){
            e.printStackTrace ();
        }
        finally {
            System.out.println ("[finally]不管是否异常，都执行此语句" );
        }
        System.out.println ("3.数学计算结束" );
    }
}
4.public class Mac {
    public static void main(String[] args) {
        System.out.println ( "[1].数学计算开始前" );
        try {
            int x = Integer.parseInt ( args[0] );
            int y = Integer.parseInt ( args[1] );
            System.out.println ( "[2].进行数学计算：" + x / y );
        } catch (ArithmeticException e) {
            e.printStackTrace ( );
        } finally {
            System.out.println ( "[finally]不管是否异常，都执行此语句" );
        }
        System.out.println ( "3.数学计算结束" );
    }
}
二、throws关键字(主方法抛出异常）
public class Mac{
    public static int calculate(int x,int y)throws Exception{
        return x/y;
    }
    public static void main(String[] args)throws Exception{
        System.out.println (calculate ( 10,0 ) );
    }
}
            e.printStackTrace ();
        }
        System.out.println ("3.数学计算结束" );
    }
}
三、throw 关键字（是直接编写在语句中，表示认为异常地抛出
public class Mac{
    public static void main(String[] args) {
        try{
            throw new Exception ( "抛出异常玩玩！" );
        }
        catch(Exception e){
            e.printStackTrace ();
        }
    }
}
  