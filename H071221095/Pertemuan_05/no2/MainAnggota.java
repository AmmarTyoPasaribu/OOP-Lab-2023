package no2;
public class MainAnggota {
    public static void main(String[] args) {
        PengurusInti pengurusInti = new PengurusInti("Salsa", 19, "Wanita", "Ketua Umum");
        System.out.println("Nama : " + pengurusInti.getName());
        System.out.println("Umur : " + pengurusInti.getAge());
        System.out.println("Gender : " + pengurusInti.getGender());
        System.out.println("Jabatan : " + pengurusInti.getJabatan());


        KoordinatorBidangStaff koordinasiBidangStaff = new KoordinatorBidangStaff("Awa", 19,"Wanita", "Humas");
        System.out.println("Nama : " + koordinasiBidangStaff.getName());
        System.out.println("Umur : " + koordinasiBidangStaff.getAge());
        System.out.println("Gender : " + koordinasiBidangStaff.getGender());
        System.out.println("Bidang : " + koordinasiBidangStaff.getBidang());
    }
}
