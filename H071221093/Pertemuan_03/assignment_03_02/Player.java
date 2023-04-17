
class Player {
    private String name;
    private int hp;
    private int attackPower;
    public int defense;
        //constructor
        public Player(String name, int attackPower, int defense) {
            this.name = name;
            this.hp = 100;
            this.attackPower = attackPower;
            this.defense = defense;
        }
    
        //constructor
        // public Player(String name, int defense) {
        //     this.name = name;
        //     this.hp = 100;
        //     this.attackPower = 0;
        //     this.defense = defense;
        // }

    public void getDamage(Player enemy) {
        hp = hp - Math.abs(enemy.getAttackPower() - defense);
    }

    public void status() {
        System.out.println(name + " status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower + "\n");
    }

    public int getAttackPower() {
        return attackPower;
    }
    void setAttackPower(int attackPower) {
        this.attackPower = attackPower ;
    }


    void setDefense(int defense) {
        this.defense = defense;

    }
    

    int getDefense(int defense) {
        return defense;
    }

    void setName(String name) {
        this.name = name;
    }
}

// public class Main {
// public static void main(String [] args) {
// Player player1 = new Player("Mino", 30, 15);
// Player player2 = new Player("Hilda", 100, 35);
// player2.setDefense(10);
// player1.getDamage(player2);
// player1.status();
// player2.status();
// }
// }
