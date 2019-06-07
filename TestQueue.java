package 集合框架库.Map集合;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class TestQueue {
    public static void main(String[] args) {
        Queue <String> queue =new LinkedList <> ( );
        queue.add("JAVA");
        queue.add("python");
       queue.add("C++");
       queue.add("C#");
        System.out.println ("观察栈顶元素："+queue.peek () );
        System.out.println ("取出栈元素："+queue.poll () );
        System.out.println (queue.poll () );
    }
}
