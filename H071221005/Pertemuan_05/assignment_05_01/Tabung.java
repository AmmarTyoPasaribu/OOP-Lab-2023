package H071221005.Pertemuan_05.assignment_05_01;

public class Tabung extends BangunRuang {
    public double LuasTabung(){
        return 2 * 3.14 * getJari() * (getJari() + getTinggi());
    }
    public double  VolTabung() {
        return 3.14 * getJari() * getTinggi();
    }
}
