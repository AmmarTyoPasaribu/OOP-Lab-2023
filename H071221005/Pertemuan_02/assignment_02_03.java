package H071221005.Pertemuan_02;

class Produk {
    String id;
    String nama;
    int stok;
    int harga;   
    void setID(String id_produk){
        id = id_produk;
    }
    void setnama(String nama_produk){
        nama = nama_produk;
    }
    void setstok(int stok_produk){
        stok = stok_produk;
    }
    void setharga(int harga_produk){
        harga = harga_produk;
    }
    void cekstok(){
        if(stok == 0){
            System.out.println("\n===================");
            System.out.println("Stok Tidak Tersedia");    
            System.out.println("===================");;
        }else{
            System.out.println
            ("\n===================");
            System.out.println("Stok Tersedia");
            System.out.println("===================");
        }
    }
    public void detail(){
    System.out.printf("ID Produk : %s\nNama Produk : %s\nStok : %d\nHarga : Rp.%d",id,nama,stok,harga);
    }
}
public class assignment_02_03 {
    public static void main(String[] args) {
        Produk objekproduk = new Produk();
        objekproduk.setID("A01");
        objekproduk.setnama("Indomie Goreng");
        objekproduk.setstok(10);
        objekproduk.setharga(2500);
        objekproduk.detail();
        objekproduk.cekstok();
    }
}
