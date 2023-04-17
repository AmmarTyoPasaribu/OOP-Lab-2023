public class Tabung2 extends BangunRuang2 {
    double jarijaritabung;
    double tinggitabung;
    public Tabung2(double jarijaritabung, double tinggitabung ) {
        super(jarijaritabung);
        this.tinggitabung=tinggitabung;

    }

    public void luasPermukaanTabung(){
        System.out.println("LUas Tabung ="+(2*Math.PI*super.sisi2* (super.sisi2 + tinggitabung)));
        System.out.println("Volume Tabung ="+(Math.PI*Math.pow(super.sisi2, 2)*tinggitabung));
    }
    }

