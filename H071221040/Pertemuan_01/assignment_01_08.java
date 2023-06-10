import java.util.Scanner;

public class Nomor08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] duadimensi = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[] index = new int[2]; //menyimpan nilai indeks ke dalam sebuah array
        try {
            System.out.print("");
            int n = input.nextInt();
            input.nextLine();
            index[0] = -1;
            index[1] = -1;
            for (int i = 0; i < duadimensi.length; i++) {
                for (int j = 0; j < duadimensi[i].length; j++) {
                    if (duadimensi[i][j] == n) {
                        index[0] = i;
                        index[1] = j;
                        break;
                    }
                }
            }
            if (index[0] == -1 && index[1] == -1) {
                System.out.println("Masukkan angka yang terdapat dalam array dua dimensi");
            } else {
                System.out.println("Found " + n + " at [" + index[0] + "][" + index[1] + "]");
            }

        } catch (Exception e) {
            System.out.println("Masukkan angka");
        }
        input.close();
    }
    }


