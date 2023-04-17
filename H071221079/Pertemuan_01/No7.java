import java.util.Scanner;
public class No7 {
        
        public static void main(String[] args) {
            String[] tempat = {"Maros", "Sudiang", "Pangkep", "Makassar", "Parepare", "Jakarta", "Malino", "Batam", "Medan",
            "BTP", "Jogja"};
            Scanner inp = new Scanner(System.in);
            System.out.print("tempat: ");
            String inputTempat = inp.next();
            int indexTempat = findIndex(inputTempat, tempat);
            System.out.println(indexTempat);
            inp.close();
        }
        static int findIndex(String text, String[]tempat){
            text = text.toLowerCase();
            int result = -1;
            for (int i = 0; i < tempat.length; i++) {
                String tempat1 = tempat[i];
            if (tempat1.equalsIgnoreCase(text)){
                result += i+1;
                }
            };
            return result;
        }
}