package H071221005.Pertemuan_01;

import java.util.Scanner;

public class assignment_01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Judul Film: ");
        String kalimat = sc.nextLine();
        String huruf_kecil = kalimat.toLowerCase();
        String[] kata = huruf_kecil.split(" ");
        String output = "";
        for (String str : kata) {
            output += str.substring(0, 1).toUpperCase() + str.substring(1) + " ";
        }
        System.out.println(output);
        sc.close();
    }
}