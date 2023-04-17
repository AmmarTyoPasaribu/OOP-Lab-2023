package H071221005.Pertemuan_05.assignment_05_01;

public class Trapesium extends BangunDatar {
    double lebar,tinggi;
    
    public Trapesium(double panjang,double lebar,double tinggi) {
        super(panjang);
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
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
    public double LuasTrapesium() {
        return ((getPanjang() + getLebar()) * getTinggi()) / 2;
    }
    public double KelTrapesium() {
        return (getPanjang() + getLebar()) + ( getTinggi() + getTinggi());
    }
}
