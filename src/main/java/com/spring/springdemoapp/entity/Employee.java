package com.spring.springdemoapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    Integer id;
    String name;
    String dept;
    Integer age;
    

    Employee() {
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Employee(String name, String dept, Integer age, Integer id) {
        this.name = name;
        this.dept = dept;
        this.age = age;                 
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;  
    }
}
