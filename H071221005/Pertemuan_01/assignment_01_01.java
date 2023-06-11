package H071221005.Pertemuan_01;


import java.util.Scanner;
public class assignment_01_01 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan NIM : ");
    String nim = sc.nextLine();
    //guna "substring" untuk mengambil indeks sesuai yang kita mau,karna saya disini mengambil 7 maka indeks akan dimulai dari 7 sampai akhir, misalnya "H071221005" lalu saya substring,hasinya ialah "005". 
    String tiga_huruf_terakhir = nim.substring(7);
    
    // lalu saya mengubah tipe data yang tadinya String ke int dengan cara ".parseInt"  
    int ubah_tipe_data = Integer.parseInt(tiga_huruf_terakhir);    
    
    int pembagian_soal = ubah_tipe_data%7;
    // jika hasil sisa pembagian antara "ubah_tipe_data" dengan 7 hasilnya 0,maka akan mendapatkan soal nomor 7,jika hasilnya 1 maka akan mendapatkan soal nomor 1,dan begitu seterusnya
    if (pembagian_soal == 0){
        System.out.printf("NIM : %s\nSoal : 7 ",nim);
        }    
    else if( pembagian_soal == 1){
        System.out.printf("NIM : %s\nSoal : 1 ",nim);
        }
    else if( pembagian_soal == 2){
        System.out.printf("NIM : %s\nSoal : 2 ",nim);
        }
    else if( pembagian_soal == 3){
        System.out.printf("NIM : %s\nSoal : 3 ",nim);                    
        }
    else if( pembagian_soal == 4){
        System.out.printf("NIM : %s\nSoal : 4 ",nim);                    
        }
    else if( pembagian_soal == 5){
        System.out.printf("NIM : %s\nSoal : 5 ",nim);                    
        }               
    else if( pembagian_soal == 6){
        System.out.printf("NIM : %s\nSoal : 6 ",nim);                    
        }     
    sc.close();
    }
}
