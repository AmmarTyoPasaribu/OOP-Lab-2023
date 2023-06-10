class Mahasiswa{
    String nama;
    String nim;
    Alamat alamat;
    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    public Alamat getAlamat() {
        return alamat;
    }
}

class Alamat{
    String jalan;
    String kota;

    public void setJalan(String jalan) {
        this.jalan = jalan;

    }
    public void setKota(String kota) {
        this.kota = kota;
    }
    public String getAlamatLengkap(){
        return jalan + ", " + kota;
    }
}

public class Nomor5{
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Nasrun Amirullah";
        alamat.kota = "Maros";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "MaR";
        mahasiswa.nim = "H071221079"; 

        System.out.println("Nama = "+mahasiswa.getNama());
        System.out.println("Nim = "+mahasiswa.getNim());
        System.out.println("Alamat  = "+mahasiswa.getAlamat().getAlamatLengkap());
    }   
}
