class MainCharacter{
    public static void main(String[] args) {

        Character[] characters = new Character[5]; 
        characters[0] = new Fighter("Ammar",4,"melee");
        characters[1] = new Mage("Tyo",4,"fire");
        characters[2] = new Fighter("Pasaribu",6,"ranged");
        characters[3] = new Fighter("Ammar tapi kedua",8,"ranged");
        characters[4] = new Mage("Tyo tapi kedua",6,"frost"); 

        for (Character character:characters){
            character.printAttack(character);

        }
        


    }
}