package H071221005.Pertemuan_04.assignment_04_02;


public class Anime {
    private String title,studio,synopsis,genre;
    private int episodeCount;
    
    public Anime() {
    }
    public Anime(String title, String studio, String synopsis, String genre, int episodeCount) {
        this.title = title;
        this.studio = studio;
        this.synopsis = synopsis;
        this.genre = genre;
        this.episodeCount = episodeCount;
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getStudio() {
        return studio;
    }
    public void setStudio(String studio) {
        this.studio = studio;
    }
    public String getSynopsis() {
        return synopsis;
    }
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    public int getEpisodeCount() {
        return episodeCount;
    }
    public void setEpisodeCount(int episodeCount) {
        this.episodeCount = episodeCount;
    }
    
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public void displayInfo() {
        System.out.printf("\nTitle : %s\n",getTitle());
        System.out.printf("Genre : %s\n",getGenre());
        System.out.printf("Jumlah Episode : %d\n",getEpisodeCount());
        System.out.printf("Studio : %s\n",getStudio());
        System.out.printf("Sinopsis : %s\n",getSynopsis());
    }
}
