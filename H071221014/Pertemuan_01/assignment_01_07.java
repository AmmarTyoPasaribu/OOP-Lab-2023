import java.util.Scanner;


public class assignment_01_07 {

    static String[] buah = {"Anggur", "Apel", "Belimbing", "Durian", "Rambutan", "Pisang", "Jeruk", "Semangka", "Nanas", "Salak", "manggis"};

    public static void main(String[] args) {
        // String[] buah = {"Anggur", "Apel", "Belimbing", "Durian", "Rambutan", "Pisang", "Jeruk", "Semangka", "Nanas", "Salak", "manggis"};

        Scanner inp = new Scanner(System.in);
        System.out.print("Key: ");
        String inputBuah = inp.next();
        int indexBuah = findIndex(inputBuah);
        System.out.println(indexBuah);
        inp.close();
    }
    static int findIndex(String text){
        // String[] buah = {"Anggur", "Apel", "Belimbing", "Durian", "Rambutan", "Pisang", "Jeruk", "Semangka", "Nanas","Salak", "manggis"};

        text = text.toLowerCase();
        int result = -1;
        for (int i = 0; i < buah.length; i++) {
            String buah1 = buah[i];

            if (buah1.equalsIgnoreCase(text)){
                result += i+1;
            }
        };
        return result;
    }
}