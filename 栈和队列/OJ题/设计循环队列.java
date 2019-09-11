package 栈和队列.OJ题;
public class 设计循环队列 {
    private  int front;//队头下表
    private  int rear; //队尾下标
     private  int[] elem;//数组
     private  int usedSize;//有效数据的个数
     public  设计循环队列(int k){
         this.elem=new int[k];
         this.front=0;
         this.rear=0;
         this.usedSize=0;
     }
     //入队
     public  boolean enQueue(int value){
         if(isFull()){
             return false;
         }
         this.elem[this.rear]=value;
         this.rear=(this.rear+1)%this.elem.length;
         this.usedSize++;
         return true;
     }
     //出队
     public boolean deQueue(){
         if(isEmpty()){
             return  false;
         }
         this.front=(this.rear+1)%this.elem.length;
         this.usedSize--;
         return true;
     }
     //得到队头的元素
     public int Front(){
         if(isEmpty()){
             return  -1;
         }
         return  this.elem[this.front];
     }
     //得到队尾的元素
    public int Rear(){
       if(isEmpty()) {
           return -1;
       }
       int index=this.rear==0?this.elem.length-1:this.rear-1;
       return  this.elem[index];
    }
    //是否为空
    public boolean isEmpty(){
        return this.front==this.rear;
    }
    //是否为满
    public  boolean isFull(){
         if((this.rear+1)%this.elem.length==this.front){
             return  true;
         }
         return  false;
    }

}
