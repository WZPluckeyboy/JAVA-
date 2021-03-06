//两个队列实现一个栈
package Lianxi.队列的实现;
import java.util.Queue;
import java.util.LinkedList;
 class MYTestquenue {
 private Queue <Integer> queue1;
 private Queue <Integer> queue2;
 private int usedSize;
//类的构造方法
 public MYTestquenue() {
 queue1 = new LinkedList <> ( );
 queue2 = new LinkedList <> ( );
 this.usedSize=0;
 }
/**************************************************/
     //入栈
 public void push(int x) {
  if (queue1.peek ( ) != null) {
  queue1.add ( x );
   }
 else if (queue2.peek ( ) != null) {
   queue2.add ( x );
         } else {
             queue1.add ( x );
         }
         this.usedSize++;
     }
/****************************************************/
     //返回栈顶元素并出栈
     public int pop() {
         if (empty ( )) {
             return -1;
         }
         int data = 0;
         if (queue1.peek ( ) != null) {
             for (int i = 0; i < this.usedSize - 1; i++) {
                 queue2.add ( queue1.poll ( ) );
             }
             data = queue1.poll ( );
         } else {
             for (int i = 0; i < this.usedSize - 1; i++) {
                 queue1.add ( queue2.poll ( ) );
             }
             data = queue2.poll ( );
         }
         this.usedSize--;
         return data;
     }
 /***********************************************************/    
//返回栈顶元素不出战
     public int top() {
         if (empty ( )) {
             return -1;
         }
         int data = 0;
         if (queue1.peek ( ) != null) {
             for (int i = 0; i < this.usedSize - 1; i++) {
                 queue2.add ( queue1.poll ( ) );
             }
             data = queue1.poll ( );
         } else {
             for (int i = 0; i < this.usedSize - 1; i++) {
                 queue1.add ( queue2.poll ( ) );
             }
             data = queue2.poll ( );
         }
         return data;
     }
  /**********************************************************/   
//判断栈是否为空
     public boolean empty() {
         return this.usedSize == 0;
     } 
 /***********************************************************/    
     // 返回元素个
     public int size() {
         return this.usedSize;
     }
 }
/**************************************************************
***************************************************************
***************************************************************
****************************************************************/
//main对程序的调试
public class MYTestquenuetest {
    public static void main(String[] args) {
        MYTestquenue stack=new MYTestquenue ();
        stack.push ( 10 );
        stack.push ( 20 );
        stack.push ( 30 );
        stack.push ( 40 );
        stack.push ( 50 );
        System.out.println (stack.size ());
        System.out.println (stack.pop () );
    }
}

