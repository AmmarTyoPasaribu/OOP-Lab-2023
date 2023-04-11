import java.util.Scanner;

public class Nomor03 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Name : ");
            String nama = scanner.nextLine();

            System.out.print("Umur : ");
            int umur = scanner.nextInt();

            System.out.print("Hobby : ");
            String hobi = scanner.next();

            System.out.printf("Nama saya %s, %d tahun, hobby %s", nama, umur, hobi);
            
        } catch (Exception e) {
            System.out.print("masukkan angka!");
        } 
        scanner.close();
    }
}
