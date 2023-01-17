public class Student extends Person{

    public Student(String name, String profession){
        super(name, profession);
    }
    public void DO (){
        System.out.println(getName() + " is study");
    }
}
