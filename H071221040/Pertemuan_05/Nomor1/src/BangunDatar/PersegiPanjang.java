package BangunDatar;

public class PersegiPanjang extends BangunDatar {
    private int panjang;
    private int lebar;

    
    public double getLuas() {
        return panjang*lebar;
    }

    public double getKeliling() {
        return 2*(panjang+lebar);
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    
}