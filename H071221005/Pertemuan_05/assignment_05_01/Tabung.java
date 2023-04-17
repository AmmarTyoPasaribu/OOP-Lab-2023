package H071221005.Pertemuan_05.assignment_05_01;

public class Tabung extends BangunRuang {
    double tinggi;
    
    public Tabung(double panjang,double tinggi) {
        super(panjang);
        this.tinggi = tinggi;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double LuasTabung(){
        return 2 * 3.14 * getPanjang() * (getPanjang() + getTinggi());
    }
    public double  VolTabung() {
        return 3.14 * getPanjang() * getTinggi();
    }
}
