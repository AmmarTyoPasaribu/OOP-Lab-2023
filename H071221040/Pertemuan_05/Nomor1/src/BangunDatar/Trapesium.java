package BangunDatar;

public class Trapesium extends BangunDatar {
    private int alas1;
    private int alas2;
    private int tinggi;
    private int rusuk1;
    private int rusuk2;

    double getluas() {
        return 1/2*(alas1+alas2)*tinggi;
    }
    double getkeliling() {
        return rusuk1+rusuk2+alas1+alas2;
    }
    public void setAlas1(int alas1) {
        this.alas1 = alas1;
    }
    public void setAlas2(int alas2) {
        this.alas2 = alas2;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public void setRusuk1(int rusuk1) {
        this.rusuk1 = rusuk1;
    }
    public void setRusuk2(int rusuk2) {
        this.rusuk2 = rusuk2;
    }

}
