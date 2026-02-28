package com.loose.coupling;

public class UserWebServiceProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "This is Web Services Provider";
    }
}
