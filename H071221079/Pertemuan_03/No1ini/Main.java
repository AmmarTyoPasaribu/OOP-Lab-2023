public class Main{
    public static void main(String[] args) {
        Skill skill = new Skill("dash","blink","bombombakudan");

        Hero hero = new Hero("Ayaka wangy","fallen angel", skill);

        hero.hasilnacuy();
        System.out.println("skill = "+hero.getSkill().getSemuaSkill());
    }   

    
}