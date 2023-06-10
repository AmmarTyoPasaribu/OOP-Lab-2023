public class Skill{
    String skill1;
    String skill2;
    String ulti;

    public Skill(String skill1,String skill2,String ulti) {
        this.skill1=skill1;
        this.skill2=skill2;
        this.ulti=ulti;
    }



    public void setSkill1(String skill1) {
        this.skill1 = skill1;

    }
    public void setSkill2(String skill2) {
        this.skill2 = skill2;
    }
    public void setUlti(String ulti){
        this.ulti=ulti;
    }
    public String getSemuaSkill(){
        return "skill 1= "+skill1+" , \nskill 2= "+skill2+" , \nulti = "+ulti;
    }
}