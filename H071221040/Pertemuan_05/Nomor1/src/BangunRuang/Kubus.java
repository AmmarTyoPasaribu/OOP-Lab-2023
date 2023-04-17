package BangunRuang;

public class Kubus extends BangunRuang {
    private int sisi;

    public double getVolume(){
        return sisi*sisi*sisi;
    }

    public double getLuasPermukaan() {
        return 6*(sisi*sisi);
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
}
