package designPatterns.adapter;

public class Client {
    public static void main(String[] args) {
        PhonePe phone = new PhonePe(new YesBankAdapter());
    }
}
