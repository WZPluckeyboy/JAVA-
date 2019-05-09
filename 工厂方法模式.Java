接口：
interface Computer {
    void printComputer();
}
 interface ComputerFactory{
     Computer createComputer();
 }
实现：
class MacbookProComputer implements Computer{
    @Override
    public void printComputer() {
        System.out.println ("This is a MacbookPro" );
    }
}
class SurfaceBookComputer implements Computer{
    @Override
    public void printComputer() {
        System.out.println ("This is a SurfaceBook" );
    }
}
class MSFactory implements ComputerFactory{
    @Override
    public Computer createComputer() {
        return new SurfaceBookComputer ();
    }
}
class AppleFactory implements ComputerFactory{
    @Override
    public Computer createComputer() {
      return new MacbookProComputer ();
    }
}
public class Client {
    public void  buyComputer(Computer computer){
        computer.printComputer ();
    }
}
测试：
public static void main(String[] args) {
        Client client=new Client ();
        ComputerFactory factory=new AppleFactory ();
        client.buyComputer ( factory.createComputer () );
    }
}