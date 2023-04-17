package BangunRuang;

public class Tabung extends BangunRuang {
    private int tinggi;
    private int jarijari;

    public double getVolume() {
        return Math.PI*(jarijari*jarijari)*tinggi;
    }

    double getluasPermukaan() {
        return (2*Math.PI*jarijari*tinggi) + (2*Math.PI*(jarijari*jarijari));
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void setJarijari(int jarijari) {
        this.jarijari = jarijari;
    }
    
}