package IO流.System类;

public class 系统输出 {
    public static void main(String[] args) {
        try{
            Integer.parseInt ( "abc" );
        }catch (Exception e){
            System.out.println (e );
            System.err.println (e );
        }
    }
}
