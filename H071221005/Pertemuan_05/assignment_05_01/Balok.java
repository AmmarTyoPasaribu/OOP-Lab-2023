package H071221005.Pertemuan_05.assignment_05_01;

public class Balok extends BangunRuang {
    public double LuasBalok(){
        return 2 *((getPanjang()*getLebar())+(getPanjang()*getTinggi())+(getLebar()*getTinggi()));
    }

    public double VolBalok(){
        return getPanjang() * getLebar() * getTinggi();
    }
}
