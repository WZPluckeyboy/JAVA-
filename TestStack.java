package 集合框架库.Map集合;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack <String> stack = new Stack <> ( );
        stack.push ( "A" );
        stack.push ( "B" );
        stack.push ( "C" );
        System.out.println ( stack.peek ( ) );
        System.out.println ( stack.pop ( ) );
        System.out.println ( stack.pop ( ) );
        System.out.println ( stack.pop ( ) );

    }
}
