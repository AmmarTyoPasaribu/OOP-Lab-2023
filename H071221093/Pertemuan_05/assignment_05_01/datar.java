package no1;

public class datar extends dimensi {
    public void showOption(){
        System.out.println("==== BANGUN DATAR ====");
        System.out.println("1. PERSEGI");
        System.out.println("2. PERSEGI PANJANG");
        System.out.println("3. LINGKARAN");
        System.out.println("4. SEGITIGA");
        System.out.println("5. TRAPESIUM");
        System.out.print(">");
    }

    public void persegi(int panjang, int lebar){
        luas("PERSEGI");
        System.out.println(panjang*lebar);
        keliling("PERSEGI");
        System.out.println(4*panjang);
    }
    public void persegiPanjang(int panjang, int lebar){
        luas("PERSEGI PANJANG");
        System.out.println(panjang*lebar);
        keliling("PERSEGI PANJANG");
        System.out.println((2*panjang)+(2*lebar));
    }
    public void lingkaran(int jari){
        luas("LINGKARAN");
        System.out.println(phi*Math.pow(jari, 2));
        keliling("LINGKARAN");
        System.out.println(2*(phi*jari));
    }
    public void segitiga(int tinggi, int alas, int sisi2, int sisi3 ){
        luas("SEGITIGA");
        System.out.println(0.5*alas*tinggi);
        keliling("SEGITIGA");
        System.out.println(alas+sisi2+sisi3);
    }
    public void trapesium(int alasA, int alasB, int tinggi, int sisiA, int sisiB, int sisiC, int sisiD){
        luas("TRAPESIUM");
        System.out.println(0.5*(alasA+alasB)*tinggi);
        keliling("TRAPESIUM");
        System.out.println(sisiA+sisiB+sisiC+sisiD);

    }
}
