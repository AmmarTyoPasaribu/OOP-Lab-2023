package H071221005.Pertemuan_05.assignment_05_01;

public class Lingkaran extends BangunDatar{
    public Lingkaran(double panjang) {
        super(panjang);
    }
    public double LuasLingkaran() {
        return 3.14 * Math.pow(getPanjang(), 2);
    }
    public double KelLingkaran() {
        return 2 * 3.14 * getPanjang();
    }
}
