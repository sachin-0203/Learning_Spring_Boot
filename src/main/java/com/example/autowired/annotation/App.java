package com.example.autowired.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    static void main() {

//        No need of this XML context
//        ApplicationContext context = new ClassPathXmlApplicationContext("componentScanDemo.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = (Employee) context.getBean("employee");
        Manager manager = (Manager) context.getBean("manager");



        System.out.println(employee);
        System.out.println(manager);
    }
}
