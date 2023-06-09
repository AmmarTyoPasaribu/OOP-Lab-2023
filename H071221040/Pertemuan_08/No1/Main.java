
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        int Data = 4;
        ExecutorService executor = Executors.newFixedThreadPool(3); //UI thread
        Data data2 = new Data(); // utk menyimpan jumlah data
        executor.execute(new Runnable() { // background thread

            @Override
            public void run() {
                System.out.println("Start load " + Data + " Data.");
                int time = 0 ;
                while (data2.getDataDiProses()!=Data) { // selama jumla data yang diproses belum sama dengan jumlah data, bakal loading terus
                    time ++ ;
                    System.out.println("Loading..." + time + "s");
                    try {
                        Thread.sleep(1000); // mengatur berapa lama jeda output loading
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Task Finish");
                System.out.println("Time Execution : " + time + "s");
                System.out.println(data2.getDataSukses() + " Data Succesfully Loaded & " + data2.getDataGagal() + " Data");
                System.out.println("failed to load.");
            }
            
        });

        for (int i = 0; i < Data; i++) { // jumlah data harus sama dengan background thread
            executor.execute(new Runnable() {

                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int runTime = TaskTimeHelper.AngkaRandom(); // kasi keluar angka random utk waktu proses data
                    if (runTime >= 4) {
                        System.out.println("Request Timeout");
                        data2.gagal();
                    } else {
                        data2.sukses();
                    }

                    data2.proses(); // menambah 1 data yang diproses setiap pemrosesan data telah selesai
                }
                
            });
        }
    }   
}
