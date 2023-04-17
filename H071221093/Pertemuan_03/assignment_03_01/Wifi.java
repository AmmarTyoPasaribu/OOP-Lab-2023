// package DLL.Wifi;
public class Wifi {
    String nama;
    int kecepatan, cakupanArea, harga, Luasdaerah;


    public Wifi() {

    }

    public Wifi(String nama, int kecepatan, int cakupanArea, int harga, int luasdaerah) {
        this.nama = nama;
        this.kecepatan = kecepatan;
        this.cakupanArea = cakupanArea;
        this.harga = harga;
        this.Luasdaerah = luasdaerah;
    }


    public void tampilkanPower() {
        System.out.println("\n========== Power Wifi ==========");
        System.out.println("Nama Wifi     : " + this.getNama());
        System.out.println("Kecepatan Wifi Sebesar " + this.getKecepatan() + " MBPS ");
        System.out.println("Harga unntuk jenis wifi ini adalah Rp" + this.getHarga());
        System.out.println("Area jangkauan wifi ini sebesar " + this.getCakupanArea() + " Meter ");
    }

    public void upgradeWifi(int cakupanArea) { 
        if (cakupanArea > this.Luasdaerah) { 
            System.out.println("Tidak bisa Menambah Luas Area jaringan");
        } else {
            this.setCakupanArea(this.getCakupanArea()+cakupanArea);;

            System.out.printf("\nMenambahkan Luas Area ke %s sebesar %d Meter\n", this.getNama(), cakupanArea);
        } // format print %s itu string %d itu integer
    }

    public void setHarga(int Harga) {
        this.harga = Harga;
    }

    public void setCakupanArea(int CakupanArea) {
        this.cakupanArea = CakupanArea;
    }

    public void setKecepatan(int Kecepatan) {
        this.kecepatan = Kecepatan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getCakupanArea() {
        return cakupanArea;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public String getNama() {
        return nama;
    }

    public int getLuasdaerah() {
        return Luasdaerah;
    }


    public void setLuasdaerah(int luasdaerah) {
        Luasdaerah = luasdaerah;
    }

}
