package H071221005.Pertemuan_07;
abstract class Character{
    private String name;
    protected int attackPower;
    
    
    public Character() {
    }
    public Character(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAttackPower() {
        return attackPower;
    }
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    abstract int attack();
    abstract int attack(String attackType);
    
}

class Fighter extends Character{

    public Fighter(){}
    public Fighter(String name, int attackPower) {
        super(name, attackPower);
    }


    @Override
    int attack() {
        return getAttackPower();
    }
    
    @Override
    int attack(String attackType) {
        if(attackType.equals("melee")){
            
            return getAttackPower()*2;
        }else{
            return getAttackPower() ;
        }
    }

}
class Mage extends Character{
    
    public Mage(){}
    public Mage(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    int attack() {
        return getAttackPower();
    }
    
    @Override
    int attack(String attackType) {
        if(attackType.equals("frost")){
            return getAttackPower()*3;
        }else{
            return getAttackPower()*2;
        }
    }

}
public class assignment_07_01 {
    public static void main(String[] args) {
        Character[] characters = new Character[5];
        
        characters[0] = new Fighter("Zilong", 80);
        System.out.println(characters[0].attack("melee"));
        
        characters[1] = new Mage("Lunox", 25);
        System.out.println(characters[1].attack("fire")); 

        characters[2] = new Fighter("Balmond", 75);
        System.out.println(characters[2].attack()); 

        characters[3] = new Fighter("Chou", 55);
        System.out.println(characters[3].attack("ranged")); 


        characters[4] = new Mage("Eudora", 20); 
        characters[4].attack("frost");
        
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i].getName());
            printAttack(characters[i]);
        }
        
    }
    public static void printAttack(Character character) {
            System.out.println(character.attack()); 
        };

}

