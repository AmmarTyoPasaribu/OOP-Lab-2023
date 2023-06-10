public class PersegiPanjang2 extends BangunDatar2 {
    double panjangper;
    double lebarper;

    public PersegiPanjang2(double panjangper, double lebarper ) {
        super(panjangper);
        this.lebarper=lebarper;
    
    }


    
    public void luasPersegiPanjang(){
        System.out.println("Luas Persegi Panjang ="+(super.sisi)*lebarper);
        System.out.println("Keliling Persegi PAnjang ="+(((super.sisi+super.sisi+lebarper+lebarper))));
    }
    
}
