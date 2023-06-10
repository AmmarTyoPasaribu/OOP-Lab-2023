public class Fighter extends Character {
    public Fighter(String name, String attackType, int attackPower) {
        super(name, attackType, attackPower);
    }

    @Override
    public int attack(int attackPower) {
        return attackPower;
    }

    @Override
    public int attack(int attackPower, String attackType) {
        if (attackType.equals("melee")) {
            return (attackPower * 2);
        } else if (attackType.equals("ranged")) {
            return attackPower;
        } else {
            return 0;
        }
    }
}
