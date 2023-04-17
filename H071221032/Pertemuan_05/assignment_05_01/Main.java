import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("==== BANGUN RUANG ====");
            System.out.println("1. KUBUS \n2. BALOK \n3. BOLA \n4. TABUNG");
            System.out.println("==== BANGUN DATAR ====");
            System.out.println("1. PERSEGI \n2. PERSEGI PANJANG \n3. LINGKARAN \n4. SEGITIGA \n5. TRAPESIUM");

            System.out.print("---------------\n1. Bangun Ruang\n2. Bangun Datar\n0. Exit\nMasukkan pilihan Anda: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    menuBangunRuang();
                    break;
                case 2:
                    menuBangunDatar();
                    break;
                case 0:
                    System.out.println("Menutup Program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);

    }

    public static void menuBangunRuang() {
        Scanner input = new Scanner(System.in);
        BangunRuang bangun = new BangunRuang();
        System.out.print("Masukkan Pilihan bangun Ruang: ");
        int pilihan = input.nextInt();
        input.nextLine();
        do {
            switch (pilihan) {
                case 1: {
                    System.out.print("Masukkan Sisi Kubus: ");
                    double sisi = input.nextDouble();
                    input.nextLine();
                    bangun = new Kubus(sisi);
                    break;
                }
                case 2: {
                    System.out.print("Masukkan Panjang Balok: ");
                    double panjang = input.nextDouble();
                    input.nextLine();
                    System.out.print("Masukkan Tinggi Balok: ");
                    double tinggi = input.nextDouble();
                    input.nextLine();
                    System.out.print("Masukkan Lebar Balok: ");
                    double lebar = input.nextDouble();
                    input.nextLine();
                    bangun = new Balok(panjang, lebar, tinggi);
                    break;
                }
                case 3: {
                    System.out.print("Masukkan Panjang Jari-Jari Bola: ");
                    double jariJari = input.nextDouble();
                    input.nextLine();
                    bangun = new Bola(jariJari);
                    break;
                }
                case 4: {
                    System.out.print("Masukkan Jari-Jari Tabung: ");
                    double jariJari = input.nextDouble();
                    input.nextLine();
                    System.out.print("Masukkan Tinggi Tabung: ");
                    double tinggi = input.nextDouble();
                    input.nextLine();
                    bangun = new Tabung(jariJari, tinggi);
                    break;
                }
            }
        } while (pilihan>4 || pilihan<1);
        System.out.println("Volume = " + bangun.getVolume() + "\nLuas Permukaan = " + bangun.getLuasPermukaan());
    }

    public static void menuBangunDatar() {
        Scanner input = new Scanner(System.in);
        BangunDatar bangun = new BangunDatar();
        System.out.print("Masukkan Pilihan bangun Datar: ");
        int pilihan = input.nextInt();
        input.nextLine();
        do {
            switch (pilihan) {
                case 1: {
                    System.out.print("Masukkan Sisi Persegi: ");
                    double sisi = input.nextDouble();
                    input.nextLine();
                    bangun = new Persegi(sisi);
                    break;
                }
                case 2: {
                    System.out.print("Masukkan Panjang Persegi Panjang: ");
                    double panjang = input.nextDouble();
                    input.nextLine();
                    System.out.print("Masukkan Lebar Persegi Panjang: ");
                    double lebar = input.nextDouble();
                    input.nextLine();
                    bangun = new PersegiPanjang(panjang, lebar);
                    break;
                }
                case 3: {
                    System.out.print("Masukkan Panjang Jari-Jari Lingkaran: ");
                    double jariJari = input.nextDouble();
                    input.nextLine();
                    bangun = new Lingkaran(jariJari);
                    break;
                }
                case 4: {
                    System.out.print("Masukkan Alas Segitiga: ");
                    double alas = input.nextDouble();
                    input.nextLine();
                    System.out.print("Masukkan Tinggi Segitiga: ");
                    double tinggi = input.nextDouble();
                    input.nextLine();
                    System.out.print("Masukkan Sisi 1 Segitiga: ");
                    double sisi1 = input.nextDouble();
                    input.nextLine();
                    System.out.print("Masukkan Sisi 2 Segitiga: ");
                    double sisi2 = input.nextDouble();
                    input.nextLine();
                    bangun = new Segitiga(alas, tinggi, sisi1, sisi2);
                    break;
                }
                case 5: {
                    System.out.print("Masukkan Sisi 1 Trapesium: ");
                    double sisi1 = input.nextDouble();
                    input.nextLine();
                    System.out.print("Masukkan Sisi 2 Trapesium: ");
                    double sisi2 = input.nextDouble();
                    input.nextLine();
                    System.out.print("Masukkan Tinggi Trapesium: ");
                    double tinggi = input.nextDouble();
                    input.nextLine();
                    bangun = new Trapesium(sisi1, sisi2, tinggi);
                    break;
                }
                default:
                    System.out.println("Pilihan Tidak Valid");
            }
        } while (pilihan>5 || pilihan<1);
        System.out.println("Luas = " + bangun.getLuas() + "\nKeliling = " + bangun.getKeliling());
    }
}