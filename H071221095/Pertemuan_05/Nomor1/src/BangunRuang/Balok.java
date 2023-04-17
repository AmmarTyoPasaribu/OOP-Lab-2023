package BangunRuang;

public class Balok extends BangunRuang{
    private double panjang;
    private double lebar;
    private double tinggi;
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public double getVolume() {
        volume = panjang * lebar * tinggi;
        return super.getVolume();
    }
    public double getluasPermukaan() {
        luasPermukaan = 2 * panjang * lebar + panjang * tinggi + lebar * tinggi;
        return super.getluasPermukaan();
    }
}