class Person{
    public String name;
    public int age;
    public boolean isMale;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }  
    public String getGender(){
        if (isMale) {
            return "male";
        }
        else{
            return "female";
        }
    }

}
public class Nomor2 {
    public static void main(String[] args) {
        Person saya = new Person();
        saya.setName("Ammar");
        saya.setAge(18);
        saya.setGender(true);


        System.out.println("nama : "+saya.getName());
        System.out.println("umur :"+saya.getAge());
        System.out.println("gender :"+saya.getGender());
    }
}
