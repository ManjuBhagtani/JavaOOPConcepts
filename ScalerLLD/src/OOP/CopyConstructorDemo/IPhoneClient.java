package OOP.CopyConstructorDemo;

public class IPhoneClient {
    public static void main(String[] args) {
        IPhone iphone11 = new IPhone(11, 60000, 6, 4, 64, 2, 2, 4000);
        IPhone iphone12 = new IPhone(iphone11);
    }
}
