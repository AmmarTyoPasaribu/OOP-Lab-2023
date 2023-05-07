class Car implements Teknologi {
    private int totalForwardGear;
    private String color;
    private int maxSpeed;

    
    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Mobil Sedang Berakselerasi");
    }

    public int getTotalForwardGear() {
        return totalForwardGear;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
