package home.amit.java.basic.cloning.shallowcopy;

class Student implements Cloneable {
    int id;
    String name;
    Course course;

    public Student(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course.subject3=" + course.subject3 +
                ", course.subject2=" + course.subject2 +
                ", course.subject3=" + course.subject1 +

                '}';
    }

}


public class ShallowCopy {

    public static void main(String[] args) {
        Course science = new Course("Physics", "Chemistry", "Biology");
        Student student1 = new Student(111, "John", science);
        Student student2 = null;

        try {
            student2 = (Student) student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("Original Objects is ==> " + student1);
        System.out.println("Shallow Cloned Objects  is ==> " + student2);

        student2.course.subject3 = "Maths";
        System.out.println("After Updating - Cloned is  ==> " + student2);         //Output : Biology
        System.out.println("After updating Cloned Object, Original Source Object is ===> " + student1);     //Output : Maths
    }
}
