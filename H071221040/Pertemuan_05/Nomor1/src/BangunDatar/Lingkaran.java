package BangunDatar;

public class Lingkaran extends BangunDatar {
    private int jarijari;

    double getluas() {
        return Math.PI*(jarijari*jarijari);
    }
    double getkeliling() {
        return 2*Math.PI*jarijari;
    }
    public void setJarijari(int jarijari) {
        this.jarijari = jarijari;
    }
    
}

