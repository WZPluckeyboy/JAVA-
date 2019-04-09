一、抽象类
抽象类：包含抽象方法的类  abstract  修饰
1、抽象类不可以被实例化==》 Person p = new Person("bit",10);
2、如果一个非抽象类继承了抽象类，那么这个类必须重写抽象类的
 抽象方法：
3、如果是抽象类继承了抽象类，那么作为派生类的抽象类可以不实现
  基类抽象类的方法：
4、private   abstract   不能同时出现    final :方法  类
5、public > protected > 包访问权限 > private
重写方法的时候：
派生类的访问权限一定要大于等于基类的访问权限
 6、抽象类里面可以包含非抽象方法。
二、模板设计模式
开闭原则（OPC）：一个软件实体如类、模块和函数应该对外开放、对修改关闭。
模板模式是抽象类的一个实际应用场景。
三、以下引例是对抽象类以及模板谁模式的应用：
网上购物过程：
1.浏览商品
2.选择商品
3.客服咨询
4.结算
5.支付
6.配送
7.查看订单
import java.util.Scanner;
abstract class  OnlineShopping{
    public final void  BrowseGoods(){
        System.out.println ("1.浏览商品" );
    }
    public  final void SelectGoods(){
        System.out.println ("2.选择商品" );
    }
    public  abstract void CallService();
    public  final  void ComputerPrice(){
        System.out.println ("4.结算" );
    }
    public abstract void OuderPay();
    public abstract  void SendService();
    public boolean isCallService(){
        return true;
    }
     final void process(){
        BrowseGoods();
        SelectGoods();
        if(isCallService()) {
            CallService ();
        }
         ComputerPrice();
        OuderPay();
        SendService();
    }
   }
   class Skycat extends OnlineShopping {
       @Override
       public void CallService() {
           System.out.println ( "3.您好，天猫客服为你服务！" );
       }
       @Override
       public void OuderPay() {
           System.out.println ( "5.微信支付" );
       }
       @Override
       public void SendService() {
           System.out.println ( "6.圆通配送！" );
       }

       public String Answer() {
           System.out.println ( "是否需要客服服务？ 是：y   不是：n" );
           Scanner scanner = new Scanner ( System.in );
           String str = scanner.nextLine ( );
           return str;
       }
       public boolean isCallService() {
           String str = Answer ( );
           if (str.equals ( "y" )) {
               return true;
           }
           else return false;
       }
   }
public class 购物过程 {
    public static void main(String[] args) {
        Skycat sktcat=new Skycat();
        sktcat.process ();
    }
}
银行业务流程;
1.取号
2.办具体业务
3.业务评价
import java.util.Scanner;
abstract class BankTemplate1 {
public  final void takeNumber(){
    System.out.println ("1.取号" );
}
public  abstract void  transact();
public abstract void evaluate();
public   boolean isEvaluate(){
    return  true;
}
 public    void  process() {
     takeNumber();
     transact();
     if(isEvaluate ()) {
         evaluate();
     }
 }
 }
 class User1 extends  BankTemplate1{
    @Override
    public void transact() {
        System.out.println ("2.存款" );
    }
    @Override
    public void evaluate() {
        System.out.println ("3.业务评价" );
    }
    public String Answer(){
        System.out.println ("是否需要业务评价？ 是：y     否：n" );
        Scanner scanner=new Scanner ( System.in );
        String str=scanner.nextLine ();
        return str;
    }
    public boolean isEvaluate(){
        String str=Answer ();
        if(str.equals ( "y" )){
            return true;
        }
        else return false;
    }
}
class User2 extends  BankTemplate1{
    @Override
    public void transact() {
        System.out.println ("2.取款" );
    }
    @Override
    public void evaluate() {
        System.out.println ("3.业务评价" );
    }
    public String Answer(){
        System.out.println ("是否需要业务评价？ 是：y     否：n" );
        Scanner scanner=new Scanner ( System.in );
        String str=scanner.nextLine ();
        return str;
    }
    public   boolean isEvaluate(){
        String str=Answer ();
        if(str.equals ( "y" )){
            return true;
        }
        else return false;
    }
}
public  class BankTemplate{
    public static void main(String[] args) {
        BankTemplate1 user1=new User1();
        user1.process ();
        System.out.println ("客户1已服务完" );
        BankTemplate1 user2=new User2();
        user2.process ();

    }
}
