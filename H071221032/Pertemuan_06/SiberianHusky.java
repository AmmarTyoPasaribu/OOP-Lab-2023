public class SiberianHusky extends Dog {
    public SiberianHusky(int pos, int avgLenght) {
        super(pos, avgLenght);
    }

    public void move() {
        this.position += 2;
    }

    public void describe() {
        System.out.println("Kuat, lincah, dan tahan cuaca dingin. Dikenal sebagai anjing penarik kereta salju.");
    }
}

