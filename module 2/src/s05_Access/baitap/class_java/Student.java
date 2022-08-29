package s05_Access.baitap.class_java;

import java.util.Scanner;

public class Student {
    private String name = "John";
    private String Class = "CO2";

    public Student () {

    }
    public Student (String name, String Class){
        this.name = name;
        this.Class = Class;
    }
    public void  setName(String name){
        this.name = name;
    }
    public void  setClass(String Class) {
        this.Class =Class;
    }

    public static void main(String[] args) {
        Student sc = new Student();
        String name = "Trịnh Đào Thanh Tuấn";
        sc.setName(name);
        String Class = "A0522I1";
        sc.setClass(Class);
    }
}
