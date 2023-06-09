public class Bulldog extends Dog {

    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    
    public void describe() {
        System.out.println("Anjing ini memiliki sifat yang ramah, suka bermain, serta dapat bergaul dengan semua orang");
    }

    public void movement(){
        System.out.println("+1 berpindah ke kanan");
    }
}
