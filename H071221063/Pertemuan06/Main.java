public class Main {
    public static void main(String[] args) {

        Pitbull dog = new Pitbull(0, 50);
        System.out.println("position = "+dog.position);
        System.out.println("averagelengthna = "+dog.averageLength);
        dog.describe();
        dog.movement();
        System.out.println("");



        Smartphone hp = new Smartphone(2000000, "vivo");
        System.out.println("Merk : " + hp.brand);
        System.out.println("Harga Hp : " + hp.price);
        hp.movement();
        System.out.println("");


        Car car = new Car(50, 5, "blue");
        System.out.println("Kecepatan Maksimal mobil adalah : " + car.maxSpeed);
        System.out.println("Gear mobil ada " + car.totalForwardGear);
        System.out.println("Mobil berwarna " + car.color);
        car.movement();
        System.out.println("");

    }
    
}
