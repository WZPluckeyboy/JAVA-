package com;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {
    private ApplicationContext context=null;
    @Before
    public void initMethod(){
     context=new ClassPathXmlApplicationContext ( new String[]{"applicationContext1.xml"} );
    }
    @Test
    public void testAndB(){
       A a= (A) context.getBean ( "a" );
        System.out.println (a.getWeight () );
        System.out.println (a.getId () );
        System.out.println ( a.getName ());
        System.out.println (a.getB () );
        a.callByMethod ();


    }
}
