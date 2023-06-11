class Kubus extends BangunRuang {
    double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
        hitungLuasPermukaan();
        hitungVolume();
    }

    void hitungLuasPermukaan() {
        luasPermukaan = 6*sisi*sisi;
    }

    void hitungVolume() {
        volume = sisi*sisi*sisi;
    }
}