package 方法的引用.内建函数式接口;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
//1.功能型接口
// y = f(x) : 给入参 x  经过处理 返回结果 y
public class TestDome {
public static void main(String[] args) {
Function<Integer, String> function = (x) -> {
 return String.valueOf(x);   //方法一
        };
        // 以上的方法等价于以下方法
        Function<Integer, String> function1 =String::valueOf;   //方法二
        System.out.println(function1.apply ( 100));
    }
}
//2.供给型接口
//  y = f()  : 函数提过一个结果 y
class TestDome2{
    public static void main(String[] args) {
        Supplier<String> sup=()->{
            return "helloword".toUpperCase ();//大小写的转换，方法一
        };
        // 以上的方法等价于以下方法
        Supplier<String> sup1="hellword"::toUpperCase;//方法二
        System.out.println (sup.get () );
    }
}
//3.消费型接口
//
class TestDome3{
    public static void main(String[] args) {
        Consumer<String>  cons =(x)->{
            System.out.println (x );
        };
      cons.accept ( "你是大牛" );
     // 以上的方法等价于以下方法
        Consumer<String> cons2=System.out::println;
        cons2.accept ( "java大牛");

    }
}
//4.把断言型接口与供给型接口结合使用

class TestDome4{
    public static void predicate(){
        Predicate<String> predicate=(x)->{
            if(x==null){
                return false;
            }
            else {
                return x.length ()>2;
            }
        };
        System.out.println (predicate.test ( "hello" ) );
    }

    public static void main(String[] args) {
      Supplier<String>  supplier= ()->{
          Random random=new Random();
          return String.valueOf ( random.nextInt (200) );
      };
      Predicate<Supplier<String>> predicate=(s)->{
  String value =s.get ();
          System.out.println (value );
          if(value==null){
              return false;
          }
          else{
              return value.length ()>2;
          }
      };
      boolean rs=predicate.test ( supplier );
        System.out.println (rs );
    }

    public static void print(Function<Integer, String> function, Integer p) {
        System.out.println(function.apply(p));
    }

    public static void print(Supplier<?> supplier) {
        System.out.println(supplier.get());
    }
}