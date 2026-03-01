package com.example.componantScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main() {

        ApplicationContext context = new ClassPathXmlApplicationContext("componentScanDemo.xml");

        Employee employee = (Employee) context.getBean("employee");

        System.out.println(employee);

    }
}
