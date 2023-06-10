import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);

        try{
            System.out.print("Nama :");
            String name = input.nextLine();

            System.out.print("Umur :");
            int umur = input.nextInt();
            input.nextLine();  //baris 

            System.out.print("Hobi :");  
            String hobi = input.nextLine();

            // int a = 0;
            // System.out.printf("nilai a %.2f sfrwdge %s", a, name);
            System.out.printf("Nama saya %s , Umur saya %d Tahun , Hobi saya %s" , name , umur , hobi);
        } catch (Exception e) {
            System.out.print("Umur harus berupa angka");
        }
        input.close() ; 
    }
}
