class Smartphone implements Teknologi {
    private int price;
    private String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override 
    public void move() {
        System.out.println("Smartphone berpindah");
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }
}
