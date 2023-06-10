abstract class Character {
    protected String name;
    protected int attackPower;
    protected String attackType;

    public Character(String name, int attackPower, String attackType) {
        this.name = name;
        this.attackType = attackType;
        this.attackPower = attackPower;
    }
    abstract int attack();
    abstract int attack(String attackType);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(String attackType) {
        this.attackPower = this.attack(attackType);
    }

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }
    public void printAttack(Character character){
        System.out.println("Nama : "+character.getName());
        character.setAttackPower(character.getAttackType());
        System.out.printf("Attack Type : %s%nAttack Power : %d", character.getAttackType(),character.getAttackPower());

        // System.out.println("Attack Type : "+character.getAttackType()+"\nAttack Power : "+character.getAttackPower());
        System.out.println("");
        System.out.println("");
    }
}