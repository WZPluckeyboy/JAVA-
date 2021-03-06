一、JAVA基本知识
1.java ===>编译(javac 文件名.java)---> .class文件(字节码文件)。
一个类只能产生一个class文件
2.运行
java  文件名
查看java反汇编---》javap -c  文件名
形式如：public class HelloBit {
public static void main(String[] args) {
System.out.println("HelloBit");
}
}
3.public：访问修饰限定符    private    protected   默认访问修饰
4.class：修饰类  
5.HelloBit：类名称---》阿里巴巴规约手册--》大驼峰命名法--》
6.HelloBit需要和文件名同名
7.main函数(方法)：
8.static：静态类型
9.带有文字时JAV的编译格式;javac -encoding UTF-8 HelloBit.java
10.String[] args ：====》命令行参数  java xxxxx  参数
11.args.length----》length属于数组的属性
包：--》文件夹--》包的命名：全部小写字母
例如：
com\bit
package com.bit;--->导入包
javac com\bit\类.java
java com.bit.类
12.JAVA中的命名规则
函数，变量的命名--》小驼峰
类名--》大驼峰
包名--》小写
13.常量：
final  int SIZE_ARRAY = 10;
14.int num;//局部变量使用的时候，一定要初始化
}
15.Integer===>包装类---》int-->
16.异常：运行时异常    编译时异常
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at TestDemo1.main(TestDemo1.java:9)
>>   <<    >>>
17.数据类型---》byte char short int float double long boolean
引用：类  接口  枚举   String   数组
18.//数组越界异常  运行时异常		
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
at TestDemo2.main(TestDemo2.java:8)
19.foreach：不能拿到数组的下标 for(int i : array)
for可以拿到数组的下标：array[i]
20.当两个引用  同时指向一块内存的情况：
===》浅拷贝的基础===》两个引用  同时指向一块内存
二、JAVA中的逻辑和结构
1.在JAVA中有三种结构：顺序结构、分支结构、循环结构
2.在JAVA中不能用float,double,long作为switch的参数，但在JAVA中，字符串和枚举可作为其参数
3.在键盘上输入字符的格式（char x=(char) System.in.read())
4.switch开关语句，若case之后没有break，则会满足到case之后的所有语句一直执行到break或全部结束
5.for循环：
格式：for（表达式1；表达式2；表达式3），如表达式2不写，则默认为改循环为死循环。
6.do- while循环：
格式;   do{ 
  循环体
       }while（循环条件）；
一般情况下，若知道循环次数用for循环，不知道次数用while循环；
7.重载(overloade)：函数名相同，参数列表不同，返回值不做要求
三、数组的定义与使用
1.数组：指的是一组相关类型的变量集合，并且这些变量可以按照统一的方式进行操作；
2.格式：数据类型[] 数组名称=new 数据类型[长度]；
3.数组长度：array.length(即数组名.length）；
4.数组属于引⽤用数据类型，因此在使⽤用之前⼀一定要开辟空间（实例例化），否则就会产⽣生
NullPoninterException
5.浅拷贝:当两个引用同时指向一块内存的情况下，可以看作为浅拷贝；
6.用Arrrays写程序，最前面导入包（即import  java.util.Arrays）；
7.数组的打印方式一;
一维数组：System.out.println(Arrays.toString(array));
二维数组：System.out.println(Arrays.deeptoString(array));
8.数组的打印方式二：
一维数组：用for循环：
for （int i=0;i<x.length;i++){
System.out.println(x[i]);
二维数组：
for（int x=0;x<data.length;x++){
for(int y=0;y<data[x].length;y++){
System.out.println(array[i][j]+" "）
}
}
9.可变参数编程
public class qiuhe{
public static int add(int...array){
int sum=0;
int i=0;
for(i=0 ;i < array.length; i++){
sum+=array[i];
}
return sum;
}
public static void main(String[] args){
int a=add(10,20);
int b=add(10,20,30);
int c=add(10,20,30,40);
int[]array={10,20,30};
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(add(array));
System.out.println(add(new int[]{10,20,30,40}));
}
}
10.在JAVA中可以返回一个数组：
例如：public static int[] function() {
        int[] array = {9,8,7,6,5,4,3,2,1};
        return array;
    }
public static void main1(String[] args) {
int[] result = function();
        System.out.println(Arrays.toString(result));
}
11.Arrays的应用：Arrays.binarySearch（array，5）二分查找法;
Arrays.sort(array)    数组排序；
12.数组的拷贝形式：
for循环；克隆（形式如：array2=array.clone())；System.Arraycopy(原数组名，原数组开始下标，拷贝后的数组名，拷贝后数组开始的下标)（拷贝速度最快)；
int i=Arrays.copy（数组名，开始下标）（有返回值需要定义一个数组去接收）
其中这四种拷贝对于基本类型都是深拷贝，对于引用类型都是浅拷贝。




