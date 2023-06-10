package BangunRuang;

public class Tabung extends BangunRuang{
    private double jariJari;
    private double tinggi;
    public Tabung(double jariJari, double tinggi) {
    }
    
    public double getVolume() {
        volume = 2*Math.PI*jariJari*(jariJari+tinggi);
        return super.getVolume();
    }

    public double getluasPermukaan() {
        luasPermukaan = Math.PI * jariJari * jariJari * tinggi;
        return super.getluasPermukaan();
    }
}

