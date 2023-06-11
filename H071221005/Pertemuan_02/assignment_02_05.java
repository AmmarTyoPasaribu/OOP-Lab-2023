package H071221005.Pertemuan_02;

class Alamat{
    String jalan;
    String kota;

    String getAlamatLengkap(){
        return kota+ ","+jalan;
    }
}
class Mahasiswa{
    String nama;
    String nim;
    Alamat alamat;

    String getNama(){
        return nama;
    }
    String getNim(){
       return nim; 
    }
    Alamat getAlamat(){
        return alamat;
    }
    }


public class assignment_02_05 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "BTP Blok M";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Raehan";
        mahasiswa.nim = "H071221005";

        System.out.println("Nama: "+mahasiswa.getNama());
        System.out.println("NIM: "+mahasiswa.getNim());
        System.out.println("Alamat: "+ mahasiswa.getAlamat().getAlamatLengkap()); 
    }
}
