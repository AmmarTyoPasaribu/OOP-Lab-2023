package H071221032.Pertemuan01;
import java.util.Scanner;


public class assignment_01_02 {
    public static void main(String[] args) {
        Scanner uinput = new Scanner(System.in);
        int n = 0;
        try {n = uinput.nextInt();}
        catch (Exception e) {System.out.println("Input error");System.exit(0);}
        uinput.nextLine();

        String[] nums = uinput.nextLine().split(" ");
        if (nums.length!=n) {System.out.println("Panjang inputan tidak sesuai");System.exit(0);}

        float[] floatNums = new float[n];
        for (int i=0;i<n;i++) {
            try {floatNums[i] = Float.parseFloat(nums[i]);}
            catch (Exception e) {System.out.println("Inputan tidak valid");System.exit(0);}
        }

        int bulat=0, desimal=0;
        for (float i: floatNums) {
            if (i%1 == 0) {
                bulat++;
            }
            else {
                desimal++;
            }
        }

        System.out.println(bulat + " Bilangan Bulat\n" + desimal + " Bilangan Desimal");
    }
}
