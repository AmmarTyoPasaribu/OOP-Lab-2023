package H071221005.Pertemuan_04.assignment_04_01.models;

public class Profile {
    private String namalengkap,namapanggilan,hobby;
    private int umur;
    public Profile() {
    }

    public Profile(String namalengkap, String hobby, int umur) {
        this.namalengkap = namalengkap;
        this.hobby = hobby;
        this.umur = umur;
    }

    public String getNamalengkap() {
        return namalengkap;
    }
    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }
    public String getNamapanggilan() {
        return namapanggilan;
    }
    public void setNamapanggilan(String namapanggilan) {
        this.namapanggilan = namapanggilan;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
}
