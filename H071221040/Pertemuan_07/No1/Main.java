package No1;

public class Main {
    public static void printAttack(Character character) {
        System.out.println("Nama : " + character.getName());
        System.out.println("ATTACK INFORMATION");
        System.out.println("Attack Power : " + character.attackPower);
        if (character instanceof Fighter) { //mengecek apakah objek character adalah sebuah fighter
            System.out.println("Melee : " + character.attack("Melee"));
            System.out.println("Ranged : " + character.attack("Ranged"));
        } else if (character instanceof Mage) {
            System.out.println("Fire : " + character.attack("Fire"));
            System.out.println("Frost : " + character.attack("Frost"));
        } 
    }
    public static void main(String[] args) {
       // Fighter fighter = new Fighter("Dipa", 10);
       // Mage mage = new Mage("Salsa", 100);
        // Fighter faikter = new Fighter("Awa", 1000);
        // Fighter petarung = new Fighter("Arni", 10000);
        // Mage mega = new Mage("Cheryl", 100000);

        Character[] hero = new Character[5];
        hero[0] = new Fighter("Nakita", 1000);
        hero[1] = new Mage("Evan", 1000);
        hero[2] = new Fighter("Fathan", 1000);
        hero[3] = new Fighter("Awa", 1000);
        hero[4] = new Mage("Salsa", 1000);

        for (Character i : hero) { // membuat perulangan untuk mengeluarkan objek2 yang ada pada list hero. objek2 tsb mau d print informasi ttg attack powernya, jdi dipanggil method print attack.
            Main.printAttack(i);// main, karena method static itu menempel pada kelasnya.
            System.out.println("");
        }
    
    }
}


