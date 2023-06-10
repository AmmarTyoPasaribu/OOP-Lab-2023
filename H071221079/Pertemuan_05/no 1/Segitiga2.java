public class Segitiga2 extends BangunDatar2 {
    double tinggii;
    double sisii;
    double alass;

    public Segitiga2(double alass, double tinggii, double sisii ) {
        super(alass);
        this.tinggii=tinggii;
        this.sisii=sisii;
    
    }

    public void luasSegitiga(){
        System.out.println("Luas Segitiga ="+(super.sisi*tinggii/2));
        System.out.println("Keliling Segitiga ="+(sisii*sisii*sisii));
    }
    
}
