package OOP.deepAndShallowCopy;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rajiv", 25, 98);
        Student s2 = s1;
        Student s3 = new Student(s1);

        s1.age = 28;
        s2.age = 30;
        System.out.println(s1.age);
    }
}
