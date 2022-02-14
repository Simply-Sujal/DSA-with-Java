class Car{
    public void start(){System.out.println("Car is starting");}
    public void accelrate(){System.out.println("Car is Accelerating");}
    public void changeGear(){System.out.println("Car is Changing Gear");}
}

class LuxaryCar extends Car{
    @Override
    public void start(){System.out.println("LuxCar is starting");}
    @Override
    public void accelrate(){System.out.println("LuxCar is Accelerating");}
    @Override
    public void changeGear(){System.out.println("LuxCar is Changing Gear");}

    public void openRoof(){System.out.println("Luxcar is open from top");}
}


public class Tut8 {
    public static void main(String[] args) {
        // Car c1 = new Car();
        // c1.start();
        // c1.accelrate();
        // c1.changeGear();

        // LuxaryCar lc1 = new LuxaryCar();
        // lc1.start();
        // lc1.accelrate();
        // lc1.changeGear();
        // lc1.openRoof();

        Car c2 = new LuxaryCar();
        c2.accelrate();
        c2.changeGear();
        c2.start();
    }    
}
