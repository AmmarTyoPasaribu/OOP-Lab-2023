import java.util.Scanner;

public class Nomor06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        float jari2; //deklarasikan variable
        try {
            System.out.print("Masukkan jari jari : ");
            jari2 = input.nextFloat();
            input.nextLine();
            System.out.printf("Luas Lingkaran : %.2f", Math.PI * Math.pow(jari2, 2));
        } catch (Exception e) {
            System.out.println("Masukkan angka");
        }
        input.close();
    }
}
