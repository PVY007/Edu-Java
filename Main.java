class Student2
{
    String name;
    int age;
    void study()
    {
        System.out.println(name + "is studying");
    }
    void displayDetails()
    {
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }
}
public class Main
{
    public static void main(String[] args)
    {
       Student2 s1 = new Student2();
       s1.name="Priya";
       s1.age=20;
       s1.displayDetails();
       s1.study();
    }

}