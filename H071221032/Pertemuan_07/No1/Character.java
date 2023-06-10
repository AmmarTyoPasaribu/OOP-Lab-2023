public abstract class Character {
    private String name, attackType;
    private int attackPower;

    public Character(String name, String attackType, int attackPower) {
        this.name = name;
        this.attackType = attackType;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    abstract int attack(int attackPower);
    abstract int attack(int attackPower, String attackType);

    public static void printAttack(Character character) {
        System.out.println(character.attack(character.attackPower, character.attackType));
    }
}
