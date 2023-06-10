class Mahasiswa{
    String name;
    String nim;
    Alamat alamat; //karena value yg diisi berupa objek alamat 

    public String getNama(){
        return name;
    }
    public String getNim(){
        return nim;
    }
    public Alamat getAlamat(){
        return alamat;
    }
}

class Alamat {
    String jalan;
    String kota;

    public String getAlamatLengkap() {
        return jalan + "," + kota;
    }
}


public class No5{
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Daya";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.name = "Salsaaa";
        mahasiswa.nim = "H071221095";

        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("NIM : " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}
