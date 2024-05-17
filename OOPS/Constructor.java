/* Create , types of constructor*/
public class Constructor{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="khushi";
        s1.rollno = 123;
        s1.password = "abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Student s2 = new Student(s1);//copy
        s1.password = "xyz";
        s1.marks[2]=100;
        for(int i=0;i<3;i++)
        {
            System.out.println(s2.marks[i]);
        }
    }
}
class Student
{
    String name;
    int rollno;
    String password;
    int marks[];
    // Student(Student s1)//shallow copy constructor
    // {
    //     marks=  new int[3];
    //     this.name= s1.name;
    //     this.rollno=s1.rollno;
    //     this.password= s1.password;
    //     this.marks = s1.marks;
    // }
    Student (Student s1)//deep copy constructor
    {
        marks=  new int[3];
        this.name= s1.name;
        this.rollno=s1.rollno;
        this.password= s1.password;
        for(int i=0;i<3;i++)
        {
            this.marks[i]=s1.marks[i];
        }
    }
    Student(String name)//parameterized constructor
    {
        marks=  new int[3];
        this.name = name;
        System.out.println(name);
    }
    Student ()//non parameterized constructor
    {
        marks=  new int[3];
       System.out.println("non parameterized constructor");
    }
}
