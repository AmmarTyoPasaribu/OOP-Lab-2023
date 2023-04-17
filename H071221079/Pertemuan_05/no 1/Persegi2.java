public class Persegi2 extends BangunDatar2{
    public Persegi2(double sisina){
        super(sisina);
    }
        public void luasPersegi(){
            System.out.println("Luas Persegi = "+(super.sisi*super.sisi));
            System.out.println("Keliling Persegi ="+(4*super.sisi));
    }
}