public class Car implements GPS {
    int totalForwardGear, maxSpeed;
    String Color;

    public Car(int totalForwardGear, int maxSpeed, String color) {
        this.totalForwardGear = totalForwardGear;
        this.maxSpeed = maxSpeed;
        Color = color;
    }

    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}
