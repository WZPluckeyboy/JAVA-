import java.util.Stack;
class MyQueue {
  private   Stack <Integer> stack1;
  private   Stack <Integer> stack2;
    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
       this. stack1 = new Stack <Integer> ( );
        this.stack2 = new Stack <Integer> ( );
    }
   //压入元素
    public void push(int x) {

        stack1.push ( x );
    }
   //返回栈顶元素并且出栈
    public int pop() {
        if (stack2.isEmpty ( )) {
            while (!stack1.isEmpty ( )) {
                stack2.push ( stack1.pop ( ) );
            }
            return stack2.pop ( );
        } else {
            return stack2.pop ( );

        }
    }
    //返回栈顶元素但不出栈
    public int peek() {
        if (stack2.isEmpty ( )) {
            while (!stack1.isEmpty ( )) {
                stack2.push ( stack1.pop ( ) );
            }
            return stack2.peek ( );
        } else {
            return stack2.peek ( );
        }
    }
   //判断是否为空
    public boolean empty() {

        return stack1.isEmpty ( ) && stack2.isEmpty ( );
    }
}
public class 用栈实现队列 {
    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue ();
myQueue.push ( 10 );
        myQueue.push ( 20);
        myQueue.push ( 30 );
        myQueue.push ( 40);
        System.out.println ( myQueue.peek ());
        System.out.println (myQueue.pop () );
    }
}
