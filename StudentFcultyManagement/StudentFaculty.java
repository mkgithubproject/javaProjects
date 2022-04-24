package StudentFaculty;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentFaculty {
    ArrayList<Student> stdList=new ArrayList<Student>();
    ArrayList<Faculty>facultyList=new ArrayList<Faculty>();
    Scanner sc=new Scanner(System.in);
    public void studentAdd() {
        System.out.println("Enter student ID ");
        int stdId=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student name");
        String stdName=sc.nextLine();
        System.out.println("Enter student department");
        String dept= sc.nextLine();
        Student std=new Student(stdId,stdName,dept);
        stdList.add(std);
    }

    public void facultyAdd() {
        System.out.println("Enter faculty ID ");
        int facultyId=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter faculty name");
        String facultyName=sc.nextLine();
        System.out.println("Enter faculty department");
        String dept= sc.nextLine();
        System.out.println("Enter faculty salary");
        double salary=sc.nextDouble();
        Faculty faculty=new Faculty(facultyId,facultyName,dept,salary);
        facultyList.add(faculty);
    }

    public void facultyRemoveByIndex() {
        System.out.println("Enter index");
        int index=sc.nextInt();
        if(index>=facultyList.size()){
            System.out.println("Out of index entered..");
            return;
        }
        facultyList.remove(index);
        System.out.println("Removed....");
    }

    public void studentRemoveByIndex() {

        System.out.println("Enter index");
        int index=sc.nextInt();
        if(index>=stdList.size()){
            System.out.println("Out of index entered..");
            return;
        }
        stdList.remove(index);
        System.out.println("Removed....");
    }

    public void facultyRemoveByID() {
        System.out.println("Enter id");
        int id= sc.nextInt();
        int i;
        for( i=0;i<facultyList.size();i++){
            if(facultyList.get(i).getFacultyID()==id){
                facultyList.remove(i);
                System.out.println("Removed....");
                break;
            }
        }
        if(i==facultyList.size()){
            System.out.println("ID not exist...");
        }
    }

    public void studentRemoveByID() {
        System.out.println("Enter id");
        int id= sc.nextInt();
        int i;
        for( i=0;i<stdList.size();i++){
            if(stdList.get(i).getStdID()==id){
                stdList.remove(i);
                System.out.println("Removed....");
                break;
            }
        }
        if(i==stdList.size()){
            System.out.println("ID not exist...");
        }
    }

    public void facultyRemoveByName() {
        System.out.println("Enter name");
        String name= sc.nextLine();
        int i;
        for( i=0;i<facultyList.size();i++){
            if(facultyList.get(i).getFacultyName().equalsIgnoreCase(name)){
                facultyList.remove(i);
                System.out.println("Removed....");
                break;
            }
        }
        if(i==facultyList.size()){
            System.out.println("name not exist...");
        }
    }

    public void studentRemoveByName() {
        System.out.println("Enter name");
        String name= sc.nextLine();
        int i;
        for( i=0;i<stdList.size();i++){
            if(stdList.get(i).getStdName().equalsIgnoreCase(name)){
                stdList.remove(i);
                System.out.println("Removed....");
                break;
            }
        }
        if(i==stdList.size()){
            System.out.println("name not exist...");
        }
    }

    public void facultyDisplay() {
        for(Faculty fc:facultyList){
            System.out.println(fc.toString());
        }
    }

    public void studentDisplay() {
        for(Student std:stdList){
            System.out.println(std.toString());
        }
    }
}
