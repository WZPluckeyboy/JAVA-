package 栈和队列.栈;
public interface IMyStack {
    //将item压入栈中
    void push(int item) throws IllegalAccessException;
    //返回栈顶元素并且出栈
    int pop();
    //返回栈底元素但不出栈
    int peek();
    //判断栈是否为空
    boolean empty();
    //返回元素个数
    int size();
}
