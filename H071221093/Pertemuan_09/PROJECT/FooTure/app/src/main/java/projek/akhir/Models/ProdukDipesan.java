package projek.akhir.Models;

public class ProdukDipesan extends Pesanan {
        public Produk produk;
        public int kuantitas;
    
        public Produk getProduk() {
            return produk;
        }
    
        public void setProduk(Produk produk) {
            this.produk = produk;
        }
    
        public int getKuantitas() {
            return kuantitas;
        }
    
        public void setKuantitas(int kuantitas) {
            this.kuantitas = kuantitas;
        }

        @Override
        public
        void tambahPesanan() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'tambahPesanan'");
        }

        @Override
        public
        void kurangPesanan() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'kurangPesanan'");
        }
    
}
