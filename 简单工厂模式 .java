接口：
interface Computer{
    void printComputer();
}
实现：
class Mac implements  Computer{
  @Override
   public void printComputer() {
    System.out.println ("This is a Mac" );
    }
}
class   Surface implements  Computer{
 @Override
  public void printComputer() {
   System.out.println ("This is a Surface" );
    }
}
class ComputerFactory{
 public static Computer getInstance(String type) {
  Computer computer = null;
   switch(type){
     case "mac":
     computer =new Mac ();
       break;
       case"surface":
        computer=new Surface ();
           break;
         default:
                System.out.println ("请输入正确的电脑型号" );
            break;
        }
        return computer;
    }
}
class Client{
    public void Buycomputer(Computer computer){
        computer.printComputer ();
    }
}
测试：
  public static void main(String[] args) {

        Client client=new Client ();
        Scanner scanner=new Scanner ( System.in );
        System.out.println ("请输入您想要的电脑型号" );
        String type=scanner.nextLine();
        Computer computer= ComputerFactory.getInstance ( type );
        client.Buycomputer ( computer );
    }