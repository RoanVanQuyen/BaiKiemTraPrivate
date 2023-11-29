package Bai_2;

import java.util.Scanner;

public abstract class Person {
    private static int ID = 0 ;
    private int id ;
    private String name;
    private Short age ;
    private Address address ;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person(){}
    Scanner Ip =new Scanner(System.in) ;
    public Person( String name, Short age, Address address) {
        id = ID ;
        ID++;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public abstract String getCapacity() ;
}
