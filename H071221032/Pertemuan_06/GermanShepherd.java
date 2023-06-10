public class GermanShepherd extends Dog {
    public GermanShepherd(int pos, int avgLenght) {
        super(pos, avgLenght);
    }

    public void move() {
        this.position += 3;
    }

    public void describe() {
        System.out.println("Cerdas, loyal, sering jadi anjing polisi");
    }
}

