class Mage extends Character{
    public Mage(String name, int attackPower, String attackType) {
        super(name, attackPower, attackType);
    }

    @Override
    int attack() {
        return this.getAttackPower();
    }
    @Override
    int attack(String attackType) {
        if (attackType.strip().toLowerCase() == "frost"){
            return this.attack()*2;
        } else {
            return this.attack()*3;}
    }

    @Override
    public void printAttack(Character character) {
        super.printAttack(character);
    }
}