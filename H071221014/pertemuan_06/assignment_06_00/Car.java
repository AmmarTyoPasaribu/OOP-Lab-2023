package assignment_06_00;

public class Car implements Teknologi {
    private int totalForwardGear;
    private String color;
    private int maxSpeed; 

    public int getTotalForwardGear() {
        return totalForwardGear;
    }

    public void setTotalForwardGear(int totalForwardGear) {
        this.totalForwardGear = totalForwardGear;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
    System.out.println("mobil sedang berakselerasi");
    }
    
}
