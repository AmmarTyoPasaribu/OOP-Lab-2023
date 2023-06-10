import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        try{
        int bilBulat,bilDesimal,n,i;

        bilBulat = 0;    //knp 0? karena hrs dimulai dr 0
        bilDesimal = 0;

            System.out.print("Masukkan Jumlah Bilangan : ");
            n = input.nextInt();
            input.nextLine();

            for(i = 0; i < n; i++) {
                double angka = input.nextDouble();  //mencari nilai yang double atau float klo di python
                if (angka % 1 == 0 ) { 
                    bilBulat++;
                } else {
                    bilDesimal++;
                }
            }
            System.out.println(bilBulat + " Bilangan Bulat");
            System.out.println(bilDesimal + " Bilangan Desimal");
            
        } catch (Exception e) { //utk menangkap error pada kode spy ttp jalan
            System.out.println("Input Harus Berupa Angka");
            input.close() ;
        }
    }
}