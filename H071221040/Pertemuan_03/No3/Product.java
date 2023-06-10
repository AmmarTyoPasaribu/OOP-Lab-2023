package No3;

public class Product {
    String name;
    int price;
    int stock;

    //getter
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }

    //constructor
    public Product(String name, int price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(String name, String price, int stock){
        this.name = name;
        price = price.replace("k", "000").replace("K", "000"); //untuk mengubah "k" dan "K" menjadi "000"
        Integer numPrice = Integer.parseInt(price); //mengubah string ke int
        this.price = numPrice;
        this.stock = stock;
    }
    
    public void jualProduk() {
        this.stock -= 1; //mengurangi jumlah produk apabila berharsil dibeli
    }
}

