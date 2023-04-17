package BangunDatar;

public class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;
    private int sisi;

    double getluas() {
        return 1/2*(alas*tinggi);
    }
    double getkeliling() {
        return 3*sisi;
    }
    public void setAlas(int alas) {
        this.alas = alas;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    
}
