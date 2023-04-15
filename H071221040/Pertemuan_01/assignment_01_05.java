import java.util.Scanner;

public class Nomor05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //deklarasikan variable untuk inputan
        System.out.print(""); 
        String number = input.nextLine(); //biar tidak tersambung dengan input yang ada di bawahnya
        int bulan = Integer.parseInt(number.substring(3,5)) ; //mengubah indeks ke 3 dan 5 (bulan) menjadi integer
        int tanggal = Integer.parseInt(number.substring(0, 2)); 
        if (tanggal <= 31 && bulan <= 12) {
            dateconvert(number); // memanggil method apabila kondisinya memenuhi
        } else {
            System.out.print("Masukkan tanggal yang benar!");
        }
        input.close();
    }
    static void dateconvert(String angka) {
        int tgl = Integer.parseInt(angka.substring(0,2));

        String Bulan = angka.substring(3, 5);
        if (Bulan.equals("01")) { //pengecekan bulan
            Bulan = "Januari";
        } else if (Bulan.equals("02")) {
            Bulan = "Februari";
        } else if (Bulan.equals("03")) {
            Bulan = "Maret";
        } else if (Bulan.equals("04")) {
            Bulan = "April";
        } else if (Bulan.equals("05")) {
            Bulan = "Mei";
        } else if (Bulan.equals("06")) {
            Bulan = "Juni";
        } else if (Bulan.equals("07")) {
            Bulan = "Juli";
        } else if (Bulan.equals("08")) {
            Bulan = "Agustus";
        } else if (Bulan.equals("09")) {
            Bulan = "September";
        } else if (Bulan.equals("10")) {
            Bulan = "Oktober";
        } else if (Bulan.equals("11")) {
            Bulan = "November";
        } else if (Bulan.equals("12")) {
            Bulan = "Desember";
        }
        int tahun;
        if (Integer.parseInt(angka.substring(6)) >= 0 && Integer.parseInt(angka.substring(6)) <= 23) {
            tahun = (Integer.parseInt(angka.substring(6))) + 2000;
        } else {
            tahun = (Integer.parseInt(angka.substring(6))) + 1900;
        }
        //mengecek tahun apakah tahun 2000an atau 1900an

        System.out.printf("%d %s %d ", tgl, Bulan, tahun);
    }
}
