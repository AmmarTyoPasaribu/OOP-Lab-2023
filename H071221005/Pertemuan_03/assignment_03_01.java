package H071221005.Pertemuan_03;


class Komputer{
    //Attribut
    String namaKomputer,os,prosesor;
    int ram,penyimpanan;
    
    //Constructur
    public Komputer(){}

    public Komputer(String namaKomputer,String os,String prosesor,int ram,int penyimpanan){
    this.namaKomputer = namaKomputer;
    this.os = os;
    this.prosesor = prosesor;
    this.ram = ram;
    this.penyimpanan = penyimpanan;
    }
    
    //Setter 
    public void setOs(String os){
        this.os = os;
    }
    public void setProsesor(String prosesor){
        this.prosesor = prosesor;
    }
    public void setRam(int ram){
        this.ram = ram;
    }        
    public void setPenyimpanan(int penyimpanan){
        this.penyimpanan = penyimpanan;
    }
    
    
    //Getter
    public String getOs(){
        return os;
    }
    public String getProsesor(){
        return prosesor;
    }
    
    public int getRam(){
        return ram;
    }        
    public int getPenyimpanan(){
        return penyimpanan;
    }
    
    // Behavior
    public void UpgradeRam(int TambahRam) {
     this.ram += TambahRam;
    }
    public void UpgradePenyimpanan(int TambahPenyimpanan){
        this.penyimpanan += TambahPenyimpanan; 
    }
    public void Compare(Komputer banding) {
        if(this.getRam()> banding.getRam() && this.getPenyimpanan()>banding.getPenyimpanan()){
            System.out.printf("%n==========================");
            System.out.printf("%nPenyimpanan dan Ram pada %s lebih Besar Daripada %s",this.namaKomputer,banding.namaKomputer);
        }
        else if(this.getRam()> banding.getRam() && this.getPenyimpanan()<banding.getPenyimpanan()){
            System.out.printf("%n==========================");
            System.out.printf("%nRam pada %s lebih Besar Daripada %s",this.namaKomputer,banding.namaKomputer);
        }
        else if(this.getRam()< banding.getRam() && this.getPenyimpanan()>banding.getPenyimpanan()){
            System.out.printf("%n==========================");System.out.printf("%nRam pada %s lebih Kecil Daripada %s",this.namaKomputer,banding.namaKomputer);
        }
        else if(this.getRam()< banding.getRam() && this.getPenyimpanan()<banding.getPenyimpanan()){
            System.out.printf("%n==========================");
            System.out.printf("%nRam Dan Penyimpanan pada %s lebih Kecil Daripada %s",this.namaKomputer,banding.namaKomputer);
        }
    }
    
    public void tampilkanSpek() {
        System.out.printf("%n==========================");
        System.out.printf("%nNama Komputer :%s\nOS :%s\nProsesor :%s\nRAM : %d GB\nPenyimpanan :%d GB",this.namaKomputer,this.os,this.prosesor,this.ram,this.penyimpanan);
    }
    
    
    
}
public class assignment_03_01{
    public static void main(String[] args) {
        Komputer komputer01 = new Komputer("Komputer01","Windows 10","Core i3",8,256);
        
        komputer01.UpgradeRam(8);
        komputer01.UpgradePenyimpanan(256);

        Komputer komputer02 = new Komputer("Komputer02","Windows 10","Core i3",32,256);
        komputer02.setPenyimpanan(1280);

        Komputer komputer03 = new Komputer();
        komputer03.setOs("Windows 11");


        komputer01.tampilkanSpek();
        komputer02.tampilkanSpek();

        komputer01.Compare(komputer02);
    }
}