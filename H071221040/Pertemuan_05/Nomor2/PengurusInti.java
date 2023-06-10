public class PengurusInti extends Anggota {
    private String jabatan;

    public PengurusInti(String nama, int umur, String gender, String jabatan) {
        super(nama, umur, gender);
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

}





