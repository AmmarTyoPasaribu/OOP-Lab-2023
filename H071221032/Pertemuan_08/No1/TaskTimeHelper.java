import java.util.Random;

public class TaskTimeHelper {
    public static int getRandomExecutionTime() {
        Random random = new Random();

        return random.nextInt(1, 7);
    }
}
