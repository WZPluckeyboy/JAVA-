import java.util.Scanner;

public class ¿ìÀÖÊı {
    public static int function(int n){
        int[] array=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=1;
        }
        int count=0;
        int num=n;
        while(num>1){
            for(int i=0;i<n;i++){
                if(array[i] == 1) {
                    count++;
                    if(count == 3) {
                        array[i] = 0;
                        num--;
                        count=0;//
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if(array[i] == 1) {
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner ( System.in );
             int n=scanner.nextInt ();
        System.out.println (function (n ) );
    }


}