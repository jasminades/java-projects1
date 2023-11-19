package SolarToyCar;

public class ToyCar {
    protected double batteryLevel;
    protected final double fullBattery = 1000;

    public ToyCar(){
        batteryLevel = fullBattery;
    }

    public void forward(double distance){
        System.out.println("Go forward for " + distance + " meters");
        batteryLevel -= distance;
    }

    public void turn(Direction dir, double angle){
        System.out.println("Turn " + dir + " by " + angle + " degrees");
        batteryLevel -= angle;
    }

    public double getBattery(){
        return batteryLevel;
    }
    public void chargeBattery(){
        System.out.println("Charge battery from wall socket");
        batteryLevel = fullBattery;
    }

}
