package assignment_06_00;

public class Smartphone implements Teknologi {
    private int price;
    private String brand;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void move() {
    System.out.println("smartphone berpindah");
    }
    
}
