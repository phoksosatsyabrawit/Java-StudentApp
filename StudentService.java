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

    // bubble sort algorithm
    public Student[] sortbyName(Student[] students){
        for(int i=0; i<students.length; i++){
            for(int j=i+1; j<students.length; j++){
                if(students[i].getName().compareTo(students[j].getName()) > 0){
                    Student temp = new Student();
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        return students;
    }

    public void printsortbyName(Student[] students){
        System.out.println("\n#Sorting by Name.");
        for(int i=0; i<students.length; i++){
            System.out.println("Name: " + students[i].getName());
        }
    }

    // bubble sort algorithm
    public Student[] sortbyAge(Student[] students){
        for(int i=0; i<students.length; i++){
            for(int j=i+1; j<students.length; j++){
                if(students[i].getAge() > students[j].getAge()){
                    Student temp = new Student();
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        return students;
    }

    public void printsortbyAge(Student[] students){
        System.out.println("\n#Sorting by Age.");
        for(int i=0; i<students.length; i++){
            System.out.println("Age: " + students[i].getAge());
        }
    }

    public Student catchOldestStud(Student[] students){
        Student maxAge = students[0];
        for(int i=0; i<students.length; i++){
            if(maxAge.getAge() < students[i].getAge()){
                maxAge = students[i];
            }
        }
        return maxAge;
    }

    public void printcatchOldestStud(Student students){
        System.out.println("\n#Catch Oldest Student.");
        System.out.println("Name: " + students.getName() + "; Age: " + students.getAge());
    }
}
