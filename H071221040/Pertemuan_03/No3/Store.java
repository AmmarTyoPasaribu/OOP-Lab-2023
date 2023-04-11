package No3;

import java.util.ArrayList;

public class Store {
    String name;
    ArrayList<Product> products = new ArrayList<>();

    //constructor
    public Store(String name) {
        this.name = name;
    }

    public void addProduct(Product product){
        products.add(product); //memasukkan product ke dalam array list
    }

    public void ShowAll(){
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d. %s - $%s | Stock %s\n", i+1, products.get(i).getName(), products.get(i).getPrice(), products.get(i).getStock());
        } //untuk menampilkan isi dari array list
    }

    public void sell(User user, int productId){
        if (user.getBalance() >= products.get(productId-1).getPrice()) {
            user.setBalance(user.getBalance() - products.get(productId-1).getPrice()); //mengurangi jumlah uang pembeli sesuai dengan harga produk
            products.get(productId-1).jualProduk();
            System.out.printf("%s berhasil membeli %s\n", user.getNama(), products.get(productId-1).getPrice());
            if (products.get(productId-1).getStock() == 0) {
                products.remove(productId-1); //menghapus produk dari list apabila stok habis
            }
        } else {
            System.out.println("Uang Anda tidak mencukupi");
        }
    }

    //getter
    public String getName() {
        return name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
