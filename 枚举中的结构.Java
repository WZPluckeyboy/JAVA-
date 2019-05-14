//枚举类的应用
enum  Color1{
    RED,GREEN,BLUE,WHITE
}
public class Test {
    public static void main(String[] args) {
        System.out.println (Color1.GREEN );
        System.out.println (Color1.RED.ordinal ()+"="+Color1.RED.name () );  //取枚举元素的下标以及元素名
        for(Color1 tmp : Color1.values ()){     //打印枚举类的全部元素
            System.out.println ( tmp.ordinal ()+"="+tmp.name ());
        }
    }
}
//在枚举中定义更多的结构体
enum Color2{
    Red("红色"),Green("绿色"),Blue("蓝色");
    private String title;
    private Color2(String title){
        this.title=title;
    }
    public String toString(){
       return this.title;
    }
}
  class  Test2{
    public static void main(String[] args) {
        System.out.println (Color2.Red );
        for(Color2 tmp : Color2.values ()){
            System.out.println ( tmp.ordinal ()+"="+tmp.toString ());
        }
    }
}