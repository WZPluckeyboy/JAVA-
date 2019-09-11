package 栈和队列.栈;

public class TestMyStack {
    public static void main(String[] args) {
        MyStackImp myStack=new MyStackImp();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.isFull());
        System.out.println(myStack.size());
        System.out.println(myStack.empty());
    }
}
