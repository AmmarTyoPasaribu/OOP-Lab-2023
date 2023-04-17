class Trapesium extends BangunDatar {
    double sisi1, sisi2, tinggi;

    public Trapesium(double sisi1, double sisi2, double tinggi) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.tinggi = tinggi;
        hitungLuas();
        hitungKeliling();
    }
    void hitungLuas() {
        luas = (sisi1 + sisi2)*tinggi/2;
    }
    void hitungKeliling() {
        keliling = sisi1 + sisi2 + 2 * Math.sqrt(tinggi*tinggi + (sisi1 - sisi2)*(sisi1 - sisi2)/4);
    }
}