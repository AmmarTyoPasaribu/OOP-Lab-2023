public class Bulldog extends Dog {

    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    
    public void describe() {
        System.out.println("Saya anjing yang memiliki tubuh yang lucu");
    }

    public void movement(){
        System.out.println("+1 berpindah posisi ke kanan");
    }
}
