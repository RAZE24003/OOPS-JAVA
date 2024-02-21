class Student
{
    String name;
    static String school;
    public static void changeschool() {
        school="new";
    }
}

public class Statickeyword {
    
    public static void main(String[] args) {
        Student.school="FIT";
        Student student1=new Student();
        student1.name="tony";
        System.out.println(student1.school);
    }
}
