public class Test {
    public static int isNumeric(String str){
        int count=0;

        for(int i=0;i<str.length ();i++){
          char  data=str.charAt ( i );
            if(data>='0'&&data<='9'){
                count++;
            }
        }
return count;
    }

    public static void main(String[] args) {
        String str="abc21b416u";
        int num=isNumeric ( str );
        System.out.println ("字符串"+str+"中包含的数字为"+num );
    }



    }