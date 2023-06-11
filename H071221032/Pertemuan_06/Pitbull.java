public class Pitbull extends Dog {
    public Pitbull(int pos, int avgLenght) {
        super(pos, avgLenght);
    }

    public void move() {
        this.position += 3;
    }

    public void describe() {
        System.out.println("Kuat, agresif, dan setia kepada majikan.");
    }
}

