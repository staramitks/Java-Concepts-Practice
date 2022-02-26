package home.amit.java.basic.cloning.deepCopy;

import java.time.LocalDate;
import java.util.Date;

class Student implements Cloneable
{
    int id;
    String name;
    Course course;
    LocalDate dob;
    public Student(int id, String name, Course course, LocalDate dob)
    {
        this.id = id;
        this.name = name;
        this.course = course;
        this.dob = dob;
    }
     protected Object clone() throws CloneNotSupportedException
    {
        Student student = (Student) super.clone();

        // Option 1
//        student.course = (Course) course.clone();
        // Option 2
        Course clonedCourse =new Course(this.course.subject1,this.course.subject2,this.course.subject3);
        LocalDate cloneddob= LocalDate.of(student.dob.getYear(),student.dob.getMonthValue(),student.dob.getDayOfMonth());
        student.course=clonedCourse;
        student.dob=cloneddob;
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course=" + course +
                ", dob=" + dob +
                '}';
    }
}


public class DeepCopy {

    public static void main(String[] args)
    {
        Course science = new Course("Physics", "Chemistry", "Biology");
        LocalDate dateOfBirth=LocalDate.of(1985,9,15);
        Student student1 = new Student(111, "John", science,dateOfBirth);
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
        System.out.println("Original Date Of Birth is  ==> "+student1.dob.toString());         //Output : Biology

        //Changing the subject3 of 'student2'

        student2.course.subject3 = "Maths";
        student2.dob=LocalDate.of(1999,8,20);
        System.out.println("Cloned is  ==> "+student2.dob.toString());         //Output : Biology
        //This change will be reflected in original student 'student1'

        System.out.println("After updating original, clones object's subject is ===> "+student1.course.subject3);
        System.out.println("After updating  Of Birth is  ==> "+student1.dob.toString());         //Output : Biology//Output : Maths
    }


}
