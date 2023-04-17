package H071221032.Pertemuan02;

class Alamat {
    String jalan, kota;

    public String getAlamatLengkap() {
        return (jalan + ", " + kota);
    }
}

class Mahasiswa {
    String nama, nim;
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

public class assignment_02_05 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Jalan Saripah 2";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Azka";
        mahasiswa.nim = "H071221032";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}
