package com.example.autowired.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Employee {


    private Long EmployeeID;

    @Value("John")
    private String firstName;

    @Value("Doe")
    private String lastName;

    @Value("johnDoe@gmail.com")
    private String email;

    @Value("#{4*10000}")
    private BigDecimal salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Long getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(Long employeeID) {
        EmployeeID = employeeID;
    }

    @Override
    public String toString() {
        return " Employee {" +
                "EmployeeID= " + EmployeeID +
                ", firstName= '" + firstName + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", email= '" + email + '\'' +
                ", salary= " + salary +
                '}';
    }
}
