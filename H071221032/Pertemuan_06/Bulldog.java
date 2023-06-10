public class Bulldog extends Dog {
    public Bulldog(int pos, int avgLenght) {
        super(pos, avgLenght);
    }

    public void move() {
        this.position += 1;
    }

    public void describe() {
        System.out.println("Kuat, berotot, dengan hidung yang pendek dan wajah yang hampir rata.");
    }
}

