package H071221005.Pertemuan_06.assignment_06_01;

public class Siberian_Husky extends Dog{
    
    public Siberian_Husky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move(){
        position += 2;
    }

    @Override
    public void describe(){
        System.out.println("Mirip Serigala,Sangat Energik,Dan Ramah");
    }
}
