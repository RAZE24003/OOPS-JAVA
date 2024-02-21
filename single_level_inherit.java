class shape
{
    public void area()
    {
        System.out.println("display area");
    }

}
class Triangle extends shape{
    public void area(int i,int h)
    {
        System.out.println(1/2*i*h);
    }
}

public class single_level_inherit {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
    }
}
