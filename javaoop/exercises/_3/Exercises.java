package javaoop.exercises._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        Student student1 = new Student();
        // Write and use your 5 getters and setters!

        student1.setName("Antonio");
        student1.setAge(16);
        student1.setClassAttended("Math");
        student1.setGrade(72.5);
        student1.setHoursMissed(4);

        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getClassAttended());
        System.out.println(student1.getGrade());
        System.out.println(student1.getHoursMissed());
        System.out.println(student1.getFullInfo());
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
        Student student2 = new Student();
        student2.setName("Bob");
        student2.setAge(35);
        student2.setClassAttended("English");
        student2.setGrade(125.99);
        student2.setHoursMissed(-23);


    }

}
