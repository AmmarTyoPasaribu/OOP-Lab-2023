package H071221005.Pertemuan_03;

import java.util.Scanner;
import java.util.ArrayList;
class User{
    String name;
    int balance;
   
    public User(String name,int balance){
        this.name = name;
        this.balance = balance; 
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    
    
}

class Product{
    String name;
    int price,stock;
    
    public Product(String name,int price,int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public int getStock(){
        return stock;
    }

    public void Terjual(){
       this.stock -= 1;
    }    
    
}
class Store{
    String name;
    ArrayList<Product> daftar  = new ArrayList<>();
   
    public Store(String name){
        this.name= name;
    }
    public void addproduct(Product product) {
        daftar.add(product);
    }
   
    public void terjual(User user,int productid){
        if(user.getBalance() >=  daftar.get(productid-1).getPrice()){
            System.out.println("\nPembelian Berhasil");
            daftar.get(productid-1).Terjual();
            user.balance -= daftar.get(productid-1).getPrice();
            if(daftar.get(productid-1).getStock() == 0){
                daftar.remove(productid-1);
            }
        }else{
            System.out.println("\nPembelian Gagal, Uang Tidak Cukup");
            
        }
    }
    public void details(){
        for (int i = 0; i < daftar.size(); i++) {
            System.out.printf("\n%d. %s - Rp.%d | Stock: %d",i+1,daftar.get(i).getName(), daftar.get(i).getPrice(), daftar.get(i).getStock());
            }
        }
    }        
public class assignment_03_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User objekUser = new User("Raehan", 10000000);
        Product objekProduct1 = new Product("Oppo F15", 2000000, 2);   
        Product objekProduct2 = new Product("Samsung Fold 3", 3500000, 3);   
        Product objekProduct3 = new Product("Iphone 7", 10000000, 9);   
        
        Store objekStore = new Store("Toko HP Sejahtera");
        objekStore.addproduct(objekProduct1);
        objekStore.addproduct(objekProduct2);
        objekStore.addproduct(objekProduct3);
        objekStore.addproduct(new Product("Asus 3 Pro", 4000000, 5));
        System.out.println("===========Profil Anda============");
        System.out.printf("%s\nRp.%d",objekUser.getName(),objekUser.getBalance());
        System.out.print("\n==============================");
        System.out.println("\nSelamat Datang Di Jaya Store");
        System.out.print("==============================");
        System.out.print("\nDaftar HP :");
        
        objekStore.details();
        

        System.out.print("\n0. Keluar");
        System.out.print("\nPilih : ");
        int input = sc.nextInt();
        while (input != 0){
            System.out.print("=====================================");
            System.out.printf("\nApakah anda yakin ingin membeli:\n%s, Dengan Harga Rp.%d",objekStore.daftar.get(input-1).getName(),objekStore.daftar.get(input-1).price);
            System.out.print("\n1. Konfirmasi\n2. Batal");
            System.out.print("\nPilih : ");
            int input1 = sc.nextInt();
            if(input1 == 1){
                System.out.print("==============================");
                objekStore.terjual(objekUser, input);
                System.out.print("==============================");
                System.out.println("\nApakah ingin Kembali ke Daftar HP?");
                System.out.println("1. Ya\n2. Tidak");
                System.out.print("Pilih : ");
                int input2 = sc.nextInt();
                if(input2 == 1){
                    System.out.print("\n==============================\n");
                    System.out.printf("%s\nRp.%d",objekUser.getName(),objekUser.getBalance());
                    System.out.print("\n==============================");
                    System.out.println("\nSelamat Datang Di Jaya Store");
                    System.out.print("==============================");
                    objekStore.details();
                    System.out.print("\n0. Keluar\n");
                    System.out.print("Pilih : ");
                    input=  sc.nextInt(); 
                    
                }else{
                    break;
                }
            }else if(input == 2){
                break;
            } 
            
        }
        System.out.print("==============================");
        System.out.println("\nTerima Kasih");
        sc.close();   
    }
}
               
            