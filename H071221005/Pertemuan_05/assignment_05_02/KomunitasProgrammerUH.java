package H071221005.Pertemuan_05.assignment_05_02;

public class KomunitasProgrammerUH {
    String nama,prodi,fakultas,angkatan,jabatan;

    public KomunitasProgrammerUH(String nama, String prodi, String fakultas, String angkatan, String jabatan) {
        this.nama = nama;
        this.prodi = prodi;
        this.fakultas = fakultas;
        this.angkatan = angkatan;
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }
    public void DataDiri() {
        System.out.println("===============================================");
        System.out.printf("Nama : %s\n",getNama());
        System.out.printf("Prodi : %s\n",getProdi());
        System.out.printf("Fakultas : %s\n",getFakultas());
        System.out.printf("Angkatan : %s\n",getAngkatan());
        System.out.printf("Jabatan : %s\n",getJabatan());
    } 
}
