package studPrac01;
import java.util.Arrays;

public class StudentApp {
    public static void main(String[] args){
        StudentService studentservice = new StudentService();
        int numberofStud = 2;
        Student[] students = studentservice.createStudentArr(numberofStud);
        studentservice.print(students);
        Student[] sortbyName = studentservice.sortbyName(students);
        studentservice.printsortbyName(sortbyName);
        Student[] sortbyAge = studentservice.sortbyAge(students);
        studentservice.printsortbyAge(sortbyAge);
        Student catchOldestStud = studentservice.catchOldestStud(students);
        studentservice.printcatchOldestStud(catchOldestStud);
    }
}
