package H071221032.Pertemuan01;
import java.util.Scanner;

public class assignment_01_01 {
    public static void main (String[] args) {
        Scanner uinput = new Scanner(System.in);
        System.out.print("NIM: ");
        String nim = uinput.nextLine();

        int subnim = Integer.parseInt(nim.substring(nim.length()-3));
        int nomor = 0;
        for (int i = 1;i<=subnim;i++) {
            nomor++;

            if (nomor==8) {
                nomor = 1;
            }
        }
        System.out.println("Soal: no "+nomor);
    }
}
