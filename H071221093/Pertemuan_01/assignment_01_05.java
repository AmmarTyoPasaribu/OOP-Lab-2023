import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String tanggal = inp.nextLine();
        String [] arraytanggal = tanggal.split("-");
        // System.out.println(arraytanggal);
        int [] arraytanggal2 = new int [3];

        String [] bulan =  {"januari", "februari", "maret", "april", "mei", "juni", "juli", "agustus", "september", "oktober", "november", "desember"};

        for (int i = 0; i < arraytanggal.length; i++) {
            arraytanggal2[i] =  Integer.parseInt(arraytanggal[i]);
        }
        int tahun = arraytanggal2[2];
        String tahun2 = "";
        if (tahun >= 0 && tahun < 30){
            tahun2 = "20" + arraytanggal[2];
        } else {
            tahun2 = "19" + arraytanggal[2];
        }
        System.out.println(arraytanggal2[0] + " " + bulan[arraytanggal2[1]-1]+ " " + tahun2);
        
        
        inp.close();
        
    }
}
