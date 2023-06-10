import java.util.ArrayList;

public class Store {
    String nama;
    ArrayList<Produk> products= new ArrayList<Produk>();

    public void tambahkanProduk(Produk product){
        products.add(product);
    }
    public void tampilkanProduk(){


        for(int i=0;i < products.size();i++){
            System.out.println((i+1)+". "+products.get(i).getNama()+" - "+products.get(i).getHarga()+" | Stok "+products.get(i).getStock());
        }
        System.out.println("0. Keluar");
         
    }

    public Store(String nama){
    this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<Produk> getProducts() {
        return products;
    }

    public void transaksi(User user, Produk produk){
        if (user.getUang()<produk.getHarga()){
            System.out.println("Uangmu gak cukup");
        }
        else {
            user.uang -= produk.getHarga();
            produk.terjual();
            if (produk.getStock()==0){
                products.remove(produk);
            
            }
            System.out.println("Berhasil terjual");
            }
        }
}
    
    // Produk Apel = new Produk("apel",10000,10);
    // products
            
    




    // public String tambahProduk(){
     
    // }

    // public void tampilinProduk(){
    //     System.out.println("---------------CARD--------------"); 
    //     System.out.println(user.getnama());
    // }
    

