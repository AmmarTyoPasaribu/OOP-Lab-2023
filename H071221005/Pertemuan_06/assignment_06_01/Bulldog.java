package H071221005.Pertemuan_06.assignment_06_01;

public class Bulldog extends Dog {
    
    
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }
    
    @Override
    public void move(){
        position += 1;
    }
    @Override
    public void describe(){
        System.out.println("Tubuh Lebar,Moncong Pesek,Berkaki Pendek");
    }
}
