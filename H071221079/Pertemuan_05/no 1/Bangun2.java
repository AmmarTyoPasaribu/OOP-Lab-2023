import java.util.Scanner;

public class Bangun2 {
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        jalanin();
        
    }
    public static void lanjut(){   
        System.out.print("Lagi ?\n 1. lagi\n2. udahan\n>");
        int lagi = inp.nextInt();
        if (lagi==1){
            jalanin();
        }
        else{
            System.out.println("ty");;
        }

    }
    public static void  jalanin(){
        System.out.println("==========BANGUN RUANG==========");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.println("4. Tabung");
        System.out.println("\n==========BANGUN DATAR==========");
        System.out.println("5. Persegi");
        System.out.println("6. Persegi panjang");
        System.out.println("7. Lingkaran");
        System.out.println("8. Segitiga");
        System.out.println("9. Trapesium\n");
        System.out.print("pilih =\n>");
        int menu=inp.nextInt(); 
        
        switch (menu) {
            case 1:
            System.out.print("Masukkan sisi = ");
            double sisi = inp.nextDouble();
            Kubus2 kubus = new Kubus2(sisi);
            kubus.luasPermukaankubus();
             lanjut();
                break;
            case 2:
            
            System.out.print("Masukkan panjang = ");
            double panjang = inp.nextDouble();
            System.out.print("Masukkan lebar = ");
            double lebar=inp.nextDouble();
            System.out.print("Masukkan tinggi = ");
            double tinggi=inp.nextDouble();
            Balok2 balok = new Balok2(panjang,lebar,tinggi);
            balok.luasPermukaanBalok();
            lanjut();
            break;
            case 3:
            System.out.print("Masukkan jarijari = ");
            double jarijari=inp.nextDouble();
            Bola2 bola=new Bola2(jarijari);
            bola.luasPermukaanBola();
            lanjut();
            break;
            case 4:
            System.out.print("Masukkan jarijari = ");
            double jarijaritabung=inp.nextDouble();
            System.out.print("Masukkan tinggi = ");
            double tinggitabung=inp.nextDouble();
            Tabung2 tabung= new Tabung2(jarijaritabung,tinggitabung);
            tabung.luasPermukaanTabung();
            lanjut();
            break;
            case 5:
            System.out.print("Masukkan sisi = ");
            double sisina=inp.nextDouble();
            Persegi2 persegi=new Persegi2(sisina);
            persegi.luasPersegi();
            lanjut();
            break;
            case 6:
            System.out.print("Masukkan panjang = ");
            double panjangper=inp.nextDouble();
            System.out.print("Masukkan lebar = ");
            double lebarper=inp.nextDouble();
            PersegiPanjang2 persegiPanjang=new PersegiPanjang2(panjangper,lebarper);
            persegiPanjang.luasPersegiPanjang();
            lanjut();
            break;
            case 7:
            System.out.print("Masukkan jarijari = ");
            double jarijariling=inp.nextDouble();
            Lingkaran2 lingkaran=new Lingkaran2(jarijariling);
            lingkaran.luasLingkaran();
            lanjut();
            break;
            case 8:
            System.out.print("Masukkan alas = ");
            double alass= inp.nextDouble();
            System.out.print("Masukkan tinggi = ");
            double tinggii=inp.nextDouble();
            System.out.print("Masukkan sisi = ");
            double sisii=inp.nextDouble();
            Segitiga2 segitiga=new Segitiga2(alass,tinggii,sisii);
            segitiga.luasSegitiga();;
            lanjut();
            break;
            case 9:
            System.out.print("Masukkan sisiA = ");
            double tinggiuy=inp.nextDouble();
            System.out.print("Masukkan sisiB = ");
            double  sisisejajar12=inp.nextDouble();
            System.out.print("Masukkan sisiC = ");
            double  sisisejajar13=inp.nextDouble();
            System.out.println("Masukkan sisiD = ");
            double sisiA=inp.nextDouble();
            System.out.println("Masukkan sisisejajar1 = ");
            double sisiB=inp.nextDouble();
            System.out.print("Masukkan sisisejajar2 = ");
            double sisiC=inp.nextDouble();
            System.out.print("Masukkan tinggi = ");
            double sisiD=inp.nextDouble();
            Trapesium2 trapesium= new Trapesium2(tinggiuy,sisisejajar12,sisisejajar13,sisiA,sisiB,sisiC,sisiD);
            trapesium.luasTrapesium();;
            lanjut();;
            break;

            default:
                break;
        }
    
    
}}

