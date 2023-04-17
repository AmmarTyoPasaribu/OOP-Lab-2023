class Produk  {
    int id;
    String nama;
    int stok;
    double harga;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    public String getStok(){
        if (stok>0){
            return "ada";
        }
        else{
            return "gada";
        }
    }
    public void setHarga(Double harga) {
        this.harga = harga;
    }
    public double getHarga() {
        return harga;
    }

    
}

public class Nomor3 {
    public static void main(String[] args) {
        Produk makanan = new Produk();
        makanan.setId(123);
        makanan.setNama("momogi");
        makanan.setStok(0);
        makanan.setHarga(400.00);


        System.out.println("Id :"+makanan.getId());
        System.out.println("nama : "+makanan.getNama());
        System.out.println("stok :"+makanan.getStok());
        System.out.println("harga :"+makanan.getHarga());
    }
}