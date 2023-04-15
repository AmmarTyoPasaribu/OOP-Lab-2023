package H071221005.Pertemuan_05.assignment_05_01;

public class PersegiPanjang extends BangunDatar {
    public double LuasPersegiPanjang() {
        return getPanjang() * getLebar();
    }
    public double KelPersegiPanjang() {
        return (2 * getPanjang()) + (2 * getLebar());
    }
}
