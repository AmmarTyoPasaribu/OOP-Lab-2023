class Brand{
    String nama;
    String penemu;
    int tahuntemu;
    String jenis;

//setter getter
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getPenemu() {
        return penemu;
    }
    public void setPenemu(String penemu) {
        this.penemu = penemu;
    }
    public int getTahuntemu() {
        return tahuntemu;
    }
    public void setTahunTemu(int tahuntemu) {
        this.tahuntemu = tahuntemu;
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

//behaviour

    public void getDetail() {
        System.out.println("Nama\t\t:" + nama);
        System.out.println("Penemu\t\t:" + penemu);
        System.out.println("Tahun Temu\t:" + tahuntemu);
        System.out.println("Jenis\t\t:" + jenis);
    }

    public void createAnEvent(String event){
        System.out.println(nama + " membuat event " + event);
    }

//constructor

    public Brand (String nama, int tahuntemu){
        this.nama = nama;
        this.tahuntemu = tahuntemu;
    }
}

public class Nomor01{
    public static void main(String[] args) {
        Brand brand = new Brand("Nike",2023);
        brand.setPenemu("Phill Knight");
        brand.setJenis("Sports");
        brand.getDetail();
        brand.createAnEvent("Run All Night");
    }
}