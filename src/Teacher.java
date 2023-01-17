public class Teacher  extends Person{

    public Teacher(String name, String profession){
        super(name, profession);
    }

    public void DO(){
        System.out.println(getName() + " is tech");
    }
}
