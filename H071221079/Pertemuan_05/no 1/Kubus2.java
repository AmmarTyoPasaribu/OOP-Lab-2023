public class Kubus2 extends BangunRuang2 {

    
    public Kubus2(double sisi2) {
        super(sisi2);
    }

    public void luasPermukaankubus(){
         System.out.println("Luas Permukaan kubus = "+(6*(Math.pow(sisi2,2)))) ;
    
        System.out.println("Volume kubus = "+(Math.pow(sisi2,3)));       
    }
}
