class PersegiPanjang extends BangunDatar {
    double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        hitungLuas();
        hitungKeliling();
    }
    void hitungLuas() {
        luas = panjang * lebar;
    }
    void hitungKeliling() {
        keliling = 2*(panjang + lebar);
    }
}