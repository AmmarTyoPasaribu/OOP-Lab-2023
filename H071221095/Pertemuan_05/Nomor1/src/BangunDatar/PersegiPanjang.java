package BangunDatar;

public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang=panjang;
        this.lebar=lebar;
    }
    public double getKeliling() {
        keliling = 2 * (panjang + lebar);
        return super.getKeliling();
    }
    public double getLuas() {
        luas = panjang * lebar;
        return super.getLuas();
    }
}
