public class Anggota {
    private String nama;
    private int umur;
    private String gender;
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Anggota(String nama, int umur, String gender) {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;

    }

    public Anggota() {

    }

}