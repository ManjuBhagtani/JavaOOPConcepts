package designPatterns.observer;

public class Client {
    public static void main(String[] args) {
        Amazon a = Amazon.getInstance();

        SCMNotifier scmNotifier = new SCMNotifier();
        CustomerNotifier customerNotifier = new CustomerNotifier();
        SellerNotifier sellerNotifier = new SellerNotifier();
        AnalyticsService analyticsService = new AnalyticsService();

        //Commented below after introducing constructor in Notifier classes.
        //They register themselves with the publisher as soon as their object is created.
        //a.registerOrderPlacedSubscriber(scmNotifier);
        //a.registerOrderPlacedSubscriber(customerNotifier);
        //a.registerOrderPlacedSubscriber(sellerNotifier);
        //a.registerOrderPlacedSubscriber(analyticsService);

        a.orderPlacedEvent();
        System.out.println("------------------------------------");
        a.orderCancelledEvent();
    }
}
