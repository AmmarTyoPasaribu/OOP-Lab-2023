public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.setName("Nakits");
        player.setLevel(100);
        player.setHealth(100);
        player.setMana(100);
        player.setExp(100);
        player.displayInfo();

        Player player2 = new Player("Xisal", 0, 0, 0, 0);
        System.out.println("Nama\t: " + player2.getName()); 
        System.out.println("Level\t: " + player2.getLevel());
        System.out.println("Health\t: " + player2.getHealth());
        System.out.println("Mana\t: " + player2.getMana());
        System.out.println("Exp\t: " + player2.getExp());

        SelfUtils.displaySelfData();
    }
}
