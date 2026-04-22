package studPrac01;
import java.util.Scanner;

public class StudentService {

    public Student createStudent(){
        Scanner scan = new Scanner(System.in);
        Student students = new Student();
        System.out.print("Name: ");
        students.setName(scan.next());
        System.out.print("Gender: ");
        students.setGender(scan.next());
        System.out.print("Age: ");
        students.setAge(scan.nextInt());

        return students;
    }

    public void print(Student students){
        System.out.println("================== Student List ==================");
        System.out.println("Name: " + students.getName() + "; Gender: " + students.getGender() + "; Age: " + students.getAge());
    }
}
