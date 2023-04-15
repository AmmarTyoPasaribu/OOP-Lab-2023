import java.util.Scanner;

public class Nomor07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] makanan = { "sushi", "nasgor", "naskun", "bakso", "tempe", "tahu", "batagor", "esbuah", "jalangkote" };
        //System.out.print(""); 
        String cek = input.nextLine().toLowerCase(); // untuk memasukkan inputan ke dalam variable sekaligus mengubah input menjadi huruf kecil
        findIndex(cek, makanan); //method untuk mengecek indeks
        System.out.println(findIndex1(cek, makanan));
        input.close();
    }

    static int findIndex1(String text, String[] lis) {
        for (int i = 0; i < lis.length; i++) { //perulangan dengan batas panjang array
            if (lis[i].equals(text)) { // mengecek array indeks ke-i apakah sama dengan kalimat yang dimasukkan
                //kalau sama dengan yang diatas, maka indeksnya akan berubah menjadi i
                return i;
            }
        }
        return -1;
    }

    static void findIndex(String text, String[] lis) {
        int index = -1; 
        for (int i = 0; i < lis.length; i++) { //perulangan dengan batas panjang array
            if (lis[i].equals(text)) { // mengecek array indeks ke-i apakah sama dengan kalimat yang dimasukkan
                index = i; //kalau sama dengan yang diatas, maka indeksnya akan berubah menjadi i
                break;
            }
        }
        System.out.println(index);
    }
    }

