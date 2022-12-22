package OOP.passByValVsPassByRef;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Bhanu", 27, 99);
        updateStudent(s); //address of s is passed
        System.out.println(s == null);
        System.out.println(s.age);
    }

    public static void updateStudent(Student obj){
        obj.age = 30;
        obj = null;
    }
}
