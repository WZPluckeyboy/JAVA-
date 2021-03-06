一、String  、 StringBuffer、  StringBuilder的区别和联系：

联系：它们都是操作字符的类
区别： 
1、StringBuffer===》synchronized   但是StringBuilder和String没有， StringBuffer多线程情况下使用，
有synchronized线程安全的关键字
 StringBuilder和 String 没有 synchronized单线程情况下多线程 线程不安全；
 2、拼接上：string每次都会产生新空间，而StringBuffer 、StringBuilder不会产生新空间；

 3.String的拼接底层被优化为StringBuilder，append进行拼接， 结果将会调用StringBuilder的toString()

例如：
class String Zifuchuan {
    public String fun(String[] strings) {
        String str = null;
        for (int i = 0; i < strings.length; i++) {
            //str = str+ strings[i];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(strings[i]);
            str =  stringBuilder.toString();
        }
        return str;
    }
}
public class TestDemo{
public static void main(String[] args) {
        String str = "abc";
        System.out.println(Integer.toHexString(str.hashCode()));
        str = str+"def";
        System.out.println(Integer.toHexString(str.hashCode()));
        str = str+"gh";
        System.out.println(Integer.toHexString(str.hashCode()));
        System.out.println(str);
}
二、Character.isDigit(str.charAt(i)     判断一个字符是否为数字
三、StringIndexOutOfBoundsException 越界 ==》运行时异常
四、replaceFirst（把第一个参数替换为第二个参数）
例如：
public class TestDemo {
 public static void main(String[] args) {
        String str1 = "abcdefbc";//3
        //把第一个参数替换为第二个参数
        String str2 = str1.replaceAll("bc","gg");
        System.out.println(str2);
        String str3 = str1.replaceFirst("bc","gg");
        System.out.println(str3);
    }	
}
五、比较字符串：
 1.（equals）区分大小写的比较
 2.（equalsIgnoreCase)不区分大小写的比较
 3.（compareTo）比较两个字符串的大小关系
例如：
public class TestDemo{
 public static void main4(String[] args) {
        String str1 = "abcdefbc";
        String str2 = "abc";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));
}
六、字符串的查找
1.（contains）判断一个字符串是否存在；
2.  (indexof)从头开始查找字符串的位置，查到了返回位置的开始索引，如果查不到返回-1；
3.（lastIndexOf）从后往前查找；
4.（startsWith）从指定位置判断是否以指定字符串开头；
5.（endsWith）判断是否以指定字符串结尾；
例如：
public class TestDemo{
 public static void main4(String[] args) {
        System.out.println(str1.contains("ac"));
        System.out.println(str1.indexOf("bc",15));
        System.out.println(str1.lastIndexOf("bc",4));
        System.out.println(str1.startsWith("ab",2));
        System.out.println(str1.startsWith("d"));
        System.out.println(str1.endsWith("c"));
        System.out.println(str1.endsWith("bc"));
}
}
七、字符串的替换
1.（replaceAll）替换所有的指定内容；
2.（replaceFirst）替换首个内容；
八、字符串的拆分
1.（split(String regex) 将字符串全部拆分；
2.  (split(String regex,int limit)   将字符串部分拆分，该数组长度就是limit极限；
九、字符串的截取
1.（substring)从指定索引截取到结尾；
2.(substring(int beginIndex,int endIndex)) 截取部分内容；
十、String  和 StringBuffer的相互转换
例如：public class TestDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        String str = new String(stringBuffer);
        System.out.println(str);

        String str2 = stringBuffer.toString();
        System.out.println(str2);
}
}
十一、以（*   \    .      |      ^   :)特殊拆分符，需加“\\"，如”\\|"。