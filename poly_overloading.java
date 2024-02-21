class Student{
    String name ;
    int age;

    public void print(String name)
    {
        System.out.println(name);
    }
    public void print(int age)
    {
        System.out.println(age);
    }
    public void print(String name,int age)
    {
        System.out.println(name +" " +age);
    }
}

public class poly_overloading {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.age =19;
        s1.name ="souma";
        s1.print(s1.name,s1.age);
    }
}
