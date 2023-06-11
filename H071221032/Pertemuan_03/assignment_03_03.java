package H071221032.Pertemuan03;
import java.util.ArrayList;
import java.util.Scanner;

class User {
    String name;
    int balance;

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

class Product {
    String name;
    int price, stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(String name, String price, int stock) {
        this.name = name;
        this.price = Integer.parseInt(price.replace("k", "000"));
        this.stock = stock;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void productSold() {
        this.stock -= 1;
    }
}

class Store {
    String name;
    ArrayList<Product> products = new ArrayList<Product>();

    public Store(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product obj) {
        Product newProduct = obj;
        products.add(newProduct);
    }

    public boolean transaction(User objUser, Product objProduct) {
        User user = objUser;
        Product product = objProduct;

        if(user.getBalance() < product.getPrice()) {
            System.out.println("Balance tidak cukup");
            return false;
        }

        user.setBalance(user.getBalance()-product.getPrice()); //mengurangi balance user
        product.setStock(product.getStock()-1); //mengurangi stok produk -1

        if(product.getStock() == 0) {products.remove(product);} //menghapus produk jika stok = 0
        return true;

    }
}

public class assignment_03_03 {
    public static void main(String[] args) {
        Scanner uinput = new Scanner(System.in);

        User Azka = new User("Azka", 1000);
        Store sisfoCell = new Store("Sisfo Cell");
        Product samsungS10 = new Product("Samsung S10", 500, 5);
        Product iPhone12 = new Product("Iphone 12", "1k", 1);

        sisfoCell.addProduct(samsungS10);
        sisfoCell.addProduct(iPhone12);

        while (true) {
            System.out.println("-----CARD-----\n" + Azka.getName() + "\n" + Azka.getBalance() + "\n--------------");
            System.out.println("Selamat Datang di " + sisfoCell.getName() + "\nDaftar Produk:");
            for (int i = 0; i < sisfoCell.getProducts().size();i++) {
                System.out.println(i+1 + ". " + sisfoCell.getProducts().get(i).getName() + " - $" + sisfoCell.getProducts().get(i).getPrice() + " | Stok " + sisfoCell.getProducts().get(i).getStock());
            }
            System.out.print("0. Keluar\n> ");

            int x = uinput.nextInt();
            uinput.nextLine();

            if (x==0) {break;}
            else if ((sisfoCell.getProducts().size()>x-1) && (x>0)) {
                Product selected = sisfoCell.getProducts().get(x-1);
                System.out.println("Apakah anda yakin ingin membeli:\n" + selected.getName() + ", dengan harga $" + selected.getPrice());
                System.out.print("1. Konfirmasi\n2. Batal\n> ");

                x = uinput.nextInt();
                uinput.nextLine();

                if (x==2) {break;}
                else if (x==1) {
                    if (sisfoCell.transaction(Azka, selected)) {
                        System.out.println(Azka.getName() + " berhasil membeli " + selected.getName() + "\n----------------\nLanjutkan Transaksi?");
                        System.out.print("1. Iya\n2. Tidak\n> ");
                        x = uinput.nextInt();
                        uinput.nextLine();
                        if (x==1) {continue;}
                        else {break;}
                    }
                    else {continue;}
                }
                else {continue;}
            }
            else {continue;}
        }
    }
}