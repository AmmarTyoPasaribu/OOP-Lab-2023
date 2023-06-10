package BangunRuang;

public class Bola extends BangunRuang{
    private double jariJari;
    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }
    public double getVolume() {
        volume = 4/3 *Math.PI*jariJari*jariJari*jariJari;
        return super.getVolume();
    }
    public double getluasPermukaan() {
        luasPermukaan = 4 * Math.PI*jariJari*jariJari;
        return super.getluasPermukaan();
    } 
}
