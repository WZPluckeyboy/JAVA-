package 二叉树.堆;
import 二叉树.堆.IHeap;

import java.util.Arrays;
public class IhhHeapImp implements IHeap {
    private  int[] elem;
    private  int usedSize;
    private static  final int DEFAULT_SIZE=10;
    public IhhHeapImp(){
        this.elem=new int[DEFAULT_SIZE];
        this.usedSize=0;
    }
    //向下调整
    @Override
    public void AdjustDown(int root, int len) {
    int parent=root;
    int child=2*parent+1;
    while (child<len){
        if(child+1<len&&this.elem[child]<this.elem[child+1]){   //
            ++child;
        }
        if(elem[child]>elem[parent]){
            int tmp=elem[child];
            elem[child]=elem[parent];
            elem[parent]=tmp;
            parent=child;
            child=2*parent+1;
        }
        else{
            break;
        }

    }

    }
    //初始化建立大根堆
    @Override
    public void initHeap(int[] array) {
     for(int i=0;i<array.length;i++){
         this.elem[i]=array[i];
         this.usedSize++;
     }
     for(int i=((this.elem.length-1-1)/2);i>=0;i--){
         AdjustDown ( i,this.usedSize );
     }

    }
    //向上调整，从孩子节点开始调整
    @Override
    public void AdjustUp(int child,int len) {
int parent=(child-1)/2;
while(child>0){
    if(this.elem[child]>this.elem[parent]){
        int tmp=elem[child];
        elem[child]=elem[parent];
        elem[parent]=tmp;
        child=parent;
        parent=(child-1)/2;
    }
    else{
        break;
    }
}
    }
    // 插入 item 到堆中
    private boolean isFull(){
        return this.usedSize==this.elem.length;
    }
    @Override
    public void pushHeap(int item) {
    if(isFull ()){
        this.elem=Arrays.copyOf ( this.elem,2*this.elem.length );
    }
    this.elem[this.usedSize]=item;
    this.usedSize++;
    AdjustUp ( usedSize-1,this.usedSize );
    }
    // 返回堆顶元素，删除数据元素
    @Override
    public int popHeap() {
        if(this.usedSize==0){
            throw new  IllegalArgumentException ( "为空" );
        }
        int tmp=this.elem[0];
        this.elem[0]=this.elem[this.usedSize-1];
        this.usedSize--;
        AdjustDown ( 0,this.usedSize );
        return this.elem[0];
    }
    // 返回堆顶元素，不删除数据元素
    @Override
    public int getHeapTop() {
        if(this.usedSize==0){
            throw new  IllegalArgumentException ( "为空" );
        }
        return this.elem[0];
    }
    //堆排序
    @Override
    public void HeapSort() {
int end=usedSize-1;
while(end>0){
    int tmp=this.elem[0];
    this.elem[0]=this.elem[end];
    this.elem[end]=tmp;
    AdjustDown ( 0,end );
    end--;
}
    }
    //打印堆
    @Override
    public void show() {
for(int i=0;i<this.usedSize;i++){
    System.out.print (this.elem[i]+" " );
}
        System.out.println ( " " );
    }
}
