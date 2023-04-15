package H071221005.Pertemuan_05.assignment_05_01;

public class Segitiga extends BangunDatar {
    public double LuasSegitiga() {
        return (getAlas() * getTinggi()) / 2;
    }
    public double KelSegitiga() {
        return getA() + getB() + getC();
    }
}
