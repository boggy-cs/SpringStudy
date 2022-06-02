package com.spring.ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcTest {
    public static void main(String[] args) {
        // AOPTest.xml 을 읽어 들여서 Bean 을 생성한다
        ApplicationContext context = new ClassPathXmlApplicationContext("AOPTest.xml");

        //id가 proxyCal 인 Bean 에 접근
        Calculator cal = (Calculator) context.getBean("proxyCal");

        // Method 호출 전후로 advice bean 이 적용됨
        cal.add(100, 20);

        System.out.println();

        cal.subtract(100, 20);

        System.out.println();

        cal.multiply(100, 20);

        System.out.println();

        cal.divide(100, 20);

        System.out.println();

        cal.pow(2, 10);

        System.out.println();

        // calculator 2

        Calculator2 cal2 = (Calculator2) context.getBean("proxyCal2");

        System.out.println(cal2.fibonacci(10));

        System.out.println();

        System.out.println(cal2.factorial(10));

        System.out.println();
    }
}

