import java.util.Scanner;

public class Nomor04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Judul Film : ");
        String kalimat = input.nextLine();
        String[] kata = kalimat.toLowerCase().split(" ");
        String kalimatBaru = "";
        for (int i = 0; i < kata.length; i++) {
            kalimatBaru += kata[i].substring(0, 1).toUpperCase() + kata[i].substring(1) + " "  ;
        }
        System.out.println("Judul film setelah diubah : " + kalimatBaru.trim());
        input.close();
    }
}

