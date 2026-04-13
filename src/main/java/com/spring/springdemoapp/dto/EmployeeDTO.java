package com.spring.springdemoapp.dto;

public class EmployeeDTO {
    String name;
    String dept;
    String age;

    public void setAge(String age) {
        this.age = age;
    }

    public EmployeeDTO EmployeeMapper(com.spring.springdemoapp.entity.Employee employee) {
        this.name = employee.getName();
        this.dept = employee.getDept();
        this.age = String.valueOf(employee.getAge());
        return this;
    }

    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
    public String getAge() {
        return age;
    }


}
