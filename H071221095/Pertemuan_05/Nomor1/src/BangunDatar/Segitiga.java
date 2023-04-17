package BangunDatar;

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisi;
    public Segitiga(double alas, double tinggi, double sisi) {
        this.alas=alas;
        this.tinggi = tinggi;
    }

    public double getKeliling() {
        keliling = sisi + tinggi + alas;
        return super.getKeliling();
    }

    public double getLuas() {
        luas = 0.5 * tinggi * alas;
        return super.getLuas();
    }
}
