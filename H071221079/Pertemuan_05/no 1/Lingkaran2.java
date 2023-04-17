public class Lingkaran2 extends BangunDatar2 {


    public Lingkaran2(double jarijariling) {
        super(jarijariling);
        }


    
        public void luasLingkaran(){
            System.out.println("Luas lingkaran = "+(Math.PI*super.sisi*super.sisi));
            System.out.println("Keliling lingkaran = "+(2*super.sisi*Math.PI));
        }
        
    
    
}