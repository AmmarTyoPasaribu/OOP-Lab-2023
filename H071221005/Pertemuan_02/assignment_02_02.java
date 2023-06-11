package H071221005.Pertemuan_02;


class Person{
    String name;
    int age;
    boolean IsMale;
    
    void setName(String set_name){
        name = set_name;
    }
    void setAge(int set_age){
        age = set_age;
    }
    void setGender(Boolean gender){
        IsMale = gender;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getGender(){
        if(IsMale){
            return "Pria";
        }else{
            return "Wanita";
        }
    }
}
public class assignment_02_02 {
    public static void main(String[] args) {
        Person objekdata = new Person();
        objekdata.setName("Raehan");
        objekdata.setAge(19);
        objekdata.setGender(true);
        System.out.println("Nama : "+objekdata.getName());
        System.out.println("Age : "+objekdata.getAge());
        System.out.println("IsMale : "+objekdata.getGender());
    }
}