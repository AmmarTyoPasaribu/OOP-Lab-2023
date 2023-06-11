package H071221005.Pertemuan_01;

import java.util.Scanner;

class assignment_01_02{
    
    public static void main(String[] args) {
        int jumlah_input,bilangan_bulat,bilangan_desimal;
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Jumlah Inputan : ");
        jumlah_input = sc.nextInt();
        bilangan_bulat = 0;
        bilangan_desimal = 0;
        // disini saya membuat variable inputan dengan tipe data Integer dengan nama "jumlah_input_int" dan juga variabel inputan dengan tipe data double.gunanya try ialah jika yang kita input pada variabel "jumlah_input_int" bukan tipe data Integer maka program tidak langsung error,melainkan akan menjalankan program yang ada di dalam "catch" 
        try{
            for (int i = 0;i<jumlah_input;i++){
                try{
                    sc.nextInt();
                    bilangan_bulat += 1;
                    
                }catch(Exception e){
                    sc.nextDouble();
                    bilangan_desimal += 1;
                       
                }
            }
            
          
        System.out.println(bilangan_bulat + " Bilangan Bulat");  
        System.out.println(bilangan_desimal + " Bilangan Desimal");
        }catch(Exception e){
        System.out.println("Input Angka!!!");
        sc.close();
        }    
    }
        
}  


    
