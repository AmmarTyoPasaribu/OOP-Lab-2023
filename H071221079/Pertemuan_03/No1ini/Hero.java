public class Hero {
    String nama;
    String skin;
    Skill skill;
    public Hero(String nama, String skin, Skill skill){
        this.nama=nama;
        this.skin=skin;
        this.skill=skill;
    }

    public void hasilnacuy(){
        System.out.println("Nama Hero = "+nama);
        System.out.println("Nama Skin = "+skin);
    }

    public String getNama() {
        return nama;
    }
    public String getSkin() {
        return skin;
    }
    public Skill getSkill() {
        return skill;
    }
}

    
