//泛型上限
class Message<T extends Number>{     //泛型类
    private T message;
    public T getMessage(){
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }
    public  static void fun(Message<? extends Number> tmp){   //泛型方法
        System.out.println (tmp.getMessage () );
    }
}
public class TestDome {
    public static void main(String[] args) {
        Message<Integer>  message =new Message<> ();

message.setMessage (110000  );
Message.fun ( message );
    }
}
//泛型下限
class Message1<T>{  
    private T message;


    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }
    public static void fun(Message1<? super String> temp){    //方法中的内容可以修改但必须符合要求
        temp.setMessage ( "bit" );
        System.out.println (temp.getMessage () );
    }

    public static void main(String[] args) {
        Message1<String> message =new Message1 ();
        message.setMessage ( "Hello Word" );
        Message1.fun ( message );
    }
}

