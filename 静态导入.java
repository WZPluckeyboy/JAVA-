public class MyMath {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException(" b 作为除数不能为 0");
        }
        return a / b;
    }

}
方法一:
import 泛型.静态导入.until.MyMath;
public class TestMyMath1 {
    public static void main(String[] args) {
        System.out.println (MyMath.sum(3,4) );
        System.out.println (MyMath.sub ( 3,4 ) );
        System.out.println (MyMath.div ( 2,1 ) );
        System.out.println (MyMath.div ( 2,2) );
    }
}
方法二：
import static 泛型.静态导入.until.MyMath.*;
public class TestMyMath2 {
    public static void main(String[] args) {
        System.out.println (sum(3,4) );
        System.out.println (sub ( 5,6 ) );
        System.out.println (div ( 5,6 ) );
    }
}
