package com.loose.coupling;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {

    static void main() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIOCLooseCouplingExample.xml");

//        UserDataProvider userDataProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerWithUserDatabaseProvider");
        System.out.println(userManagerWithDB.getUserInfo());

//        UserDataProvider userWebServiceProvider = new UserWebServiceProvider();
//        UserManager userManagerWithWS = new UserManager(userWebServiceProvider);
//        System.out.println(userManagerWithWS.getUserInfo());

        UserManager userManagerWithWS = (UserManager) context.getBean("userManagerWithUserWebService") ;
        System.out.println(userManagerWithWS.getUserInfo());

    }


}
