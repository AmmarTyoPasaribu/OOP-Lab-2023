package assignment_06_00;

public class Car implements Teknologi {
    private int totalForwardGear;
    private String color;
    private int maxSpeed; 

    @Override
    public void move() {
    System.out.println("mobil sedang berakselerasi");
    }
    
}
