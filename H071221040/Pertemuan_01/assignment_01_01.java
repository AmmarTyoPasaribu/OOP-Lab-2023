import java.util.Scanner;

/**
 * Nomor01
 */
public class Nomor01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        
        nim = nim.substring(7,10);
        int x = Integer.parseInt(nim);

        if (x%7 == 0) {
            System.out.println("Soal : no 7");
        } else if (x%7 == 1) {
            System.out.println("Soal : no 1");
        } else if (x%7 == 2) {
            System.out.println("Soal : no 2");
        } else if (x%7 == 3) {
            System.out.println("Soal : no 3");
        } else if (x%7 == 4) {
            System.out.println("Soal : no 4");
        } else if (x%7 == 5) {
            System.out.println("Soal : no 5");
        } else if (x%7 == 6) {
            System.out.println("Soal : no 6");
        }
        
        scanner.close();
    }
}