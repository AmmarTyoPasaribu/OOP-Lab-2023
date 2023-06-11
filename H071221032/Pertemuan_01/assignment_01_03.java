package H071221032.Pertemuan01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class assignment_01_03 {
    public static void main(String[] args) {
        Scanner uinput = new Scanner(System.in);
        System.out.print("Name  : ");
        String name = uinput.nextLine();

        System.out.print("Umur  :  ");
        int umur=0;
        try {
            umur = uinput.nextInt();
        }
        catch (Exception e) {
            System.out.println("Umur bukan angka");System.exit(0);
        }
        uinput.nextLine();

        System.out.print("Hobby : ");
        String hobby = uinput.nextLine();

        System.out.println("Nama saya " + name + ", " + umur + " tahun, hobby " + hobby);
    }
}
