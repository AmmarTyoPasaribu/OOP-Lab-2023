import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        String [] namaMakanan = {"Burger" , "Pizza" , "Spaghetti" , "Lasagna" , "Sushi"} ; //digunakan utk membuat array
        Scanner input = new Scanner (System.in) ;
        System.out.print("Masukkan nama makanan yang dicari :");
        String cari = input.nextLine() ;
        input.close() ; 

        System.out.println(findIndex(namaMakanan, cari));
    }   
    public static int findIndex (String[] array, String teks) { //method dgn 2 parameter input yaitu array bertipe string dan teks bertipe string yg mengembalikan sebuah nilai bertipe int
        for (int i = 0; i < array.length; i++) { // array.length = panjang array
            if (array[i].equalsIgnoreCase(teks)) {   //membandingkan dua string dgn mengabaikan besar-kecilnya
                return i ;
            }
        }
        return -1 ;  //soal
    }
}
