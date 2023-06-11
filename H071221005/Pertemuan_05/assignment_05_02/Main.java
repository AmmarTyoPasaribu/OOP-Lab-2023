package H071221005.Pertemuan_05.assignment_05_02;

public class Main {
    public static void main(String[] args) {
        PengurusInti pengurusInti = new PengurusInti("Bejo", "Sistem Informasi", "MIPA", "2019", "Pengurus Inti");
        pengurusInti.DataDiri();
        pengurusInti.Tugas();

        KoordinatorBidangStaff koordinatorBidang = new KoordinatorBidangStaff("Udin", "Teknik Informatika", "Teknik", "2021", "Koordinator Bidang dan Staff");
        koordinatorBidang.DataDiri();
        koordinatorBidang.Tugas();

        
    }
}
