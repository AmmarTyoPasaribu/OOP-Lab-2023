public class Bola2 extends BangunRuang2 {
    double jarijari;
    public Bola2(double jarijari) {
        super(jarijari);
      
    }


    
    public void luasPermukaanBola(){
        System.out.println("Luas Bola ="+(4*Math.PI*Math.pow(super.sisi2,2)));
    
        System.out.println("Volume Bola ="+((4/3)*Math.PI*Math.pow(super.sisi2, 3)));
    
    }}
    

