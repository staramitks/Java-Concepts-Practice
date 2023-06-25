package home.amit.java.basic.cloning.deepCopy;

import java.time.LocalDate;

class Student implements Cloneable {
    int id;
    String name;
    Course course;
    LocalDate dob;

    public Student(int id, String name, Course course, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.dob = dob;
    }

    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();

        // Option 1
//        student.course = (Course) course.clone();
        // Option 2
        Course clonedCourse = new Course(this.course.subject1, this.course.subject2, this.course.subject3);
        LocalDate cloned = LocalDate.of(student.dob.getYear(), student.dob.getMonthValue(), student.dob.getDayOfMonth());
        student.course = clonedCourse;
        student.dob = cloned;
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course.subject3=" + course.subject3 +
                ", course.subject2=" + course.subject2 +
                ", course.subject3=" + course.subject1 +
                ", dob=" + dob +
                '}';
    }
}


public class DeepCopy {

    public static void main(String[] args) {
        Course science = new Course("Physics", "Chemistry", "Biology");
        LocalDate dateOfBirth = LocalDate.of(1985, 9, 15);
        Student student1 = new Student(111, "John", science, dateOfBirth);
        Student student2 = null;

        try {
            student2 = (Student) student1.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Original Objects is ==> " + student1);
        System.out.println("Deep Cloned Objects  is ==> " + student2);

        student2.course.subject3 = "Maths";
        student2.dob = LocalDate.of(1999, 8, 20);
        System.out.println("After Updating - Cloned is  ==> " + student2);         //Output : Biology
        //This change will be reflected in original student 'student1'

        System.out.println("After updating Cloned Object, Original Source Object is ===> " + student1);

    }


}
