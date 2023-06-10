import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;

public class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    private String[] wordsToTypeList = {"Menuju tak terbatas dan melampauinya",
            "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
            "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik",
            "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
            "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
            "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna",
            "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
            "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
            "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
            "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai"};



    public void setWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(9);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    //TODO 4
    public void addResult(Result contestant) {
        raceStanding.add(contestant);
    }

    public void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================\n");
        //TODO 5
        for (int i = 0;i < raceStanding.size();i++) {
            System.out.println(i+1 + ". " + raceStanding.get(i).getName() + " = " + raceStanding.get(i).getFinishTime() + " detik");
        }
    }

    public void startRace() {
        //TODO 6

        Typer typer1 = raceContestant.get(0);
        Typer typer2 = raceContestant.get(1);
        Typer typer3 = raceContestant.get(2);

        typer1.start();
        typer2.start();
        typer3.start();


        //TODO 7
        while (true) {
            System.out.println("\nTyping Progress ...");
            System.out.println("================\n");
            System.out.println(typer1.getBotName() + "             => " + typer1.getWordsTyped());
            System.out.println(typer2.getBotName() + "               => " + typer2.getWordsTyped());
            System.out.println(typer3.getBotName() + "             => " + typer3.getWordsTyped() + "\n");
            try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}

            if (raceStanding.size() == raceContestant.size()) {
                System.out.println("\nTyping Progress ...");
                System.out.println("================\n");
                System.out.println(typer1.getBotName() + "             => " + typer1.getWordsTyped());
                System.out.println(typer2.getBotName() + "               => " + typer2.getWordsTyped());
                System.out.println(typer3.getBotName() + "             => " + typer3.getWordsTyped());
                break;
            }
        }

        //TODO 8
        printRaceStanding();
    }
}
