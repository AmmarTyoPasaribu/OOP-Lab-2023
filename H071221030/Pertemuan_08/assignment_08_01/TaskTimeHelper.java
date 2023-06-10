import java.util.Random;

class TaskTimeHelper {
    public static int generateNumber() {
        return new Random().nextInt((6 - 1) + 1) + 1;
    }
}