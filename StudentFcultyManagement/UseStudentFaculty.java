package StudentFaculty;
import  java.util.*;
public class UseStudentFaculty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StudentFaculty obj=new StudentFaculty();
        while(true){
            System.out.println("1. Insert \n" +
                    "2. Remove by Index\n" +
                    "3. Remove by Id\n" +
                    "4. Remove by Name\n" +
                    "5. Display.\n"+
                    "6. Exit.");
            System.out.println("Enter choice.");
            int choice=sc.nextInt();
            switch (choice){
                case 6:
                    System.exit(0);
                case 1:
                    System.out.println("1. For Student \n" +
                            "2. For Faculty");
                    int choice2= sc.nextInt();
                    switch (choice2){
                        case 1:
                            obj.studentAdd();
                            break;
                        case 2:
                            obj.facultyAdd();
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    break;
                case 2:
                    System.out.println("1. For Student \n" +
                            "2. For Faculty");
                     choice2= sc.nextInt();
                    switch (choice2){
                        case 1:
                            obj.studentRemoveByIndex();
                            break;
                        case 2:
                            obj.facultyRemoveByIndex();
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    break;

                case 3:
                    System.out.println("1. For Student \n" +
                            "2. For Faculty");
                    choice2= sc.nextInt();
                    switch (choice2){
                        case 1:
                            obj.studentRemoveByID();
                            break;
                        case 2:
                            obj.facultyRemoveByID();
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    break;
                case 4:
                    System.out.println("1. For Student \n" +
                            "2. For Faculty");
                    choice2= sc.nextInt();
                    switch (choice2){
                        case 1:
                            obj.studentRemoveByName();
                            break;
                        case 2:
                            obj.facultyRemoveByName();
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    break;
                case 5:
                    System.out.println("1. For Student \n" +
                            "2. For Faculty");
                    choice2= sc.nextInt();
                    switch (choice2){
                        case 1:
                            obj.studentDisplay();
                            break;
                        case 2:
                            obj.facultyDisplay();
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }
    }



}
