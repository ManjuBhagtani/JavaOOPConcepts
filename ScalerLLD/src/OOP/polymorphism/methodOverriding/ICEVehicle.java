package OOP.polymorphism.methodOverriding;

public class ICEVehicle extends Vehicle{

    @Override
    public void startEngine(){
        super.startEngine();
        System.out.println("Start ignition and combustion");
        System.out.println("ICE engine started");
    }

    public void blowHorn(){
        System.out.println("Blowing horn in ICEVehicle");
    }
}
