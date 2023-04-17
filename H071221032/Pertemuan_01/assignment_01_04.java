package H071221032.Pertemuan01;
import java.util.Scanner;

public class assignment_01_04 {
    public static void main(String[] args) {
        Scanner uinput = new Scanner(System.in);
        System.out.print("Masukkan Judul Film :\n> ");
        String judul = uinput.nextLine().toLowerCase();
        String output = "";

        for (String i: judul.split(" ")) {
            String x = i.substring(0, 1).toUpperCase() + i.substring(1);
            output += x;
            output += " ";
        }

        System.out.println(output);

    }
}
