import java.util.Scanner;

public class MainBangun {
    public static void main(String[] args) {
        int pilihan = 0;
        Scanner inp = new Scanner(System.in);

        System.out.println("==== BANGUN RUANG =====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
        System.out.println();
        System.out.println("==== BANGUN DATAR =====");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. SEGITIGA");
        System.out.println("9. TRAPESIUM");
        System.out.println();
        System.out.println("10. Keluar");
        System.out.print("Silahkan masukkan pilihan : ");
        pilihan = inp.nextInt();
        while (pilihan != 10) {
        if (pilihan == 1) {
            Scanner input = new Scanner(System.in);
            Kubus a = new Kubus();
            System.out.print("Masukkan panjang sisi kubus : ");
            a.sisi = input.nextInt();
            System.out.println("Volume Kubus : " + a.getVolume());
            System.out.println("Luas Permukaan Kubus : " + a.getLuasPermukaan());
            input.close();
        }
        else if (pilihan == 2) {
            Scanner input = new Scanner(System.in);
            Balok a = new Balok();
            System.out.print("Masukkan panjang Balok : ");
            a.panjang = input.nextInt();
            System.out.print("Masukkan lebar Balok : ");
            a.lebar = input.nextInt();
            System.out.print("Masukkan tinggi Balok : ");
            a.tinggi = input.nextInt();
            System.out.println("Volume Balok : " + a.getVolume());
            System.out.println("Luas Permukaan Balok : " + a.getLuasPermukaan());
            input.close();
        }
        else if (pilihan == 3) {
            Scanner input = new Scanner(System.in);
            Bola a = new Bola();
            System.out.print("Masukkan jari jari Bola : ");
            a.jarijari = input.nextInt();
            System.out.println("Volume Bola : " + a.getVolume());
            System.out.println("Luas Permukaan Bola : " + a.getLuasPermukaan());
            input.close();
        }
        else if (pilihan == 4) {
            Scanner input = new Scanner(System.in);
            Tabung a = new Tabung();
            System.out.print("Masukkan jari jari Tabung : ");
            a.jarijari = input.nextInt();
            System.out.print("Masukkan tinggi Tabung : ");
            a.tinggi = input.nextInt();
            System.out.println("Volume Tabung : " + a.getVolume());
            System.out.println("Luas Permukaan Tabung : " + a.getLuasPermukaan());
            input.close();
        }
        else if (pilihan == 5) {
            Scanner input = new Scanner(System.in);
            Persegi a = new Persegi();
            System.out.print("Masukkan sisi Persegi : ");
            a.sisi = input.nextInt();
            System.out.println("Luas Persegi : " + a.getLuas());
            System.out.println("keliling Persegi : " + a.getKeliling());
            input.close();
        }
        else if (pilihan == 6) {
            Scanner input = new Scanner(System.in);
            PersegiPanjang a = new PersegiPanjang();
            System.out.print("Masukkan panjang Persegi Panjang : ");
            a.panjang = input.nextInt();
            System.out.print("Masukkan lebar Persegi Panjang : ");
            a.lebar = input.nextInt();
            System.out.println("Luas Persegi Panjang : " + a.getLuas());
            System.out.println("Keliling Persegi Panjang : " + a.getKeliling());
            input.close();
        }
        else if (pilihan == 7) {
            Scanner input = new Scanner(System.in);
            Lingkaran a = new Lingkaran();
            System.out.print("Masukkan jari jari Lingkaran: ");
            a.jarijari = input.nextInt();
            System.out.println("luas Lingkaran : " + a.getLuas());
            System.out.println("Keliling Lingkaran : " + a.getKeliling());
            input.close();
        }
        else if (pilihan == 8) {
            Scanner input = new Scanner(System.in);
            Segitiga a = new Segitiga();
            System.out.print("Masukkan alas Segitiga: ");
            a.alas = input.nextInt();
            System.out.print("Masukkan tinggi Segitiga: ");
            a.tinggi = input.nextInt();
            System.out.print("Masukkan sisi Segitiga : ");
            a.sisi = input.nextInt();
            System.out.println("Luas Segitiga : " + a.getLuas());
            System.out.println("keliling Segitiga : " + a.getKeliling());
            input.close();
        }
        else if (pilihan == 9) {
            Scanner input = new Scanner(System.in);
            Trapesium a = new Trapesium();
            System.out.print("Masukkan alas atas Trapesium : ");
            a.alas1 = input.nextInt();
            System.out.print("Masukkan alas bawah Trapesium : ");
            a.alas2 = input.nextInt();
            System.out.print("Masukkan rusuk kiri Trapesium : ");
            a.rusuk1 = input.nextInt();
            System.out.print("Masukkan rusuk kanan Trapesium: ");
            a.rusuk2 = input.nextInt();
            System.out.print("Masukkan tinggi Trapesium : ");
            a.tinggi = input.nextInt();
            System.out.println("Luas Trapesium : " + a.getLuas());
            System.out.println("Keliling Trapesium : " + a.getKeliling());
            input.close();
        }
        else {
            System.out.println("Pilihan salah");
        }
        break;
        }
        
        inp.close();
        
    }
}
