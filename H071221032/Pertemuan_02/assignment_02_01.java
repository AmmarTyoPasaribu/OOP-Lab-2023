package H071221032.Pertemuan02;

class FitnessApp {
    int targetKalori;
    int kaloriTerbakar;
    int durasiWorkout; //second
    String jenisWorkout;

    public void hasilWorkout() {
        System.out.println("Kalori yang dibakar setelah "+ durasiWorkout/360 + "menit: " + kaloriTerbakar + "/" + targetKalori);
    }
    public void mulaiWorkout() {
        System.out.println("Memulai workout: " + jenisWorkout + " selama " + durasiWorkout/360 + " menit");
    }
}

public class assignment_02_01 {
    public static void main(String[] args) {
        FitnessApp user1 = new FitnessApp();
        user1.jenisWorkout = "Lari Sprint";
        user1.durasiWorkout = 3600;
        user1.targetKalori = 250;
        user1.mulaiWorkout();
    }
}
