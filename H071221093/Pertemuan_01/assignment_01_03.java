import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
            try {
                System.out.print("Nama : ");
                String a = inp.nextLine();       
                System.out.print("Umur : ");
                int b = inp.nextInt();
                inp.nextLine();
                System.out.print("Hobi : ");
                String c = inp.nextLine();
                System.out.printf("nama saya %s , %d tahun , hobi %s", a, b, c );
            } catch (Exception e) {
                System.out.println("inputan umur harus berupa angka");
            }
        inp.close();
    }
    
}
