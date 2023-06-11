package H071221005.Pertemuan_06;

import H071221005.Pertemuan_06.assignment_06_01.Pitbull;
import H071221005.Pertemuan_06.assignment_06_01.Samsung;
import H071221005.Pertemuan_06.assignment_06_01.Toyota;

public class assignment_06_02 {
    public static void main(String[] args) {
        // Instance Salah Satu Ras Dog
        Pitbull pitbull = new Pitbull(3, 42);
            
        System.out.printf("Panjang Rata-Rata Pitbull : %d Cm\n",pitbull.getAverageLength());
        System.out.printf("Posisi Pitbull Sebelum : %d\n",pitbull.getPosition());
        pitbull.move();
        System.out.printf("Posisi Bulldog Sekarang : %d\n",pitbull.getPosition());
        pitbull.describe();
        System.out.println("=".repeat(50));
        
        // Instance Smartphone
        Samsung samsung = new Samsung(2000000, "Samsung");
        System.out.printf("Brand : %s\nHarga : Rp.%d\n",samsung.getBrand(),samsung.getPrice());
        samsung.move();
        System.out.println("=".repeat(50));
        
        // Instance Car
        Toyota toyota = new Toyota(5, 260, "Black");
        System.out.printf("Total Forward Gear : %d\nMax Speed : %d Km/Jam\nWarna : %s\n",toyota.getTotalForwardGear(),toyota.getMaxSpeed(),toyota.getColor());
        toyota.move();
    }   
}
