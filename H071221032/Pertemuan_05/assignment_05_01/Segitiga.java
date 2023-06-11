class Segitiga extends BangunDatar {
    double alas, tinggi, sisi1, sisi2;

    public Segitiga(double alas, double tinggi, double sisi1, double sisi2) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        hitungLuas();
        hitungKeliling();
    }
    void hitungLuas() {
        luas = (alas*tinggi)/2;
    }
    void hitungKeliling() {
        keliling = alas + sisi1 + sisi2;
    }
}