package studPrac01;
import java.util.Arrays;
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

    public void print(Student[] students){
        System.out.println("================== Student List ==================");
        for(int i=0; i<students.length; i++){
            System.out.println("Name: " + students[i].getName() + "; Gender: " + students[i].getGender() + "; Age: " + students[i].getAge());
            System.out.println("\n");
        }
    }

    public Student[] createStudentArr(int n){
        Student[] students = new Student[n];
        StudentService studArr = new StudentService();
        for(int i=0; i<n; i++){
            students[i] = studArr.createStudent();
        }
        return students;
    }
}
