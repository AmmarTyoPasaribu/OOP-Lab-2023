class Monarch {
    String name;
    String spouse;
    Parents parents;
    int age;
    int tenure;

//setter getter
//     public Parents getParents(){
//         return parents;
//     }

//     public void setParents(Parents parents){
//         this.parents = parents;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age){
//         this.age = age;
//     }

//     public int getTenure(){
//         return tenure;
//     }

//     public void setTenure(int tenure){
//         this.tenure = tenure;
//     }

//behaviour

       public void getDetail(){
        System.out.println("Umur :" + age);
        System.out.println("Masa Jabatan :" + tenure);
       }

       

//constructor
    public Monarch (String name, String spouse) {
        this.name = name;
        this.spouse = spouse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }
}

class Parents{
    String mother;
    String father;

    public String getTheParents(){
        return father + " and " + mother;
    }
    public String getMother(){
        return mother;
    }

    public void setMother(String mother){
        this.mother = mother;
    }

    public String getFather(){
        return father;
    }

    public void setFather(String father){
        this.father = father;
    }
}

public class Salah{
    public static void main(String[] args) {
        Parents parents = new Parents();
        parents.mother = "Elizabeth, The Queen Mother";
        parents.father = "King George VI";

        Monarch monarch = new Monarch("Queen Elizabeth II", "Prince Philip, Duke Of Edinburgh");
        monarch.parents = parents;
        monarch.age = 90;
        monarch.tenure = 70;
        
        System.out.println("Nama\t\t: " + monarch.name);
        System.out.println("Pasangan\t: " + monarch.spouse);
        // System.out.println("Umur\t\t: " + monarch.getAge() + " tahun");
        // System.out.println("Masa Jabatan\t: " + monarch.getTenure() + " tahun");
        System.out.println("Orang Tua\t: " + monarch.parents.getTheParents());
    }
}