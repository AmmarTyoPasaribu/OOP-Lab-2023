package H071221005.Pertemuan_05.assignment_05_01;

public class Balok extends BangunRuang {
    double lebar,tinggi;
    
    public Balok(double panjang,double lebar,double tinggi) {
        super(panjang);
        this.panjang = panjang;
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

    public double LuasBalok(){
        return 2 *((getPanjang()*getLebar())+(getPanjang()*getTinggi())+(getLebar()*getTinggi()));
    }

    public double VolBalok(){
        return getPanjang() * getLebar() * getTinggi();
    }
}
