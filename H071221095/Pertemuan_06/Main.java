public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(5000000, "Samsung");
        System.out.println("-----Smartphone-----");
        smartphone.move();
        System.out.println("Price: " + smartphone.getPrice());
        System.out.println("Brand: " + smartphone.getBrand());

        Car car = new Car(98, "White", 217);
        System.out.println("\n--------Car--------");
        car.move();
        System.out.println("Forward Gear: " + car.getTotalForwardGear());
        System.out.println("Color: " + car.getColor());
        System.out.println("Max Speed: " + car.getMaxSpeed());

        SiberianHusky sh = new SiberianHusky(0, 48);
        System.out.println("\n---Siberian Husky---");
        sh.move();
        sh.describe();
    }
}
