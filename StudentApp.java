package studPrac01;

public class StudentApp {
    public static void main(String[] args){
        StudentService studentservice = new StudentService();
        int numberofStud = 2;
        Student[] students = studentservice.createStudentArr(numberofStud);
        studentservice.print(students);
    }
}
