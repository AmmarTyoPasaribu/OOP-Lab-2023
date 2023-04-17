package H071221005.Pertemuan_05.assignment_05_01;


import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
    BangunRuang bangunruang = new BangunRuang();
    bangunruang.detailBangunRuang();

    BangunDatar bangundatar = new BangunDatar();
    bangundatar.detailBangunDatar();

    Scanner sc = new Scanner(System.in);
    System.out.print("Pilih : ");
    int pilih = sc.nextInt();
    
    if(pilih == 1){
        System.out.println("1. Hitung Luas");
        System.out.print("2. Hitung Volume\n");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukan Sisi : ");
            pilih = sc.nextInt();
            Kubus kubus = new Kubus(pilih);
            System.out.printf("Hasil : %.2f Cm^2",kubus.LuasKubus());
        }else{
            System.out.print("Masukan Sisi : ");
            pilih = sc.nextInt();
            Kubus kubus = new Kubus(pilih);
            System.out.printf("Hasil : %.2f Cm^3",kubus.VolKubus());
        }
    }
    else if(pilih == 2){
        System.out.println("1. Hitung Luas");
        System.out.print("2. Hitung Volume\n");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukan Panjang : ");
            double pilih1 = sc.nextInt();
            System.out.print("Masukan Lebar : ");
            double pilih2 = sc.nextInt();
            System.out.print("Masukan Tinggi : ");
            double pilih3 = sc.nextInt();
            Balok Balok = new Balok(pilih1, pilih2, pilih3);
            System.out.printf("Hasil : %.2f Cm^2",Balok.LuasBalok());
        }else{
            System.out.print("Masukan Panjang : ");
            double pilih1 = sc.nextInt();
            System.out.print("Masukan Lebar : ");
            double pilih2 = sc.nextInt();
            System.out.print("Masukan Tinggi : ");
            double pilih3 = sc.nextInt();
            Balok Balok = new Balok(pilih1, pilih2, pilih3);
            System.out.printf("Hasil : %.2f Cm^3",Balok.VolBalok());
        }
    }
    else if(pilih == 3){
        System.out.println("1. Hitung Luas");
        System.out.print("2. Hitung Volume\n");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukan Jari-jari : ");
            pilih = sc.nextInt();
            Bola Bola = new Bola(pilih);
            System.out.printf("Hasil : %.2f Cm^2",Bola.LuasBola());
        }else{
            System.out.print("Masukan Jari-Jari : ");
            pilih = sc.nextInt();
            Bola Bola = new Bola(pilih);
            System.out.printf("Hasil : %.2f Cm^3",Bola.VolBola());
        }
    }
    else if(pilih == 4){
        System.out.println("1. Hitung Luas");
        System.out.print("2. Hitung Volume\n");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukan Jari-jari : ");
            double pilih1 = sc.nextInt();
            System.out.print("Masukan Tinggi : ");
            double pilih2 = sc.nextInt();
            Tabung Tabung = new Tabung(pilih1, pilih2);

            System.out.printf("Hasil : %.2f Cm^2",Tabung.LuasTabung());
        }else{
            System.out.print("Masukan Jari-Jari : ");
            double pilih1 = sc.nextInt();
            System.out.print("Masukan Tinggi : ");
            double pilih2 = sc.nextInt();
            Tabung Tabung = new Tabung(pilih1, pilih2);
            System.out.printf("Hasil : %.2f Cm^3",Tabung.VolTabung());
        }
    }
    else if(pilih == 5){
        System.out.println("1. Hitung Luas");
        System.out.print("2. Hitung Keliling\n");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukan Sisi : ");
            pilih = sc.nextInt();
            Persegi LuasPersegi = new Persegi(pilih);
            System.out.printf("Hasil : %.2f Cm^2",LuasPersegi.LuasPersegi());
        }else{
            System.out.print("Masukan Sisi : ");
            pilih = sc.nextInt();
            Persegi KelPersegi = new Persegi(pilih);
            System.out.printf("Hasil : %.2f Cm",KelPersegi.KelPersegi());
        }
    }
    else if(pilih == 6){
        System.out.println("1. Hitung Luas");
        System.out.print("2. Hitung Keliling\n");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukan Panjang : ");
            double pilih1 = sc.nextInt();
            System.out.print("Masukan Lebar : ");
            double pilih2 = sc.nextInt();
            PersegiPanjang PersegiPanjang = new PersegiPanjang(pilih1, pilih2);
            System.out.printf("Hasil : %.2f Cm^2",PersegiPanjang.LuasPersegiPanjang());
        }else{
            System.out.print("Masukan Panjang : ");
            double pilih1 = sc.nextInt();
            System.out.print("Masukan Lebar : ");
            double pilih2 = sc.nextInt();
            PersegiPanjang PersegiPanjang = new PersegiPanjang(pilih1, pilih2);
            System.out.printf("Hasil : %.2f Cm",PersegiPanjang.KelPersegiPanjang());
        }
    }
    else if(pilih == 7){
        System.out.println("1. Hitung Luas");
        System.out.print("2. Hitung Keliling\n");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukan Jari-Jari : ");
            pilih = sc.nextInt();
            Lingkaran Lingkaran = new Lingkaran(pilih);
            System.out.printf("Hasil : %.2f Cm^2",Lingkaran.LuasLingkaran());
        }else{
            System.out.print("Masukan Jari-Jari : ");
            pilih = sc.nextInt();
            Lingkaran Lingkaran = new Lingkaran(pilih);
            System.out.printf("Hasil : %.2f Cm",Lingkaran.KelLingkaran());
        }
    }
    else if(pilih == 8){
        System.out.println("1. Hitung Luas");
        System.out.print("2. Hitung Keliling\n");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukan Alas : ");
            double pilih1 = sc.nextInt();
            System.out.print("Masukan Tinggi : ");
            double pilih2 = sc.nextInt();
            Segitiga Segitiga = new Segitiga(pilih1, pilih2);
            System.out.printf("Hasil : %.2f Cm^2",Segitiga.LuasSegitiga());
        }else{
            System.out.print("Masukan a : ");
            double pilih1 = sc.nextInt();
            System.out.print("Masukan b : ");
            double pilih2 = sc.nextInt();
            System.out.print("Masukan c : ");
            double pilih3 = sc.nextInt();
            Segitiga Segitiga = new Segitiga(pilih1, pilih2, pilih3);
            System.out.printf("Hasil : %.2f Cm",Segitiga.KelSegitiga());
        }
    }
    else if(pilih == 9){
        System.out.println("1. Hitung Luas");
        System.out.print("2. Hitung Keliling\n");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukan a : ");
            double pilih1 = sc.nextInt();
            System.out.print("Masukan b : ");
            double pilih2 = sc.nextInt();
            System.out.print("Masukan Tinggi : ");
            double pilih3 = sc.nextInt();
            Trapesium Trapesium = new Trapesium(pilih1, pilih2, pilih3);
            System.out.printf("Hasil : %.2f Cm^2",Trapesium.LuasTrapesium());
        }else{
            System.out.print("Masukan A : ");
            double pilih1 = sc.nextInt();
            System.out.print("Masukan B : ");
            double pilih2 = sc.nextInt();
            System.out.print("Masukan C : ");
            double pilih3 = sc.nextInt();
            Trapesium Trapesium = new Trapesium(pilih1, pilih2, pilih3);
            System.out.printf("Hasil : %.2f Cm",Trapesium.KelTrapesium());
        }
    }else{
        System.out.println("Input Salah");
    }
    sc.close();
    }
}
