package designPatterns.builder;

public class Main {
    public static void main(String[] args) throws Exception {
        Student s = Student.builder()
                .setId(1)
                .setPsp(81)
                .setName("Neha")
                .setGradYear(2018)
                .setYoe(5)
                .setAge(24)
                .build();

        System.out.println(s.getName());
        System.out.println(s.getAge());

        Student s2 = Student.builder()
                .setId(2)
                .setPsp(88)
                .setName("Manju")
                .setGradYear(2024)
                .setYoe(1)
                .setAge(26)
                .build();

        System.out.println(s2.getName());
        System.out.println(s2.getAge());
    }
}
