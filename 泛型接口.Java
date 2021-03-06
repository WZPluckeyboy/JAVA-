//在子类继承时继续使用泛型,new对象时再给具体类型
public interface IMessage<T> {
    public void print(T t);
}
 class IMessageImpl<T> implements IMessage<T>{
    @Override
    public void print(T t) {
        System.out.println (t );
    }

    public static void main(String[] args) {
      IMessage<String> msg=new IMessageImpl <> ();
      msg.print ( "hello zhuzhu" );
    }

}

//在子类实现接口时直接给具体类型
public interface IMessage<T> {
    public void print(T t);
}
class IMessageImpl2 implements IMessage<Integer>{

    @Override
    public void print(Integer integer) {
        System.out.println (integer );
    }

    public static void main(String[] args) {
      IMessage msg=new  IMessageImpl2 ();
      msg.print ( 1000 );
    }
}