package 栈和队列.栈;

public class MyStackImp implements IMyStack {
    private  int[] elem;
    private  int top;//保存当前可存放的元素的下标
    private  int usedSize;
    private  static final  int DEFAULT_SIZE=10;
    public  MyStackImp(){
        this.elem=new int[DEFAULT_SIZE];
        this.top=0;
        this.usedSize=0;
    }
    public  boolean isFull(){
        if(this.top==elem.length){
            return true;
        }
       else return false;
    }
    //将item压入栈中
    @Override
    public void push(int item)  {
      if(isFull()){
         throw new IllegalArgumentException("栈为满的");
      }
      this.elem[this.top]=item;
      top++;
      this.usedSize++;
    }

    @Override
    public int pop() {
       if(empty()){
           throw new IllegalArgumentException("栈为空");
       }
       int data=this.elem[this.top-1];
       --this.top;
        this.usedSize--;
       return  data;

    }

    @Override
    public int peek() {
        if(empty()){
            throw new IllegalArgumentException("栈为空");
        }
        int data=this.elem[this.top-1];
        return  data;
    }

    @Override
    public boolean empty() {
      if(this.top==0){
          return true;
      }
      else return false;
    }

    @Override
    public int size() {
        return this.usedSize;
    }
}
