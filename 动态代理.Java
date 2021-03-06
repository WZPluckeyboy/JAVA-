package 反射.反射与代理设计模式;
import java.lang.reflect.InvocationHandler;//实现动态代理的表示
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
interface ISubject1{
    public void eat(String msg,int num);
}
class RealSubject2 implements ISubject1{
    @Override
    public void eat(String msg, int num) {
        System.out.println ("我要吃"+num+"分量的"+msg );
    }
}
//用于增强真是业务类对象的（被代理对象）
class ProxySubject2 implements InvocationHandler{
    private Object target;    //绑定任意接口的对象，使用Object来描述
    //实现真实对象的绑定处理，同时返回代理对象
    public Object bind(Object target){
        this.target=target;
        return Proxy.newProxyInstance ( target.getClass ().getClassLoader (),target.getClass ().getInterfaces (),this );
    }
    public void preHandle(){
        System.out.println ("方法处理前" );
    }
    public  void afterHandle(){
        System.out.println ("方法处理后" );
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {   //动态代理接口所提供的方法
        this.preHandle ();
        Object ret=method.invoke ( this.target,args );
        this.afterHandle ();
        return ret;
    }
}
public class Test{
    public static void main(String[] args) {
        ISubject1 realSubject =new RealSubject2 ();
        ISubject1 subject = (ISubject1) new ProxySubject2 ( ).bind ( new RealSubject2( ) );
        subject.eat ("apple",30);
    }
}