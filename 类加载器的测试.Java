import java.lang.reflect.Method;
public class Member {
    public  String toString(){
        return "this is a native D plante";
    }
}
        public class TestClassLoader {
        public static void main(String[] args)  {
        Class membercls=Member.class;
        System.out.println (membercls.getClassLoader () );
        System.out.println (membercls.getClassLoader ().getParent () );
        System.out.println (membercls.getClassLoader ().getParent ().getParent () );
        //测试Object
        Class cls=Object.class;
        System.out.println (cls );
        Method[] methods=cls.getMethods ();
        for(Method method:methods){
            System.out.println (method );
        }
    }
}
