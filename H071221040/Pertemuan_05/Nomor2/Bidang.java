public class Bidang extends Anggota {
    String namaBidang;

    public String getNamaBidang() {
        return namaBidang;
    }

    public void setNamaBidang(String namaBidang) {
        this.namaBidang = namaBidang;
    }

    public Bidang(String nama, int umur, String gender, String namaBidang) {
        super(nama, umur, gender);
        this.namaBidang = namaBidang;
    }

    public Bidang(String namaBidang) {
        this.namaBidang = namaBidang;
    }

}