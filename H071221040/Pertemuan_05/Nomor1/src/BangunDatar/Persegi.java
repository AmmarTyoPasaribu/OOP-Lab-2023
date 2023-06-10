package BangunDatar;

public class Persegi extends BangunDatar {
    private int sisi;

    
    public double getLuas() {
        return sisi*sisi;
    }

    public double getKeliling() {
        return 4*sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
}