import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // scanner.close();
        try {
            System.out.print("Masukkan satu bilangan : ");
            int bilangan = scanner.nextInt();
            scanner.close();

        int[][] array2D = {{1,2,3}, {4,5,6}, {7,8,9}};
        boolean found = false;

        for (int i = 0; i < array2D.length; i++) { //i yaitu indeks dlm kurawal warna kuning
            for (int j = 0; j < array2D[i].length; j++) { //j yaitu indeks dlm kurawal warna ungu
                if (array2D[i][j] == bilangan) {
                    System.out.printf("Bilangan %d ditemukan pada indeks [%d][%d]", bilangan , i, j );
                    // System.out.println("Bilangan " + bilangan + " ditemukan pada indeks [" + i + "][" + j + "]");
                    return; //spy dikembalikan nilai
                }
            }          
        }
        if (!found) {
            System.out.print("Bilangan " + bilangan + " tidak ditemukan pada array 2D");
        } 
        } catch (Exception e) {
            System.out.print("Inputan harus berupa angka");

        }
       
    }
}
