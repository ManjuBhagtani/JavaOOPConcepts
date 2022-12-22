package OOP.deepAndShallowCopy;

public class Student {
    public String name;
    public int age;
    public double psp;

    public Student(String name, int age, double psp) {
        this.name = name;
        this.age = age;
        this.psp = psp;
    }

    public Student(Student student){
        name = student.name;
        age = student.age;
        psp = student.psp;
    }
}
