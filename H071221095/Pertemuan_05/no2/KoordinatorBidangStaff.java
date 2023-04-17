package no2;

class KoordinatorBidangStaff extends Anggota{
    private String bidang;

    public KoordinatorBidangStaff(String nama, int umur, String gender, String bidang){
        super(nama, umur, gender);
        this.bidang = bidang;
    }
    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }
}
