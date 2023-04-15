package H071221005.Pertemuan_05.assignment_05_01;

public class Lingkaran extends BangunRuang{
    public double LuasLingkaran() {
        return 3.14 * Math.pow(getJari(), 2);
    }
    public double KelLingkaran() {
        return 2 * 3.14 * getJari();
    }
}
