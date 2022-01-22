package home.amit.java.basic.cloning.deepCopy;

class Student implements Cloneable
{
    int id;
    String name;
    Course course;
    public Student(int id, String name, Course course)
    {
        this.id = id;
        this.name = name;
        this.course = course;
    }
     protected Object clone() throws CloneNotSupportedException
    {
        Student student = (Student) super.clone();
        // Option 1
//        student.course = (Course) course.clone();
        // Option 2
        Course course =new Course(this.course.subject1,this.course.subject2,this.course.subject3);

        student.course=course;
        return student;
    }
}


public class DeepCopy {

    public static void main(String[] args)
    {
        Course science = new Course("Physics", "Chemistry", "Biology");
        Student student1 = new Student(111, "John", science);
        Student student2 = null;

        try
        {
            student2 = (Student) student1.clone();

        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Original Objects Subject is ==> "+student1.course.subject3);         //Output : Biology

        //Changing the subject3 of 'student2'

        student2.course.subject3 = "Maths";

        //This change will be reflected in original student 'student1'

        System.out.println("After updating original, clones object's subject is ===> "+student1.course.subject3);       //Output : Maths
    }
}
