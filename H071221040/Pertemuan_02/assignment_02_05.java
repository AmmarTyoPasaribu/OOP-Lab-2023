class Alamat {
    String jalan;
    String kota;
  
    public String getAlamatLengkap() {
      return jalan + ", " + kota;
    }
  }
  
  class Mahasiswa {
    Alamat alamat;
    String nama;
    String nim;
  
    public Alamat getAlamat() {
      return alamat;
    }
  
    public String getName() {
      return nama;
    }
  
    public String getNim() {
      return nim;
    }
  }
  
  public class Nomor05 {
    public static void main(String[] args) {
      Alamat alamat = new Alamat();
      alamat.jalan = "Perdos Unhas";
      alamat.kota = "Makassar";
  
      Mahasiswa mahasiswa = new Mahasiswa();
      mahasiswa.alamat = alamat;
      mahasiswa.nama = "Nakita";
      mahasiswa.nim = "H071221040";
  
      System.out.println("Nama\t: " + mahasiswa.getName());
      System.out.println("NIM\t: " + mahasiswa.getNim());
      System.out.println("Alamat\t: " + mahasiswa.getAlamat().getAlamatLengkap());
    }
  }