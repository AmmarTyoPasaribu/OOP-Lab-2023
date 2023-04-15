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
        Kubus kubus = new Kubus();
        System.out.println("1. Hitung Luas");
        System.out.print("2. Hitung Volume\n");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukan Sisi : ");
            pilih = sc.nextInt();
            kubus.setPanjang(pilih);
            System.out.printf("Hasil : %.2f Cm^2",kubus.LuasKubus());
        }else{
            System.out.print("Masukan Sisi : ");
            pilih = sc.nextInt();
            kubus.setPanjang(pilih);
            System.out.printf("Hasil : %.2f Cm^3",kubus.VolKubus());
        }
    }
    else if(pilih == 2){
        Balok Balok = new Balok();
        System.out.println("1. Hitung Luas");
        System.out.print("2. Hitung Volume\n");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukan Panjang : ");
            pilih = sc.nextInt();
            Balok.setPanjang(pilih);
            System.out.print("Masukan Lebar : ");
            pilih = sc.nextInt();
            Balok.setLebar(pilih);
            System.out.print("Masukan Tinggi : ");
            pilih = sc.nextInt();
            Balok.setTinggi(pilih);
            System.out.printf("Hasil : %.2f Cm^2",Balok.LuasBalok());
        }else{
            System.out.print("Masukan Panjang : ");
            pilih = sc.nextInt();
            Balok.setPanjang(pilih);
            System.out.print("Masukan Lebar : ");
            pilih = sc.nextInt();
            Balok.setLebar(pilih);
            System.out.print("Masukan Tinggi : ");
            pilih = sc.nextInt();
            Balok.setTinggi(pilih);
            System.out.printf("Hasil : %.2f Cm^3",Balok.VolBalok());
        }
    }
    else if(pilih == 3){
        Bola Bola = new Bola();
        System.out.println("1. Hitung Luas");
        System.out.print("2. Hitung Volume\n");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukan Jari-jari : ");
            pilih = sc.nextInt();
            Bola.setJari(pilih);
            
            System.out.printf("Hasil : %.2f Cm^2",Bola.LuasBola());
        }else{
            System.out.print("Masukan Jari-Jari : ");
            pilih = sc.nextInt();
            Bola.setJari(pilih);
            System.out.printf("Hasil : %.2f Cm^3",Bola.VolBola());
        }
    }
    else if(pilih == 4){
        Tabung Tabung = new Tabung();
        System.out.println("1. Hitung Luas");
        System.out.print("2. Hitung Volume\n");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukan Jari-jari : ");
            pilih = sc.nextInt();
            Tabung.setJari(pilih);
            System.out.print("Masukan Tinggi : ");
            pilih = sc.nextInt();
            Tabung.setTinggi(pilih);
            System.out.printf("Hasil : %.2f Cm^2",Tabung.LuasTabung());
        }else{
            System.out.print("Masukan Jari-Jari : ");
            pilih = sc.nextInt();
            Tabung.setJari(pilih);
            System.out.print("Masukan Tinggi : ");
            pilih = sc.nextInt();
            Tabung.setTinggi(pilih);
            System.out.printf("Hasil : %.2f Cm^3",Tabung.VolTabung());
        }
    }
    else if(pilih == 5){
        Persegi Persegi = new Persegi();
        System.out.println("1. Hitung Luas");
        System.out.print("2. Hitung Keliling\n");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukan Sisi : ");
            pilih = sc.nextInt();
            Persegi.setPanjang(pilih);
            System.out.printf("Hasil : %.2f Cm^2",Persegi.LuasPersegi());
        }else{
            System.out.print("Masukan Sisi : ");
            pilih = sc.nextInt();
            Persegi.setPanjang(pilih);
            System.out.printf("Hasil : %.2f Cm",Persegi.KelPersegi());
        }
    }
    else if(pilih == 6){
        PersegiPanjang PersegiPanjang = new PersegiPanjang();
        System.out.println("1. Hitung Luas");
        System.out.print("2. Hitung Keliling\n");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukan Panjang : ");
            pilih = sc.nextInt();
            PersegiPanjang.setPanjang(pilih);
            System.out.print("Masukan Lebar : ");
            pilih = sc.nextInt();
            PersegiPanjang.setLebar(pilih);
            System.out.printf("Hasil : %.2f Cm^2",PersegiPanjang.LuasPersegiPanjang());
        }else{
            System.out.print("Masukan Panjang : ");
            pilih = sc.nextInt();
            PersegiPanjang.setPanjang(pilih);
            System.out.print("Masukan Lebar : ");
            pilih = sc.nextInt();
            PersegiPanjang.setLebar(pilih);
            System.out.printf("Hasil : %.2f Cm",PersegiPanjang.KelPersegiPanjang());
        }
    }
    else if(pilih == 7){
        Lingkaran Lingkaran = new Lingkaran();
        System.out.println("1. Hitung Luas");
        System.out.print("2. Hitung Keliling\n");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukan Jari-Jari : ");
            pilih = sc.nextInt();
            Lingkaran.setJari(pilih);;
            System.out.printf("Hasil : %.2f Cm^2",Lingkaran.LuasLingkaran());
        }else{
            System.out.print("Masukan Jari-Jari : ");
            pilih = sc.nextInt();
            Lingkaran.setJari(pilih);
            System.out.printf("Hasil : %.2f Cm",Lingkaran.KelLingkaran());
        }
    }
    else if(pilih == 8){
        Segitiga Segitiga = new Segitiga();
        System.out.println("1. Hitung Luas");
        System.out.print("2. Hitung Keliling\n");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukan Alas : ");
            pilih = sc.nextInt();
            Segitiga.setAlas(pilih);
            System.out.print("Masukan Tinggi : ");
            pilih = sc.nextInt();
            Segitiga.setTinggi(pilih);
            System.out.printf("Hasil : %.2f Cm^2",Segitiga.LuasSegitiga());
        }else{
            System.out.print("Masukan a : ");
            pilih = sc.nextInt();
            Segitiga.setA(pilih);
            System.out.print("Masukan b : ");
            pilih = sc.nextInt();
            Segitiga.setB(pilih);
            System.out.print("Masukan c : ");
            pilih = sc.nextInt();
            Segitiga.setC(pilih);
            System.out.printf("Hasil : %.2f Cm",Segitiga.KelSegitiga());
        }
    }
    else if(pilih == 9){
        Trapesium Trapesium = new Trapesium();
        System.out.println("1. Hitung Luas");
        System.out.print("2. Hitung Keliling\n");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukan a : ");
            pilih = sc.nextInt();
            Trapesium.setA(pilih);
            System.out.print("Masukan b : ");
            pilih = sc.nextInt();
            Trapesium.setB(pilih);
            System.out.print("Masukan Tinggi : ");
            pilih = sc.nextInt();
            Trapesium.setTinggi(pilih);
            System.out.printf("Hasil : %.2f Cm^2",Trapesium.LuasTrapesium());
        }else{
            System.out.print("Masukan A : ");
            pilih = sc.nextInt();
            Trapesium.setA(pilih);
            System.out.print("Masukan B : ");
            pilih = sc.nextInt();
            Trapesium.setB(pilih);
            System.out.print("Masukan C : ");
            pilih = sc.nextInt();
            Trapesium.setC(pilih);
            System.out.print("Masukan D : ");
            pilih = sc.nextInt();
            Trapesium.setD(pilih);
            System.out.printf("Hasil : %.2f Cm",Trapesium.KelTrapesium());
        }
    }else{
        System.out.println("Input Salah");
    }
    sc.close();
    }
}
