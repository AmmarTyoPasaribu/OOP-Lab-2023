package H071221005.Pertemuan_02;

class Film{
    String judul;
    String genre;
    String rating;
    String nama_pemain;
    
    public void setJudul(String judul){
        this.judul = judul;
    } 
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setRating(String rating){
        this.rating = rating;
    }
    public void setPemain(String pemain){
        this.nama_pemain = pemain;
    }
    public void getDetail(){
        System.out.printf("Judul : %s\nGenre Film %s\nRating : %s\nNama Aktor/Aktris Utama : %s\n",judul,genre,rating,nama_pemain);
    }    
                  
}
public class assignment_02_01 {
    public static void main(String[] args) {
        Film objekfilm = new Film();
        objekfilm.setJudul("Spderman");
        objekfilm.setGenre("Action");
        objekfilm.setRating("7.4/10");
        objekfilm.setPemain("Tobey Maguire");
        objekfilm.getDetail();
        }      
    }
    