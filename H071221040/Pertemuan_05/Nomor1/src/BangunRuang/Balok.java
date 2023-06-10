package BangunRuang;

public class Balok extends BangunRuang {
    private int panjang;
    private int lebar;
    private int tinggi;

    public double getVolume() {
        return panjang*lebar*tinggi;
    }

    public double getLuasPermukaan() {
        return 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

}