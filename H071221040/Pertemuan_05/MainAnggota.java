public class MainAnggota {
    public static void main(String[] args) {
        PengurusInti pengurusinti = new PengurusInti("Diva", 19, "Perempuan", "Ketua Umum");
        System.out.println("Nama\t: " + pengurusinti.getNama());
        System.out.println("Umur\t: " + pengurusinti.getUmur());
        System.out.println("Gender\t: " + pengurusinti.getGender());
        System.out.println("Jabatan\t : " + pengurusinti.getJabatan());

        KordinatorBidangStaff kordinatorBidangStaff = new KordinatorBidangStaff("Fathan", 19, "Laki-laki", "Keagamaan");
        System.out.println("Nama\t: " + kordinatorBidangStaff.getNama());
        System.out.println("Umur\t: " + kordinatorBidangStaff.getUmur());
        System.out.println("Gender\t: " + kordinatorBidangStaff.getGender());
        System.out.println("Bidang\t: " + kordinatorBidangStaff.getBidang());
        }
}
