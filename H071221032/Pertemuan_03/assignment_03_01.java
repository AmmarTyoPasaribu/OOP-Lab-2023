package H071221032.Pertemuan03;
import java.util.ArrayList;

class FUT { //FUT: FIFA Ultimate Team
    String playerName, playerCountry, cardType;
    ArrayList<String> playerList = new ArrayList<String>();
    public FUT(String playerName, String playerCountry, String cardType) {
        this.playerName = playerName;
        this.playerCountry = playerCountry;
        this.cardType = cardType;
    }

    public void storePlayer() {
        playerList.add(this.playerName + "_" + this.playerCountry + "_" + this.cardType);
        System.out.println("Player stored into the club");
    }

    public void playerDetails() {
        System.out.println("Player Name: " + this.playerName + "\nCountry: " + this.playerCountry + "\nCard Type: " + this.cardType);
    }

    public void showClub() {
        System.out.println(playerList);
    }


}

public class assignment_03_01 {
    public static void main(String[] args) {
        FUT user1 = new FUT("Cristiano Ronaldo", "Portugal", "GoldRare");
        user1.playerDetails();
        user1.storePlayer();
        user1.playerName = "Kylian Mbappe";
        user1.playerCountry = "France";
        user1.cardType = "TeamofTheYear";
        user1.storePlayer();
        user1.showClub();
    }
}
