public class Main {
    public static void main(String[] args) {
        PengurusInti pengurusInti1 = new PengurusInti("Adrian", 19, "Laki-laki", "Ketua");
        System.out.println("========================");
        System.out.println("Nama\t: " + pengurusInti1.getNama());
        System.out.println("Umur\t: " + pengurusInti1.getUmur());
        System.out.println("Gender\t: " + pengurusInti1.getGender());
        System.out.println("Jabatan\t: " + pengurusInti1.getJabatan());
        System.out.println("========================");

        PengurusInti pengurusInti2 = new PengurusInti("Nakita", 19, "Perempuan", "Wakil Ketua") ;
        System.out.println("Nama\t: " + pengurusInti2.getNama());
        System.out.println("Umur\t: " + pengurusInti2.getUmur());
        System.out.println("Gender\t: " + pengurusInti2.getGender());
        System.out.println("Jabatan\t: " + pengurusInti2.getJabatan());
        System.out.println("========================");

        PengurusInti pengurusInti3 = new PengurusInti("Cheryl", 19, "Perempuan", "Sekretaris Umum");
        System.out.println("Nama\t: " + pengurusInti3.getNama());
        System.out.println("Umur\t: " + pengurusInti3.getUmur());
        System.out.println("Gender\t: " + pengurusInti3.getGender());
        System.out.println("Jabatan\t: " + pengurusInti3.getJabatan());
        System.out.println("========================");


        PengurusInti pengurusInti4 = new PengurusInti("Awa", 19, "Perempuan", "Bendahara Umum");
        System.out.println("Nama\t: " + pengurusInti4.getNama());
        System.out.println("Umur\t: " + pengurusInti4.getUmur());
        System.out.println("Gender\t: " + pengurusInti4.getGender());
        System.out.println("Jabatan\t: " + pengurusInti4.getJabatan());
        System.out.println("========================");

        Bidang kordinatorBidang1 = new Bidang("Arni", 19, "Perempuan", "Publikasi dan Dokumentasi");
        System.out.println("Nama\t: " + kordinatorBidang1.getNama());
        System.out.println("Umur\t: " + kordinatorBidang1.getUmur());
        System.out.println("Gender\t: " + kordinatorBidang1.getGender());
        System.out.println("Jabatan\t: " + kordinatorBidang1.getNamaBidang());
        System.out.println("========================");


        Bidang kordinatorBidang2 = new Bidang("Diva", 19, "Perempuan", "Hubungan Masyarakat");
        System.out.println("Nama\t: " + kordinatorBidang2.getNama());
        System.out.println("Umur\t: " + kordinatorBidang2.getUmur());
        System.out.println("Gender\t: " + kordinatorBidang2.getGender());
        System.out.println("Jabatan\t: " + kordinatorBidang2.getNamaBidang());
        System.out.println("========================");

        Bidang kordinatorBidang3 = new Bidang("Salsa", 19, "Perempuan", "Dana dan Usaha");
        System.out.println("Nama\t: " + kordinatorBidang3.getNama());
        System.out.println("Umur\t: " + kordinatorBidang3.getUmur());
        System.out.println("Gender\t: " + kordinatorBidang3.getGender());
        System.out.println("Jabatan\t: " + kordinatorBidang3.getNamaBidang());
        System.out.println("========================");

        Staf kordinatorStaf1 = new Staf("Evan", 19, "Laki-laki", "Keamanan");
        System.out.println("Nama\t: " + kordinatorStaf1.getNama());
        System.out.println("Umur\t: " + kordinatorStaf1.getUmur());
        System.out.println("Gender\t: " + kordinatorStaf1.getGender());
        System.out.println("Jabatan\t: " + kordinatorStaf1.getNamaStaf());
        System.out.println("========================");

        Staf kordinatorStaf2 = new Staf("Ojan", 19, "Laki-laki", "Kebersihan");
        System.out.println("Nama\t: " + kordinatorStaf2.getNama());
        System.out.println("Umur\t: " + kordinatorStaf2.getUmur());
        System.out.println("Gender\t: " + kordinatorStaf2.getGender());
        System.out.println("Jabatan\t: " + kordinatorStaf2.getNamaStaf());
        System.out.println("========================");

        Staf kordinatorStaf3 = new Staf("Fathan", 19, "Laki-laki", "Keagamaan");
        System.out.println("Nama\t: " + kordinatorStaf3.getNama());
        System.out.println("Umur\t: " + kordinatorStaf3.getUmur());
        System.out.println("Gender\t: " + kordinatorStaf3.getGender());
        System.out.println("Jabatan\t: " + kordinatorStaf3.getNamaStaf());
        System.out.println("========================");

    }  
}
