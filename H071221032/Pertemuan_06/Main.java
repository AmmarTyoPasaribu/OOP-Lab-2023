public class Main {
    public static void main(String[] args) {
        Smartphone iPhone13 = new Smartphone(1000, "Apple");
        iPhone13.move();

        Car BMWi8 = new Car(6, 250, "Silver");
        BMWi8.move();

        Bulldog myDog = new Bulldog(0, 65);
        myDog.move();
        myDog.describe();
    }
}
