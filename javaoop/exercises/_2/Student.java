package javaoop.exercises._2;

public class Student {
    String name;
    int age;

    public Student (String name, int age){
        System.out.println("Constructing...");
        this.name = name;
        this.age = age;
        System.out.println("Constructed!\n");
    }

    public Student (int age){
        System.out.println("Constructing w/ age...");
        this.age = age;
        System.out.println("Constructed!\n");
    }

    public Student (String name){
        System.out.println("Constructing w/ name...");
        this.name = name;
        System.out.println("Constructed!\n");
    }

    public Student (){
        System.out.println("Constructing w/ nothing...");
        System.out.println("Constructed!\n");
    }




}
