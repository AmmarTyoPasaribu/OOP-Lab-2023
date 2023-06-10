package BangunDatar;

public class Trapesium extends BangunDatar {
    private double tinggi;
    private double alas;
    private double sisimiring;
    private double atas;
    public Trapesium(double tinggi, double alas, double sisimiring, double atas) {
        this.tinggi = tinggi;
        this.alas= alas;
        this.sisimiring = sisimiring;
        this.atas = atas;
    }
    
    public double getKeliling() {
        keliling = alas+sisimiring*2 + atas;
        return super.getKeliling();
    }
    public double getLuas(){
        luas = (alas + atas * tinggi)/0.5;
        return super.getLuas();
    }
}