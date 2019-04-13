public class Test {
    public static String stringCompress(String str) { 
        char[] arr = str.toCharArray();     //将字符串转换为字符数组
          StringBuilder arr1 = new StringBuilder();   //新建一个直接累加的数组
         int count = 1;                      //定义一个计数器，用来计算重复字符的个数
         arr1.append(arr[0]);                //放入第一个字符
        char temp = arr[0];                //将目标字符数组的第一个元素作为比较目标存入temp
         for (int j = 1; j < arr.length; j++) {      //遍历字符数组
             if(temp == arr[j]){             //判断数组arr当前对象与比较目标temp是否相等
                 count++;                    //相等计数器加一
                 }
                 else{                           //数组arr当前对象与比较目标temp不相等
                 arr1.append((char)(count + '0'));   //数组arr1下一位存储上一元素的个数
                 arr1.append(arr[j]);        //将新的比较目标存入arr1
                  temp = arr[j];              //更新比较目标temp的值
                  count = 1;                  //计数器置1,，用来计算新的比较目标temp的值
                 }
           }
           arr1.append((char)(count + '0'));//当最后一位与前一位相等时会直接跳出循环，        //这时候需要在循环体外将计数器count的值加到数组的后面
         String str1 = new String(arr1);  //将字符数组转换为字符串
         return str1;    }
         public static void main(String[] args)
         {

             System.out.println(stringCompress("aabbccdaa"));
         }
}