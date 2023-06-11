package H071221005.Pertemuan_01;

import java.util.Scanner;
public class assignment_01_08 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] matriks= {{1,2,3},{4,5,6},{7,8,9}};
    System.out.println("Masukkan : ");
    try{
        int bilangan = sc.nextInt();
        for (int i = 0; i < matriks.length; i++){
            for (int j = 0; j < matriks.length; j++) {
                if (matriks[i][j] == bilangan){
                    System.out.printf("Found %d at [%d][%d] ",bilangan,i,j);
                }
                
                }
            }
    }catch(Exception e){
        System.out.println("Erorr !!!");
    }       
    sc.close();
    } 

}

