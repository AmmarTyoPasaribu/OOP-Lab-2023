class MainCharacter{
    public static void main(String[] args) {

        Character[] characters = new Character[5]; 
        characters[0] = new Fighter("Aldous Mid",4,"melee");
        characters[1] = new Mage("Valir",4,"fire");
        characters[2] = new Fighter("Miya",6,"ranged");
        characters[3] = new Fighter("Layla",8,"ranged");
        characters[4] = new Mage("Aurora",6,"frost"); 

        for (Character character:characters){
            character.printAttack(character);

        }
        


    }
}