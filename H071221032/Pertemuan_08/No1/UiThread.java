public class UiThread {
    public static void main(String[] args) {

        BackgroundThread backgroundThread = new BackgroundThread(3, 4);
        System.out.println("Start load " + backgroundThread.getJumlahData() + " Data");

        long startTime = System.currentTimeMillis();
        backgroundThread.loadData();

        int i = 1;
        while (!backgroundThread.isFinished()) {

            System.out.println("Loading... (" + i + "s)");
            i += 1;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        long endTime = System.currentTimeMillis();
        long runTime = (endTime - startTime) / 1000;

        System.out.println("Task Finish.");
        System.out.println("Time Execution : " + runTime + "s");
        System.out.println((backgroundThread.getDataLoaded()) + " Data Succesfully loaded & " + backgroundThread.getDataFailed() + " Data failed to load.");
    }
}