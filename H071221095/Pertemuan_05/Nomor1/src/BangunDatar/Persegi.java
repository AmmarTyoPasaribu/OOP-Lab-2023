package BangunDatar;

public class Persegi extends BangunDatar {
    private double sisi;
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    public double getKeliling() {
        keliling = sisi + sisi + sisi + sisi;
        return super.getKeliling();
    }
    public double getLuas() {
        luas = sisi * sisi;
        return super.getLuas();
    }
}
