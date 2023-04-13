package Nomor3;

import java.util.ArrayList;

class Store {
    String name;
    ArrayList<Product> products = new ArrayList<>(); //krna mau simpan product kedlm balabla

    public Store(String name) {
        this.name = name;
    }

    //behavior1, utk menambahkan produk
    public void addProduct (Product produk) {
        products.add(produk);

    }

    //behavior2, utk menampilkan 1 produk
    public void tampilkanProduct () {
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d. %s - $%d | Stock %d \n",i+1, products.get(i).getName(), products.get(i).getPrice(), products.get(i).getStock());
        }
    }
    //behavior3, utk memproses transaksi
    public void tampilkanTransaksi (User user, int id) {
        if (user.getBalance() >= products.get(id-1).getPrice()) {
            user.setBalance(user.getBalance() - products.get(id-1).getPrice());
            products.get(id-1).sold();
            System.out.printf("%s berhasil membeli %s.\n", user.getName(), products.get(id-1).getName());
            if (products.get(id-1).getStock()==0){
                products.remove(id-1);
            }
        } else {
            System.out.println("Uang tidak cukup");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    
}
