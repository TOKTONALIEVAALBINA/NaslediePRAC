public class Person {

  private String name;
  private String profession;

    @Override
    public  String toString(){
        return "name" + getName() +" and she is"+ getProfession();
    }
    public Person(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    public Person (){

    }
    public void DO (){
        System.out.println();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }




}
