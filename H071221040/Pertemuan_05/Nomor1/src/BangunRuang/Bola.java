package BangunRuang;

public class Bola extends BangunRuang {
    private int jarijari;

    public double getVolume() {
        return Math.PI*(jarijari*jarijari);
    }

    public double getLuasPermukaan() {
        return (4/3)*Math.PI*(jarijari*jarijari*jarijari);
    }

    public void setJarijari(int jarijari) {
        this.jarijari = jarijari;
    }

}
