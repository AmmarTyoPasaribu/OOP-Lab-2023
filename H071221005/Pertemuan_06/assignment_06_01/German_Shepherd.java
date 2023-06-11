package H071221005.Pertemuan_06.assignment_06_01;

public class German_Shepherd extends Dog {
    
    public German_Shepherd(int position, int averageLength) {
        super(position, averageLength);
    }
    
    @Override
    public void move(){
        position += 3;
    }
    
    @Override
    public void describe(){
        System.out.println("Kepala Lebar,melancip,Moncong Tajam,Telinga Berdiri");
    }
}
