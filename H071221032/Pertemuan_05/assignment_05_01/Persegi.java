class Persegi extends BangunDatar {
    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
        hitungLuas();
        hitungKeliling();
    }
    void hitungLuas() {
        luas = sisi*sisi;
    }
    void hitungKeliling() {
        keliling = 4*sisi;
    }
}