import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); //untuk menginput 
        System.out.print("Masukkan Judul Film : ");
        String kalimat = inp.nextLine(); //spy bisa diprint kata selanjutnya
        String[] kata = kalimat.toLowerCase().split(" "); //split spasi setiap kalimat
        String kalimatBaru = "";
        for (int i = 0; i < kata.length; i++) {
            kalimatBaru += kata[i].substring(0, 1).toUpperCase() + kata[i].substring(1) + " "  ; //"Spasi tiap kalimat"
            //kata.substring untuk mengambil indeks
        }
        System.out.print(kalimatBaru); 
        inp.close();
    }
}
