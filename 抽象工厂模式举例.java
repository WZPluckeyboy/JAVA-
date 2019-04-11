package 抽象工厂模式;

public interface Computer {
    void printComputer();
}
class MacbookProcComputer implements Computer{
    @Override
    public void printComputer() {
        System.out.println ("这是一个苹果电脑！" );

    }
}
class SurfacebookComputer implements  Computer{
    @Override
    public void printComputer() {
        System.out.println ("这是一个外星人笔记本电脑！" );

    }
}
interface  OperateingSystem{
    void printSystem();
}
class MacSystem implements OperateingSystem{
    @Override
    public void printSystem() {
        System.out.println ("这是一个苹果系统！" );
    }
}
class SurfaceSystem implements OperateingSystem{

    @Override
    public void printSystem() {
        System.out.println ("这是一个外星人系统！" );
    }
}
interface ProductionFactory{
    Computer createComputer();
    OperateingSystem createSystem();

}
class AppleFactory implements ProductionFactory{
    @Override
    public Computer createComputer() {
        return new MacbookProcComputer ();
    }
    @Override
    public OperateingSystem createSystem() {
        return new MacSystem ();
    }
}
 class AlineFactory implements ProductionFactory{

     @Override
     public Computer createComputer() {
         return new SurfacebookComputer ();
     }

     @Override
     public OperateingSystem createSystem() {
         return new SurfaceSystem ();
     }
 }
 class Client{
    public  void buyComputer(Computer computer){
        computer.printComputer ();
    }
    public void use(OperateingSystem s){
        s.printSystem ();
    }
}
public class Test {
    public static void main(String[] args) {
     ProductionFactory factory=new AppleFactory ();
     Client client =new Client ();
     client.buyComputer ( factory.createComputer () );
     client.use ( factory.createSystem() );

        };

    }
