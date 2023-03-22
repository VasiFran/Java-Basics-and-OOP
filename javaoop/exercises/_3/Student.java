package javaoop.exercises._3;


public class Student {
    private String name;
    private int age;
    private double grade;
    private String classAttended;
    private int hoursMissed;

    public Student(String name, int age){
        System.out.println("Constructing...");
        this.name = name;
        this.age = age;
        System.out.println("Constructed!\n");
    }

    public Student(int age){
        System.out.println("Constructing w/ age...");
        this.age = age;
        System.out.println("Constructed!\n");
    }

    public Student(String name){
        System.out.println("Constructing w/ name...");
        this.name = name;
        System.out.println("Constructed!\n");
    }

    public Student(){
        System.out.println("Constructing w/ nothing...");
        System.out.println("Constructed!\n");
    }
//setters
    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        if(age < 12 || age > 22){
            System.out.println("This student cannot attend this class");
        } else {
            this.age = age;
        }
    }
    void setGrade(double grade){
        if(grade < 0 || grade > 100){
            System.out.println("Invalid grade, choose a number between 0 and 100");
        } else {
            this.grade = grade;
        }

    }

    void setClassAttended (String classAttended){
        this.classAttended = classAttended;
    }

    void setHoursMissed (int hoursMissed){
        if (hoursMissed < 0){
            System.out.println("Invalid number, hours cannot be negative");
        } else {
            this.hoursMissed = hoursMissed;
        }
    }

    String getName(){
        return this.name;
    }

    int getAge(){
        return this.age;
    }

    double getGrade(){
        return this.grade;
    }

    String getClassAttended(){
        return this.classAttended;
    }

    int getHoursMissed(){
        return this.hoursMissed;
    }

    String getFullInfo(){
        return "\nName: " + this.name +
                "\nAge: " + this.age +
                "\nClass: " + this.classAttended +
                "\nLast grade: " + this.grade +
                "\nMissed hours: " + this.hoursMissed;
    }

}
