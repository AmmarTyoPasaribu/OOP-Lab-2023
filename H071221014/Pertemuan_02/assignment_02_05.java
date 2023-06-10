class Alamat{
    String jalan;
    String kota;

    public String getAlamatLengkap(){
        return jalan + ", " + kota;
    }
}

class Mahasiswa{
    String nama;
    String nim;
    Alamat alamat;

    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }

    public Alamat getAlamat(){
        return alamat;
    }
}

public class assignment_02_05 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "ikhsan";
        mahasiswa.nim = "H071191049";
        mahasiswa.alamat = alamat;

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());


    }
}
