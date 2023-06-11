public class Mage extends Character {
    public Mage(String name, String attackType, int attackPower) {
        super(name, attackType, attackPower);
    }

    @Override
    public int attack(int attackPower) {
        return attackPower;
    }

    @Override
    public int attack(int attackPower, String attackType) {
        if (attackType.equals("fire")) {
            return (attackPower * 3);
        } else if (attackType.equals("frost")) {
            return (attackPower * 2);
        } else {
            return 0;
        }
    }
}

