package 栈和队列.队列;

public interface IMyQueue {
    //判断这个队列是否为空
    boolean empty();
    //返回队首元素但不出队
    int peek();
    //返回队首元素并且出队
    int poll();
    //将item放入队列中
    void add(int item);
    //返回元素个数
    int size();
}
