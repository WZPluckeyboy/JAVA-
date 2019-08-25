package 顺序表和链表.顺序表;

import java.util.Arrays;
public class ISequenceImp implements ISequence {
    private  Object[] elem;
    private int usedSize;
    private  static final int DEFAULT_SIZE=10;//给定默认数组长度
    public ISequenceImp(){
     this.elem=new Object[DEFAULT_SIZE] ;
     this.usedSize=0;
    }

    //在pos位置插入val ,首先得判断下表是否合法，是否是满的顺序表
    public  boolean isFull(){
        if(this.usedSize==this.elem.length){
            return true;
        }
        return false;
    }
    @Override
    public boolean add(int pos, Object data) {
        if(pos<0||pos>this.usedSize){
            return false;
        }
        if(isFull ()){
           this.elem= Arrays.copyOf ( this.elem,2*this.elem.length) ;                  //让数组扩大为原来的二倍
        }
        for(int i=this.usedSize-1;i>pos;i--){
          elem[i+1]=elem[i];
        }
        this.elem[pos]=data;
        usedSize++;
        return true;
    }
    //查找关键字key 找到返回key的下标，没有返回null;
    //首先得判断顺序表是否为空或 key 为null
    public  boolean isEmpty(){
        return this.usedSize==0;
    }
    @Override
    public int search(Object key) {
        if(key==null){
            return -1;
        }
       if(isEmpty ()){
            throw new UnsupportedOperationException ( "不支持异常" );
       }
       for(int i=0;i<this.usedSize;i++){
            if(this.elem[i].equals ( key )){
                return i;
            }
       }
       return -1;
    }
    //查找是否包含关键字key是否在顺序表当中(这个和search有点冲突)
    @Override
    public boolean contains(Object key) {
        if(key==null){
            return false;
        }
        if(isEmpty ()){
            throw new UnsupportedOperationException ( "不支持异常" );
        }
        for(int i=0;i<this.usedSize;i++){
            if(this.elem[i].equals ( key )){
                return true;
            }
        }
        return false;
    }
    //得到pos位置的值
    @Override
    public Object getPos(int pos) {
        if(pos<0||pos>=this.usedSize){
            return null;
        }
        if(isEmpty ()){
            return  null;
        }
        return this.elem[pos];
    }
    //删除第一次出现的关键字key
    @Override
    public Object remove(Object key) {
        int index=search ( key );
        if(index==-1){
            return null;
        }
        Object oldData=this.elem[index];
        int i=0;
       for(i=index; i<this.usedSize-1;i++){
            this.elem[i]=this.elem[i+1];
       }
       this.elem[i+1]=null;
       this.usedSize--;
       return this.elem[index];
    }
    // 得到顺序表的长度
    @Override
    public int size() {
        return this.usedSize;
    }
    //打印顺序表
    @Override
    public void display() {
        for(int i=0;i<this.usedSize;i++){
            System.out.print (this.elem[i]+" " );
        }
        System.out.println ( );
    }
    //清空顺序表以防内存泄漏
    @Override
    public void clear() {
    for(int i=0;i<this.usedSize;i++){
    this.elem[i]=null;
     }
     this.usedSize=0;
    }
}
