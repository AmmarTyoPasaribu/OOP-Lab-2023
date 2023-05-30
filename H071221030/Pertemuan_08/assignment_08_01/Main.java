import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static final int jumlahData = 4;
    private static final int jumlahThread = 3;

    private static int sukses = 0;
    private static int gagal = 0;
    private static boolean sudah = false;

    public static void main(String[] args) {
        System.out.println(String.format("Start load %d Data", jumlahData));

        ExecutorService executor = Executors.newFixedThreadPool(jumlahThread);

        for (int i = 0; i < jumlahData; i++) {
            executor.execute(() -> {
                int executionTime = TaskTimeHelper.generateNumber();
                if (executionTime > 4) {
                    System.out.println("Request Timeout");
                    jikaGagal();
                    return;
                } else {
                    try {
                        Thread.sleep(executionTime * 1000);
                        jikaBerhasil();
                    } catch (InterruptedException e) {
                        jikaGagal();
                        System.out.println("Request Timeout");
                    }
                }
                loadData();
            });
        }

        executor.shutdown();

        int loadingTime = 1;
        while (true) {
            if (sudah) {
                System.out.println("\nTask Finished.");
                System.out.println(String.format("Time Execution : %ds", loadingTime - 1));
                if (sukses == jumlahData) {
                    System.out.println("All data is successfully loaded");
                    break;
                } else {
                    System.out.println(String.format("%d Data Successfully loaded & %d Data Failed to load", sukses, gagal));
                    break;
                }
            } else {
                System.out.println(String.format("Loading... (%ds)", loadingTime));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            loadingTime++;
        }
    }

    public static synchronized void jikaBerhasil() {
        sukses++;
    }

    public static synchronized void jikaGagal() {
        gagal++;
    }

    public static synchronized void loadData() {
        if (sukses + gagal == jumlahData) {
            sudah = true;
        }
    }
}