public class Trapesium2 extends BangunDatar2 {
    double tinggiuy;
    double sisisejajar12;
    double sisisejajar13;
    double sisiA;
    double sisiB;
    double sisiC;
    double sisiD;

    public Trapesium2(double tinggiuy,double sisisejajar12,double sisisejajar13, double sisiA,double sisiB,double sisiC,double sisiD) {
        super(tinggiuy);
        this.sisisejajar12=sisisejajar12;
        this.sisisejajar13=sisisejajar13;
        this.sisiA=sisiA;
        this.sisiB=sisiB;
        this.sisiC=sisiC;
        this.sisiD=sisiD;
    
    }
    public void luasTrapesium(){
        System.out.println("Luas Trapesium ="+(1/2*(sisisejajar12+sisisejajar13)*super.sisi));
        System.out.println("Keliling Trapesium ="+(sisiA+sisiB+sisiC+sisiD));
    }
    
}
