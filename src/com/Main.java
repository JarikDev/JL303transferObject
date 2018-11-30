package com;

public class Main {
    public static void main(String[] args) {
        BusinessObject businessObject=new BusinessObject();
        System.out.println(businessObject.getUser().getName());
    }
}

//transfer object
class User {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class ServiceEJB {
    public User getUser() {
       User user=new User();
       user.setName("Jarik");
        return user;
    }
}
interface Service{}
class ServiceJMX {
    public User getUser() {
        User user=new User();
        user.setName("Jarik");
        return user;
    }
}

class BusinessObject {
    ServiceEJB serviceEJB = new ServiceEJB();

    public User getUser() {
        return serviceEJB.getUser();
    }
}






















