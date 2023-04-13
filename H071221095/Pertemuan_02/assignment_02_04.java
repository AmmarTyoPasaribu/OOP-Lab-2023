class Produk{
    String id;  //ini atribut 
    String nama;
    int stok;
    int harga;
  
  
    public void  isAvailable(){ //tipe data pengembalian dan accsess modifier
        if (stok > 0) {
          System.out.println("Tersedia");
      
        } else {
          System.out.println("Tidak tersedia");
        }
    }
    public void barang() {
      System.out.println("Nama produk: " + nama);
      System.out.println("Id produk: " + id);
      System.out.println("Jumlah produk: " + stok);
      System.out.println("Harga produk: " + harga);
  
    }
  
    public String getId(){  
        return id;
    }
    public String getNama(){
        return nama;
    }
    public int getStok(){
        return stok;
    }
    public int getHarga(){
        return harga;
    }
  }
  
  public class No3{
    public static void main(String[] args) {
        Produk produk1 = new Produk();
        Produk produk2 = new Produk();
  
        produk1.id = "345";
        produk1.nama = "Baju kaos";
        produk1.stok = 0;
        produk1.harga = 50000;
  
        produk2.id = "678";
        produk2.nama = "Celana pendek";
        produk2.stok = 12;
        produk2.harga = 35000;
  
        
        produk1.barang(); //untuk pemanggilan 
        produk1.isAvailable();
        produk2.barang();
        produk2.isAvailable();
  
    }
  }