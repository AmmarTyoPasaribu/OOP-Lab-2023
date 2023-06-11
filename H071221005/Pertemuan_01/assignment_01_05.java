package H071221005.Pertemuan_01;

import java.util.Scanner;

public class assignment_01_05 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String sebelum_konversi;
        System.out.println("Masukan Tanggal : ");
        sebelum_konversi = sc.nextLine();
        
        // untuk mengambil tanggal lalu diubah menjadi int
        String ubah_tanggal_ke_int = sebelum_konversi.substring(0, 2);
        int tanggal = Integer.parseInt(ubah_tanggal_ke_int);
        
        // untuk mengambil bulan lalu diubah menjadi int
        String ubah_bulan_ke_int = sebelum_konversi.substring(3, 5);
        int bulan = Integer.parseInt(ubah_bulan_ke_int);
        
        String tahun = sebelum_konversi.substring(6, 8);
        
        String konversi_tanggal = ubah(tanggal, bulan, tahun);
        System.out.println(konversi_tanggal);
        sc.close();    
        }
        
    public static String ubah(int tanggal, int bulan,String tahun){
        
        String bulan_ = "";
        String tahun_= "";
        String cek_tahun = tahun.substring(0, 1);
        
        if (cek_tahun.equals("0")| cek_tahun.equals("1")|cek_tahun.equals("2")){
            tahun_ += "20"+tahun;
        }else{
            tahun_ += "19"+tahun;
        }
        
        switch (bulan){
        case 12:
            bulan_+= " Desember ";
            break;
        case 11:
            bulan_+= " November ";
            break;
        case 10:
            bulan_+= " Oktober ";
            break;
        case 9:
            bulan_+= " September ";
            break;    
        case 8:
            bulan_+= " Agustus ";
            break;  
        case 7:
            bulan_+= " Juli ";
            break;    
        case 6:
            bulan_+= " Juni ";
            break; 
        case 5:
            bulan_+= " Mei ";
            break;
        case 4:
            bulan_+= " April ";
            break;
        case 3:
            bulan_+= " Maret ";
            break;
        case 2:
            bulan_+= " Februari ";
            break;
        case 1:
            bulan_+= " Januari ";
            break;
        default:
        break;
        }
        
        return tanggal + bulan_+ tahun_;
    }
}