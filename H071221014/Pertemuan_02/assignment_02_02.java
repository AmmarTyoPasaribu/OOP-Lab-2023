public class assignment_02_02 {
    private String name;
    private int age;
    private String gender;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setGender(Boolean isMale){
        if (isMale==true) {
            gender = "laki-laki";
        }else{gender = "perempuan";}
    }
    public String getGender(){
        return gender;
    }


    public static void main(String[] args){
        assignment_02_02 person1 = new assignment_02_02();

        person1.setName("shaff");
        person1.setAge(19);
        person1.setGender(true);

        // person1.getName();
        // person1.getAge();
        // person1.getGender();

        System.out.println("name: "+ person1.getName());
        System.out.println("age: "+person1.getAge());
        System.out.println("gender: " + person1.getGender());
    }
}
