package no1;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) { // instance objek
        Scanner sc = new Scanner(System.in);
        ruang ruang = new ruang();
        datar datar = new datar();

        while (true){ // perulangan ini untuk menampilkan menu yang akan dipilih secara terus menerus secara sistematis mengikuti pengkodisian
            System.out.println("===== MENU =====");
            System.out.println("1. BANGUN RUANG\n2. BANGUN DATAR");
            System.out.print(">");
            int selectMenu = sc.nextInt();

            if (selectMenu == 1){
                ruang.showOption();
                int selectRuang = sc.nextInt();

                if (selectRuang == 1){
                    System.out.print("panjang:");
                    int inpPanjang = sc.nextInt();
                    System.out.print("lebar:");
                    int inpLebar = sc.nextInt();
                    System.out.print("tinggi:");
                    int inpTinggi = sc.nextInt();
                    System.out.println();

                    ruang.setPanjang(inpPanjang);
                    ruang.setLebar(inpLebar);
                    ruang.setTinggi(inpTinggi);

                    ruang.kubus(ruang.getPanjang(),ruang.getLebar(), ruang.getTinggi());
                }
                else if (selectRuang == 2){
                    System.out.print("panjang:");
                    int inpPanjang = sc.nextInt();
                    System.out.print("lebar:");
                    int inpLebar = sc.nextInt();
                    System.out.print("tinggi:");
                    int inpTinggi = sc.nextInt();
                    System.out.println();

                    ruang.setPanjang(inpPanjang);
                    ruang.setLebar(inpLebar);
                    ruang.setTinggi(inpTinggi);

                    ruang.kubus(ruang.getPanjang(),ruang.getLebar(), ruang.getTinggi());

                }
                else if (selectRuang == 3){
                    System.out.print("jari jari:");
                    int inpJari = sc.nextInt();

                    ruang.setJari(inpJari);

                    ruang.bola(ruang.getJari());
                }
                else if ( selectRuang == 4){
                    System.out.print("jari jari:");
                    int inpJari = sc.nextInt();
                    System.out.print("tinggi:");
                    int inpTinggi = sc.nextInt();

                    ruang.setJari(inpJari);
                    ruang.setTinggi(inpTinggi);

                    ruang.tabung(ruang.getJari(), ruang.getTinggi());
                }
                else{
                    System.out.println("opsi tidak tersedia");
                }

            }else if (selectMenu == 2){
                datar.showOption();
                int selectDatar = sc.nextInt();

                if (selectDatar == 1){
                    System.out.print("panjang:");
                    int inpPanjang = sc.nextInt();
                    System.out.print("lebar:");
                    int inpLebar = sc.nextInt();

                    datar.setPanjang(inpPanjang);
                    datar.setLebar(inpLebar);

                    datar.persegi(datar.getPanjang(), datar.getLebar());
                }
                else if(selectDatar == 2){
                    System.out.print("panjang:");
                    int inpPanjang = sc.nextInt();
                    System.out.print("lebar:");
                    int inpLebar = sc.nextInt();

                    datar.setPanjang(inpPanjang);
                    datar.setLebar(inpLebar);

                    datar.persegiPanjang(datar.getPanjang(), datar.getLebar());
                }
                else if(selectDatar == 3){
                    System.out.print("jari jari:");
                    int inpJari = sc.nextInt();

                    datar.setJari(inpJari);

                    datar.lingkaran(datar.getJari());
                }
                else if (selectDatar == 4){
                    System.out.print("tinggi: ");
                    int inpTinggi = sc.nextInt();
                    System.out.print("alas: ");
                    int inpAlas = sc.nextInt();
                    System.out.print("sisi 2: ");
                    int inpSisi2 = sc.nextInt();
                    System.out.print("sisi 3: ");
                    int inpSisi3 = sc.nextInt();

                    datar.setTinggi(inpTinggi);

                    datar.segitiga(datar.getTinggi(), inpAlas, inpSisi2, inpSisi3);
                }
                else if(selectDatar == 5){
                    System.out.print("alas A: ");
                    int inpAlasA = sc.nextInt();
                    System.out.print("alas B: ");
                    int inpAlasB = sc.nextInt();
                    System.out.print("tinggi: ");
                    int inpTinggi = sc.nextInt();
                    System.out.print("sisi A: ");
                    int inpSisiA = sc.nextInt();
                    System.out.print("sisi B: ");
                    int inpSisiB = sc.nextInt();
                    System.out.print("sisi C: ");
                    int inpSisiC = sc.nextInt();
                    System.out.print("sisi D: ");
                    int inpSisiD = sc.nextInt();

                    datar.setTinggi(inpTinggi);

                    datar.trapesium(inpAlasA, inpAlasB, datar.getTinggi(), inpSisiA, inpSisiB, inpSisiC, inpSisiD);
                }
            }
            else{
                System.out.println("opsi tidak tersedia");
            }
        }  
    }


}

