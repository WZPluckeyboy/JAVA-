//枚举实现接口
interface  IColor{
    public  String getColor();
     }
     enum Color implements IColor{
    Red("红色"),Green("绿色"),Blue("蓝色"),Whitle("白色");
    private  String title;
    private  Color (String title ){
        this.title=title;
    }
    public String toString(){
        return this.title;
    }
     @Override
     public String getColor() {
         return this.title;
     }
 }
public class Test3 {
    public static void main(String[] args) {
        IColor iColor=Color.Blue;
        System.out.println (  iColor.getColor ());
        System.out.println (iColor.toString () );
    }
}
