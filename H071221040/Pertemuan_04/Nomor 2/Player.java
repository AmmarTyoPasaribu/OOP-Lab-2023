class Player {
    String name;
    int level;
    int health;
    int mana;
    int exp;
   
    public void setName(String name) {
        this.name = name;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }


    public void displayInfo() {
        System.out.println("Nama\t: " + name);
        System.out.println("Level\t: " + level);
        System.out.println("Health\t: " + health);
        System.out.println("Mana\t: " + mana);
        System.out.println("Exp\t: " + exp);
    }

    public Player(){

    }

    public Player(String name, int level, int health, int mana, int exp) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.mana = mana;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    public int getHealth() {
        return health;
    }
    public int getMana() {
        return mana;
    }
    public int getExp() {
        return exp;
    }
    
}