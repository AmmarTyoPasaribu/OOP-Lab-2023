public class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wordsTyped = "";
        this.wpm = wpm;
        this.typeRacer = typeRacer;
    }

    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public double getWpm() {
        return wpm;
    }

    public void setWpm(int wpm) {
        this.wpm = wpm;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        String[] wordsToType = typeRacer.getWordsToType().split(" ");

        //TODO 1
        int howLongToType = (int) ((60.0/getWpm())*1000);

        //TODO 2
        int i = 0;
        while (wordsToType.length != wordsTyped.split(" ").length) {
            addWordTyped(wordsToType[i]);
            //System.out.println("x: " + wordsToType.length + " " + wordsTyped.split(" ").length + " " + i);
            //System.out.println(howLongToType);
            i++;
            try{Thread.sleep(howLongToType);}catch(InterruptedException e){System.out.println(e);}
        }

        this.addWordTyped("(selesai)");
        long endTime = System.currentTimeMillis();
        long runTime = (endTime - startTime)/1000;

        //TODO 3
        Result result = new Result(this.botName, (int) runTime);
        typeRacer.addResult(result);
    }

}
