import java.util.Random;

public class taskTimeHelper {
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}