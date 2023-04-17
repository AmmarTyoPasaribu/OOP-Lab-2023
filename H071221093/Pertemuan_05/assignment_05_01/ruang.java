package no1;

public class ruang extends dimensi {
    public void showOption(){
        System.out.println("==== BANGUN RUANG ====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
        System.out.print(">");
    }

    public void kubus(int panjang, int lebar, int tinggi){
        volume("KUBUS");
        System.out.println(panjang*lebar*tinggi);
        luasPermukaan("KUBUS");
        System.out.println(2*(panjang*lebar*panjang*tinggi*lebar*tinggi));
    }
    public void balok(int panjang, int lebar, int tinggi){
        volume("BALOK");
        System.out.println(panjang*lebar*tinggi);
        luasPermukaan("BALOK");
        System.out.println(2*(panjang*lebar*panjang*tinggi*lebar*tinggi));
    }
    public void bola(int jari){
        volume("BOLA");
        System.out.println(4*(phi*Math.pow(jari, 3)/3));
        luasPermukaan("BOLA");
        System.out.println(4*(phi*Math.pow(jari, 2)));
    }
    public void tabung(int jari, int tinggi){
        volume("TABUNG");
        System.out.println(phi*Math.pow(jari, 2)*tinggi);
        luasPermukaan("TABUNG");
        System.out.println(2*(phi*jari*(jari+tinggi)));
    }

}
