class Lingkaran extends BangunDatar {
    double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
        hitungLuas();
        hitungKeliling();
    }
    void hitungLuas() {
        luas = Math.PI*jariJari*jariJari;
    }
    void hitungKeliling() {
        keliling = 2*Math.PI*jariJari;
    }
}
