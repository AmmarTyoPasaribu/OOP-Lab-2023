package BangunRuang;

public class Kubus extends BangunRuang{
    private double sisi;
    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    public double getVolume() {
        volume =  sisi * sisi * sisi;
        return super.getVolume();
    }
    public double getluasPermukaan() {
        luasPermukaan =  6 * sisi * sisi;
        return super.getluasPermukaan();
    }
}
