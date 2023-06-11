package H071221005.Pertemuan_01;

import java.util.Scanner;
class assignment_01_03{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Membuat variabel nama,hobby dengan tipe data String lalu variabel umur dengan tipe data Integer.
        String nama,hobby;
        int umur;
        System.out.print("Nama : ");
        // membuat variabel nama,umur,hobby untuk menginputnya.
        nama = sc.next();
        //gunanya try yaitu jika yang kita input di dalam try itu bukan sesuai dengan tipe data variabelnya maka output nya tidak akan error melainkan akan menjalan kan program yang berada di catch yaitu "Bukan Angka!" 
        try{
        System.out.print("Umur : ");
        umur = sc.nextInt();
        

        System.out.print("Hobby : ");
        hobby = sc.next();

        System.out.printf("Nama Saya %s,%d Tahun,Hobby Saya %s",nama,umur,hobby);
        }catch(Exception e){
        System.out.println("Bukan Angka!");
        
        }
        sc.close();
    }
}    