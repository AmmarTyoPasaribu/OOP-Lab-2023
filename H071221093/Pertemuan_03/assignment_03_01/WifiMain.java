public class WifiMain {
    public static void main(String[] args) {
        Wifi Indihome = new Wifi();
        Wifi XlHome = new Wifi("XL HOME", 30, 200,400000,88);

        Indihome.setNama("myIndihome");
        Indihome.setKecepatan(40);
        Indihome.setCakupanArea(100);
        Indihome.setHarga(350000);
        Indihome.setLuasdaerah(100);


        
        Indihome.tampilkanPower();
        XlHome.tampilkanPower();

        XlHome.upgradeWifi(5);
        Indihome.upgradeWifi(5);
        
        Indihome.tampilkanPower();
        XlHome.tampilkanPower();

    }
}
