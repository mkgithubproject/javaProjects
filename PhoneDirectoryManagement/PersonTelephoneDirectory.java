package TelephoneDirectory;
import java.util.*;
public class PersonTelephoneDirectory {
    ArrayList<PersonDetails>telephoneDirectory=new ArrayList<PersonDetails>();
     // add person details
    Scanner sc=new Scanner(System.in);
    public void addPersonDetails() {
        System.out.println("Enter person first name");
        String fName= sc.nextLine();
        System.out.println("Enter person last name");
        String lName=sc.nextLine();
        System.out.println("Enter person phone number");
        String phoneNo=sc.nextLine();
        System.out.println("Enter person city");
        String city=sc.nextLine();
        System.out.println("Enter person address");
        String address=sc.nextLine();
        System.out.println("Enter person sex");
        String sex=sc.nextLine();
        System.out.println("Enter person email");
        String email=sc.nextLine();
        int i=0;
        while(true){
            // check phone no. already exist or not...if yes renter again
            for(i=0;i<telephoneDirectory.size();i++){
                if(telephoneDirectory.get(i).getPhoneNo().equals(phoneNo)){
                    System.out.println("Your phone no. matched in our database,Enter another phone no.");
                    phoneNo=sc.nextLine();
                    break;
                }
            }
            if (i==telephoneDirectory.size()){
                break;
            }
        }
        PersonDetails person=new PersonDetails(fName,lName,phoneNo,city,address,sex,email);
        telephoneDirectory.add(person);
    }

    public void updatePhoneByFirstName() {
        System.out.println("Enter first person name");
        String fName= sc.nextLine();
        int outerFlag=0;
        // search by first name and update phone
        for(PersonDetails p1:telephoneDirectory){
            if(p1.getFirstName().equalsIgnoreCase(fName)){
                System.out.println("Enter new phone number");
                String phoneNo=sc.nextLine();
                int i=0;
                // check phone already exist or not
                while(true){
                    for(i=0;i<telephoneDirectory.size();i++){
                        if(telephoneDirectory.get(i).getPhoneNo().equals(phoneNo)){
                            System.out.println("Your phone no. matched in our database,Enter another phone no.");
                            phoneNo=sc.nextLine();
                            break;
                        }
                    }
                    if (i==telephoneDirectory.size()){
                        break;
                    }
                }
                p1.setPhoneNo(phoneNo);
                outerFlag=1;
                break;
            }
        }
        if(outerFlag==0){
            System.out.println(fName+" not found in our database.");
        }
    }

    public void displayTelephoneBook() {
        for(PersonDetails p:telephoneDirectory){
            System.out.println(p.toString());
        }
    }

    public void searchPhoneByFirstName() {
        System.out.println("Enter first name");
        String fName= sc.nextLine();
        int flag=0;
        for(PersonDetails p:telephoneDirectory){
            if(p.getFirstName().equalsIgnoreCase(fName)){
                System.out.println(fName+" phone no. is: "+p.getPhoneNo());
                flag=1;
                break;
            }
        }
        if (flag==0){
            System.out.println(fName+" not found in our database.");
        }
    }
}
