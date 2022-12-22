package OOP.passByValVsPassByRef;

public class Student {
    public String name;
    public int age;
    public double psp;

    public Student(String name, int age, double psp) {
        this.name = name;
        this.age = age;
        this.psp = psp;
    }

    public Student(OOP.deepAndShallowCopy.Student student){
        name = student.name;
        age = student.age;
        psp = student.psp;
    }
}
