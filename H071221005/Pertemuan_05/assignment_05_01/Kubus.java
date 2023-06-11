package H071221005.Pertemuan_05.assignment_05_01;

public class Kubus extends BangunRuang {
    
    public Kubus(double panjang) {
        super(panjang);
    }
    public double LuasKubus(){
        return 6 * (getPanjang()*getPanjang());
    }
    public double VolKubus() {
       return  getPanjang() * getPanjang() * getPanjang();
    }
}
