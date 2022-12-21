package OOP.ClassDemo;

public class Student {
    String name;
    String address;
    int age;
    String email;
    String batch;
    double psp;
    String state; //course is paused, ongoing, completed

    void solveProblem(){
        System.out.println("Student is solving problems");
        psp++;
    }

    void pauseCourse(){
        System.out.println("Student has paused course");
        state = "PAUSED";
    }
}
