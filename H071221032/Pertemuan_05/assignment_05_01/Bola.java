class Bola extends BangunRuang {
    double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
        hitungLuasPermukaan();
        hitungVolume();
    }

    void hitungLuasPermukaan() {
        luasPermukaan = 4*Math.PI*jariJari*jariJari;
    }

    void hitungVolume() {
        volume = (4.0/3.0)*Math.PI*jariJari*jariJari*jariJari;
    }
}