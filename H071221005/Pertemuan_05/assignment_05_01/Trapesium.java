package H071221005.Pertemuan_05.assignment_05_01;

public class Trapesium extends BangunDatar {
    public double LuasTrapesium() {
        return ((getA() + getB()) * getTinggi()) / 2;
    }
    public double KelTrapesium() {
        return getA() + getB() + getC() + getD();
    }
}
