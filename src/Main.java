public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Marina", "Teacher");
        System.out.println(teacher.toString());
        teacher.DO();
        Student student = new Student("Arina", "Student");
        student.DO();
        System.out.println(student.toString());

    }
}