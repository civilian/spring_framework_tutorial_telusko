package com.mavin.Telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // OtherTyre ot = (OtherTyre) context.getBean("other_tyre");
        // System.out.println(ot);
        // Tyre t = (Tyre) context.getBean("tyre");
        // System.out.println(t);

        Vehicle obj = (Vehicle) context.getBean("bike");
        obj.drive();
    }
}
