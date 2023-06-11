package H071221005.Pertemuan_06.assignment_06_01;

public class Samsung implements Smartphone {

    protected int price;
    protected String brand;

    public Samsung(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

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
    public void move(){
        System.out.println("Smartphone Berpindah");
    }
}
