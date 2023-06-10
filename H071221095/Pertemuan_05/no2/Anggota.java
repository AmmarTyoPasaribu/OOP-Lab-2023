package no2;
public class Anggota {
    private String nama;
    private int umur;
    private String gender;

    public Anggota (String nama, int umur, String gender){
        this.nama = nama ;
        this.umur = umur;
        this.gender = gender;
    }
    public String getName() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public int getAge() {
        return umur;
    }

    public void setAge(int umur) {
        this.umur = umur;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}


