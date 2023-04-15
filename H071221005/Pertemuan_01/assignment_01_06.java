package H071221005.Pertemuan_01;

import java.util.Scanner;
public class assignment_01_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double jari_jari;
        double luas_lingkaran;
        
        System.out.println("Masukan Jari-jari");
        jari_jari = sc.nextDouble();
        luas_lingkaran = Math.PI*Math.pow(jari_jari, 2);
        System.out.printf("%.2f",luas_lingkaran); 
        sc.close();
    }
}
