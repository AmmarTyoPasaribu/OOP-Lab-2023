import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BackgroundThread {
    int threadPool, jumlahData, dataLoaded, dataFailed;
    boolean finished = false;

    public int getJumlahData() {
        return jumlahData;
    }

    public int getDataLoaded() {
        return dataLoaded;
    }

    public int getDataFailed() {
        return dataFailed;
    }

    public boolean isFinished() {
        return finished;
    }

    public BackgroundThread(int threadPool, int jumlahData) {
        this.threadPool = threadPool;
        this.jumlahData = jumlahData;
    }

    public void loadData() {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        CountDownLatch latch = new CountDownLatch(jumlahData);

        for (int i = 1; i <= this.jumlahData; i++) {
            int randomTime = TaskTimeHelper.getRandomExecutionTime();

            executor.execute(new Runnable() {
                public void run() {

                    try {
                        Thread.sleep((int)randomTime * 1000);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }

                    if (randomTime > 4) {
                        System.out.println("Request Timeout");
                        dataFailed += 1;
                    } else {
                        dataLoaded++;
                    }

                    latch.countDown();

                    if (latch.getCount() == 0) {
                        finished = true;
                    }
                }
            });
        }
        executor.shutdown();
    }
}