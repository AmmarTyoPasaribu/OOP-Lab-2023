public class GermanShepherd extends Dog {

    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    public void describe() {
        System.out.println("Saya anjing yang suka bekerja dan tubuhkan berukuran besar");
    }


    public void movement(){
        System.out.println("+3 berpindah posisi ke kanan");
    }
}
 
