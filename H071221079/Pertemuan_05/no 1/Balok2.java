public class Balok2 extends BangunRuang2 {
    double lebar;
    double tinggi;
    public Balok2(double panjang, double lebar, double tinggi) {
        super(panjang);
        this.lebar=lebar;
        this.tinggi=tinggi;
    }

    public void luasPermukaanBalok(){
        System.out.println("Luas Balok ="+(2*(super.sisi2*lebar)*(lebar*tinggi)*(super.sisi2*tinggi)));
        
        System.out.println("Volume balok ="+(super.sisi2*lebar*tinggi));
    }
    
    
}