package BangunDatar;

public class Lingkaran extends BangunDatar {
    private double jariJari;
    
    public Lingkaran(double jariJari) {
        this.jariJari=jariJari;
    }
    public double getKeliling() {
        keliling = 2 * Math.PI * jariJari;
        return super.getKeliling();
    }
    public double getLuas() {
        luas = Math.PI * jariJari * jariJari;
        return super.getLuas();
    }
}
