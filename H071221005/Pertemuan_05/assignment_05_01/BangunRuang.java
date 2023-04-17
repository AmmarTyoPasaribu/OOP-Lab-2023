package H071221005.Pertemuan_05.assignment_05_01;

public class BangunRuang{
    double panjang;

    public BangunRuang() {
    }

    public BangunRuang(double panjang) {
        this.panjang = panjang;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void detailBangunRuang(){
        System.out.println("============= BANGUN RUANG =============");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG\n");
    }
    
}