package OOP.polymorphism.methodOverloading;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(1,2); //add(int, int)
        c.add(1,2.2); //add(int, double)
        c.add(1.1,2); //add(double, int)
        c.add(1.1, 2.2); //add(double, double)
    }
}
