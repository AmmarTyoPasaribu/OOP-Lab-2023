package H071221005.Pertemuan_05.assignment_05_01;

import java.lang.Math;
public class Persegi extends BangunDatar {
    public double LuasPersegi() {
        return getPanjang() * getPanjang();
    }
    public double KelPersegi() {
        return Math.pow(getPanjang(), 4);
    }
}
