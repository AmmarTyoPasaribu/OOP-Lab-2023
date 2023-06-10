public class Produk {
    String nama;
    int harga;
    int stock;

    public Produk(String nama, int harga, int stock){
        this.nama=nama;
        this.harga=harga;
        this.stock=stock;
    }
    public Produk(String nama, String harga, int stock){
        this.nama=nama;    
        this.stock=stock;

        if (harga.endsWith("k")) {
            this.harga=Integer.valueOf(harga.substring(0, harga.length()-1).trim())*1000;         
        }
        else{
            this.harga=Integer.valueOf(harga);
        }
    }

    public void terjual() {
        this.stock = stock-1;
    }

    public String getNama() {
        return nama;
    }
    public int getHarga() {
        return harga;
    }
    public int getStock() {
        return stock;
    }
}