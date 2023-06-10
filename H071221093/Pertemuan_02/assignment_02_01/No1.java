public class No1 {
    public String brand;
    public String jenis;
    public String deskripsi;
    public int berat;
    public String harga;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public String getJenis() {
        return jenis;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public float getBerat() {
        return berat;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getHarga() {
        return harga;
    }

    public void infoHarga() {
        System.out.printf("harga %s %s adalah %s \n", jenis, brand, harga);
    }

    public void infoBrand(){
        System.out.printf("deskripsi %s %s : %s", jenis, brand, deskripsi);
    }
}
