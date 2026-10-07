class Student
{
    String name;
    int age;
    Student(String n,int a)
    {
        name = n;
        age = a;
    }
    void display()
    {
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }
    public static void main(String[] args)
    {
        Student s1 = new Student("Asha",20);
        Student s2 = new Student("Banu",18);
        s1.display();
        s2.display();
    }
}