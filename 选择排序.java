import java.util.Arrays;
public class Test {
    public static void selectSort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j] < array[i]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] array={10,8,5,25,60,89,54,36};
        selectSort ( array );
        System.out.println ( Arrays.toString ( array) );

    }
}
