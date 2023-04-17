public class Anggota {
    String nama, nim, jabatan, bahasaPemrograman;
    int semester, umur;

    public Anggota(String nama, String nim, String jabatan, String bahasaPemrograman, int semester, int umur) {
        this.nama = nama;
        this.nim = nim;
        this.jabatan = jabatan;
        this.bahasaPemrograman = bahasaPemrograman;
        this.semester = semester;
        this.umur = umur;
    }

    public void infoAnggota() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Bahasa Pemrograman: " + bahasaPemrograman);
        System.out.println("Semester: " + semester);
        System.out.println("Umur: " + umur);
    }
}