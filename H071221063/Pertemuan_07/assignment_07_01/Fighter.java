class Fighter extends Character{
    public Fighter(String name, int attackPower, String attackType) {
        super(name, attackPower, attackType);
    }
    @Override
    public int attack() {
        return this.getAttackPower();
    }
    @Override
    public int attack(String attackType) {
        if (attackType.strip().toLowerCase() == "melee"){
            return this.attack()*2;
        }
        else {
            return this.attack();
        }
    }

    @Override
    public void printAttack(Character character) {
        super.printAttack(character);
    }
}