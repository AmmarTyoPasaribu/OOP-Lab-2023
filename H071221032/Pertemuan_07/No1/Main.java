public class Main {
    public static void main(String[] args) {
        //No 1
        Character[] characters = new Character[5];
        characters[0] = new Fighter("Kazuya", "melee", 1000);
        characters[1] = new Mage("Grand Warden", "frost", 300);
        characters[2] = new Fighter("Jin Kazama", "ranged", 2000);
        characters[3] = new Fighter("Bruce Lee", "melee", 4000);
        characters[4] = new Mage("Madara", "fire", 3000);

        for (int i = 0;i <= 4;i++) {
            Character.printAttack(characters[i]);
        }
    }
}
