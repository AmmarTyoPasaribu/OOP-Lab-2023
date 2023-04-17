package H071221005.Pertemuan_05.assignment_05_01;

public class Segitiga extends BangunDatar {
    double lebar,tinggi;
    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public Segitiga(double panjang,double lebar,double tinggi) {
        super(panjang);
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public Segitiga(double panjang,double tinggi) {
        super(panjang);
        this.tinggi = tinggi;
    }
    public double LuasSegitiga() {
        return (getPanjang() * getTinggi()) / 2;
    }
    public double KelSegitiga() {
        return getPanjang() + getLebar() + getTinggi();
    }
}
