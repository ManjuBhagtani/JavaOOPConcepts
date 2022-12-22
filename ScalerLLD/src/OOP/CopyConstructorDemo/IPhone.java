package OOP.CopyConstructorDemo;

public class IPhone {
    public int series;
    public int price;
    public double screen;
    public int ram;
    public int storage;
    public int numberOfCamera;
    public int numberOfPorts;
    public int batterySize;

    public IPhone(int pSeries, int pPrice, int pScreen, int pRam, int pStorage, int pNumberOfCamera, int pNumberOfPorts, int pBatterySize){
        series = pSeries;
        price = pPrice;
        screen = pScreen;
        ram = pRam;
        storage = pStorage;
        numberOfCamera = pNumberOfCamera;
        numberOfPorts = pNumberOfPorts;
        batterySize = pBatterySize;
    }

    public IPhone(IPhone iphone){
        series = iphone.series + 1;
        price = iphone.price + 10000;
        screen = iphone.screen;
        ram = iphone.ram;
        storage = iphone.storage;
        numberOfCamera = iphone.numberOfCamera;
        numberOfPorts = iphone.numberOfPorts;
        batterySize = iphone.batterySize;
    }
}
