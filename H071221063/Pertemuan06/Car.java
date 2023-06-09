public class Car implements Move {
    int maxSpeed; 
    int totalForwardGear;
    String color;

    public Car(int maxSpeed, int totalForwardGear, String color){
        this.maxSpeed = maxSpeed;
        this.totalForwardGear = totalForwardGear;
        this.color = color;
    }


    public void movement() {
        System.out.println("Mobil sedang berakselerasi");
    }

}
