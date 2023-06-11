package H071221005.Pertemuan_05.assignment_05_01;

public class PersegiPanjang extends BangunDatar {
    double lebar;
    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public PersegiPanjang(double panjang,double lebar) {
        super(panjang);
        this.lebar = lebar;
    }
    public double LuasPersegiPanjang() {
        return getPanjang() * getLebar();
    }
    public double KelPersegiPanjang() {
        return (2 * getPanjang()) + (2 * getLebar());
    }
}
