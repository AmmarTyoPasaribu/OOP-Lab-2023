public class Staf extends Anggota {
    private String namaStaf;
    
    public String getNamaStaf() {
        return namaStaf;
    }
    
    public void setNamaStaf(String namaStaf) {
        this.namaStaf = namaStaf;
     }
    
    public Staf(String nama, int umur, String gender, String namaStaf) {
        super(nama, umur, gender);
        this.namaStaf = namaStaf;
    }
    
    public Staf(String namaStaf) {
        this.namaStaf = namaStaf;
    }
        
}

