package Nomor3;

public class Product {
    String name;
    int price;
    int stock;

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public int getStock(){
        return stock;
    }

    public void sold(){
        this.stock = stock - 1;
    }

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(String name, String price, int stock) {
        this.name = name;
        this.stock = stock;

        if(price.endsWith("k")){ //apakah string plg blkng = k
            this.price = Integer.parseInt(price.substring(0, price.length()-1))*1000;

        } else {
            this.price = Integer.parseInt(price); //utk mengubah string ke int
        }
    }


}
