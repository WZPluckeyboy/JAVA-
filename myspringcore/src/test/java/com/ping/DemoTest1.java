package com.ping;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest1 {
    private ApplicationContext context;
    @Before
    public  void initMethod(){
       context=new ClassPathXmlApplicationContext ( "applicationContext2.xml" ) ;
    }
    @Test
    public  void  testAANdB(){
        Bean1 bean1=(Bean1)context.getBean ( "bean1" );
        System.out.println ("bean-strVlaue"+bean1.getStrValue () );
        System.out.println ("bean-mapValue"+bean1.getMapValue () );
        System.out.println ("bean-ArrayStr"+bean1.getArrayStr () );
        System.out.println (bean1.getSetValue () );
        System.out.println (bean1.getListValue () );
        System.out.println (bean1.getIntValue () );
        System.out.println (bean1.getDateValue () );
    }
}
