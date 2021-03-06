public interface ISequence {
boolean add(int pos,Object data);  //在pos位置插入data
int search(Object key);   //查找关键字key 找到返回key的下标，没有返回-1
boolean contains (Object key) ;  //查找是否包含关键字key是否在顺序表当中(这个和search有点冲突)
Object getPos(int pos);    //得到pos位置的值
Object remove(Object key);   //删除第一次出现的关键字key
int size();                         //得到顺序表的长度
void display();               //打印顺序表
void clear();                 //清空顺序表以防内存泄露
}
import java.util.Arrays;
class MySequenceImp implements ISequence{
private Object[] elem;
private int usedSize;
//默认的顺序表的容量
private static final int DEFAULT_SIZE = 10;
public MySequenceImp(){
this.elem=new Object[DEFAULT_SIZE];
this.usedSize=0;
}
public boolean isFull() {
if (this.usedSize == this.elem.length) {
return true;
}
return false;
}
@Override
public boolean add(int pos, Object data) {         //在pos位置插入data
if (pos < 0 || pos > this.usedSize) {                    //1、pos的合法性   2、是否是满的顺序表
return false;
}
if (isFull ( )) {
this.elem = Arrays.copyOf ( this.elem, this.elem.length * 2 );//让数组扩大原来长度的2倍
}
for(int i=this.usedSize-1;i>=pos;i--){    //挪数据
this.elem[i+1]=this.elem[i];
}
this.elem[pos] = data;
this.usedSize++;
return true;
}
public boolean isEmpty() {
return  this.usedSize==0;
}
public int search(Object key) {
if(key==null){
return -1;
}
if(isEmpty()){
throw new UnsupportedOperationException ( "顺序表为空" );
}
for(int i = 0; i<this.usedSize; i++){
if(this.elem[i].equals ( key )){
return i;
}
}
return -1;
}
@Override
public boolean contains(Object key)；
if(key==null){
return  false;
}
if(isEmpty ()){
throw new UnsupportedOperationException ( "顺序表为空！" );
}
for (int i=0;i<this.usedSize;i++){
if(this.elem[i].equals ( key )){
return true;
}
}
return false;
}
public Object getPos(int pos) {
if(pos<0 ||pos>=this.usedSize || isEmpty ()){
return null;
}
return this.elem[pos];
}
@Override
public Object remove(Object key) {
int index=search ( key );
if(index==-1){
return null;
}
Object oldData=this.elem[index];
int i=0;
for(i=index;i<this.usedSize-1;i++){
this.elem[i]=this.elem[i+1];
}
this.elem[i+1]=null;
this.usedSize--;
return  oldData;
}
@Override
public int size() {
return this.usedSize;
}
@Override
public void display() {
for(int i=0;i<this.usedSize;i++){
System.out.println (this.elem[i]+"" );
}
System.out.println();
}
@Override
public void clear() {
for(int i=0;i<this.usedSize;i++){
this.elem[i]=null;
}
this.usedSize=0;
}
}
public class MySequenceImp1 {
public static void main(String[] args) {
MySequenceImp mySequenceImp=new MySequenceImp ();
mySequenceImp.add(0,18);
mySequenceImp.add ( 1,"hello" ) ;
mySequenceImp.add ( 2,"bit" );
mySequenceImp.add ( 3,99 );
mySequenceImp.display ();
System.out.println ("===========华丽的分割线========" );
System.out.println (mySequenceImp.remove ( "bit" ) );
mySequenceImp.display ();
System.out.println ("===========华丽的分割线=========" );
System.out.println (mySequenceImp.contains ( "wang" ));
System.out.println ("===========华丽的分割线=========" );
mySequenceImp.clear ();
mySequenceImp.display ();;
}
}