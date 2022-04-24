package TelephoneDirectory;
import java.util.*;
public class UsePersonTelephoneDirectory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PersonTelephoneDirectory telephoneDirectory=new PersonTelephoneDirectory();
        while(true){
            System.out.println("1. Add person details.");
            System.out.println("2. Update a telephone number by person first name.");
            System.out.println("3. Display the entire telephone book..");
            System.out.println("4. Search a telephone number by first name.");
            System.out.println("5. Exit the program.");
            System.out.println("Enter a choice");
            int choice=sc.nextInt();
            // switch case
            switch (choice){
                case 1:
                    // add person details
                    telephoneDirectory.addPersonDetails();
                    break;
                case 2:
                    // update phone by first name
                    telephoneDirectory.updatePhoneByFirstName();
                    break;
                case 3:
                    // display telephone directory
                    telephoneDirectory.displayTelephoneBook();
                    break;

                case 4:
                    //search phone by first name
                    telephoneDirectory.searchPhoneByFirstName();
                    break;
                case 5:
                    // exit program
                    System.exit(0);
                default:
                    // invalid choice selection
                    System.out.println("Invalid choice");
            }
        }
    }
}
