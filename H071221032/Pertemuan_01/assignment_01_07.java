package H071221032.Pertemuan01;
public class assignment_01_07 {

    public static void main(String[] args) {
        String[] kota = {"Makassar", "Jakarta", "Bandung", "Jayapura"};
        System.out.println(finIndex(kota, "makassar"));
    }

    static int finIndex(String[] array, String str) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }
}
