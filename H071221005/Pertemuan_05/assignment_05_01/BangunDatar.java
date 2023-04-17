package H071221005.Pertemuan_05.assignment_05_01;


public class BangunDatar {
    double panjang;
    
    public BangunDatar() {
    }

    public BangunDatar(double panjang) {
        this.panjang = panjang;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void detailBangunDatar(){
        System.out.println("============= BANGUN RUANG =============");
        System.out.println("5. PERSEGi");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. SEGITIGA");
        System.out.println("9. TRAPESIUM");
    }
}

