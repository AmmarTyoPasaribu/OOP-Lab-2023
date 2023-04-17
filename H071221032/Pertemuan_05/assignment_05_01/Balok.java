public class Balok extends BangunRuang {
    double panjang, tinggi, lebar;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        hitungLuas();
        hitungVol();
    }

    void hitungLuas() {
        luasPermukaan = 2 * (panjang*lebar + panjang*tinggi + lebar*tinggi);
    }

    void hitungVol() {
        volume = panjang*lebar*tinggi;
    }
}

