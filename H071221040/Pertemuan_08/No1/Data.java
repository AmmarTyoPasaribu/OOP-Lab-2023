class Data {
    int dataSukses;
    int dataGagal;
    int dataDiProses;

    public int getDataSukses() {
        return dataSukses;
    }
    public int getDataGagal() {
        return dataGagal;
    }
    public int getDataDiProses() {
        return dataDiProses;
    }
    
    int sukses() {
        return dataSukses += 1;
    }

    int gagal() {
        return dataGagal += 1;
    }

    int proses() {
        return dataDiProses += 1;
    }
}