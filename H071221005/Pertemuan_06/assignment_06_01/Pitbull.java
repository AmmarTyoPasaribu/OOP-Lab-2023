package H071221005.Pertemuan_06.assignment_06_01;

public class Pitbull extends Dog{

    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move(){
        position += 3;
    }
    @Override
    public void describe(){
        System.out.println("Ciri-Ciri : Tubuh Berotot,Gagah,Dan Memiliki Mental Yang Kuat");
    }
}
