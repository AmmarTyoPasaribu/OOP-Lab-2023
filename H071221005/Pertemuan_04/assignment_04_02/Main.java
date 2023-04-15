package H071221005.Pertemuan_04.assignment_04_02;
public class Main {
    public static void main(String[] args) {
        Anime anime1 = new Anime();
        anime1.setTitle("One Punch Man");
        anime1.setEpisodeCount(10);
        anime1.setGenre("Action");
        anime1.setStudio("Madhouse");
        anime1.setSynopsis("Bercerita tentang pria bernama Saitama yang sejak dulu ingin menjadi seorang pahlawan");
        
        anime1.displayInfo();

        Anime anime2 = new Anime("Naruto", "Aniplex", "Seorang Anak kecil yang bercita-cita menjadi Hokage", "Action", 500);
        anime2.displayInfo();

        anime2.getTitle();
        anime2.getGenre();
        anime2.getEpisodeCount();
        anime2.getStudio();
        anime2.getSynopsis();   
        
        SelfUtil.displaySelfData();
    }
}
