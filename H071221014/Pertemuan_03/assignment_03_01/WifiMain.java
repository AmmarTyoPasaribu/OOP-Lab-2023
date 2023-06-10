public class WifiMain {
    public static void main(String[] args) {
        Wifi Indihome = new Wifi(); //instance objek indihome
        Wifi XlHome = new Wifi("XL HOME", 30, 200,400000,88); //instance objek indihome

        //set nama, kecepatan, cakupan area, harga dan luas daerah
        Indihome.setNama("myIndihome");
        Indihome.setKecepatan(40);
        Indihome.setCakupanArea(100);
        Indihome.setHarga(350000);
        Indihome.setLuasdaerah(100);


        //menampilkan power
        Indihome.tampilkanPower();
        XlHome.tampilkanPower();
        //upgrade wifi
        XlHome.upgradeWifi(5);
        Indihome.upgradeWifi(5);
        
        Indihome.tampilkanPower();
        XlHome.tampilkanPower();

    }
}
