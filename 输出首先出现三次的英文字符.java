import java.util.Scanner;
public class Test {
public static int function(String str) {
int[] hash = new int[256];
char[] chars = str.toCharArray ( );
for (int i = 0; i < chars.length; i++) {
char ch = chars[i];
if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
hash[ch]++;
if (hash[ch] == 3) {
return ch;
}
}
}
return '0';
}
public static void main(String[] args) {
System.out.println(function("abbdefffg"));
}
}




   
    
    
    
    
    