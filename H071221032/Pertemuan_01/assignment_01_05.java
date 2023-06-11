package H071221032.Pertemuan01;
import java.util.Scanner;

public class assignment_01_05 {
    public static void main(String[] args) {
        Scanner uinput = new Scanner(System.in);
        String[] date = uinput.nextLine().split("-");

        int[] strToInt = new int[3];
        for (int i = 0;i < 3;i++) {
            strToInt[i] = Integer.parseInt(date[i]);
        }
        String monthName;

        switch (strToInt[1]) {
            case 1:
                monthName = "Januari";
                break;
            case 2:
                monthName = "Februari";
                break;
            case 3:
                monthName = "Maret";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "Mei";
                break;
            case 6:
                monthName = "Juni";
                break;
            case 7:
                monthName = "Juli";
                break;
            case 8:
                monthName = "Augustus";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "Oktober";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "Desember";
                break;
            default:
                monthName = "BulanTidakValid";
                break;
        }

        if (strToInt[2] <= 23) {strToInt[2] += 2000;}
        else {strToInt[2]+=1900;}

        System.out.println(strToInt[0] + " " + monthName + " " + strToInt[2]);
    }
}
