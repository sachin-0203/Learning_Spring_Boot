package com.loose.coupling;


public class LooseCouplingExample {

    static void main() {
        UserDataProvider userDataProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(userDataProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider userWebServiceProvider = new UserWebServiceProvider();
        UserManager userManagerWithWS = new UserManager(userWebServiceProvider);
        System.out.println(userManagerWithWS.getUserInfo());

    }


}
