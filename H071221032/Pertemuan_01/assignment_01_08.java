package H071221032.Pertemuan01;
import java.util.Scanner;

public class assignment_01_08 {
    public static void main(String[] args) {
        Scanner uinput = new Scanner(System.in);
        int find = uinput.nextInt();

        int[][] matriks = {{1,2,3}, {6,4,5}, {7,8,9}};

        for (int i = 0;i < matriks.length;i++) {
            for (int x=0;x<matriks[i].length;x++) {
                if (matriks[i][x] == find) {
                    System.out.println("Found " + find + " at [" + i + "][" + x + "]");
                    System.exit(0);
                }
            }
        }
    }
}
