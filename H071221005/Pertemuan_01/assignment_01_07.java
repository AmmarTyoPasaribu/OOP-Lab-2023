package H071221005.Pertemuan_01;

import java.util.Scanner;
public class assignment_01_07 {
 public static void main(String[] args) {
      String[] arrayString = {"Indonesia","Malaysia","Thailand"};
      Scanner sc = new Scanner(System.in);
      System.out.println("Input : ");
      String input_negara = sc.nextLine();
      
      // memanggil method untuk mencari indeks dari yang kita input
      int cari_indeks = cari_indeks(arrayString,input_negara); 
      // jika hasil dari variabel "cari_indeks" sama  dengan -1 maka outpunya satu,namun jika tidak maka output yang keluar ialah angka indeks yang sesuai dengan inputan yang kita masukan. 
      if (cari_indeks == -1){
          System.out.println("-1");
      }else{
        System.out.println("Terdapat pada Indeks Ke : "+cari_indeks);
        }      
      sc.close();    
      }   
  
  //membuat method untuk mengecek indeks pada array
  public static int cari_indeks(String[] arrayString,String string_text){
    int indeks= -1;
    
    //jika yang kita input adalah Indonesia maka indeks yang tadinya -1 berubah menjadi "0" karena Indonesia terletak pada indeks ke "0",jika yang kita input adalah indonesia "i" nya huruf kecil, indeksnya juga akan berubah "0" karena saya menggunakan "equalsIgnoreCase" yang berfungsi untuk tidak membedakan antara "I" dan juga "i".
    for (int i = 0;i < arrayString.length;i++){
        if(arrayString[i].equalsIgnoreCase(string_text)){
          indeks = i;
          break;
          }
          
    
    }
    // lalu saya menggunakan return indeks 
    return indeks;
  }
    
}

