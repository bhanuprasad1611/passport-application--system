
import java.util.*;

public class application {
    public void adddetails(ArrayList<passport_applicants> applicants,Scanner sc){
    System.out.println("enter the id");
    int applicationId=sc.nextInt();
    sc.nextLine();
    System.out.println("enter your name");
    String name=sc.nextLine();
    System.out.println("enter your  dob");
    String dob=sc.nextLine();
    System.out.println("enter your gender");
    String gender=sc.nextLine();
    System.out.println("enter the address");
    String address=sc.nextLine();
    System.out.println("enter your mobile number");
    long mobile=sc.nextLong();
    System.out.println("enter your adhaar");
    long adhaar=sc.nextLong();
    applicants.add(new passport_applicants(applicationId, name, dob, gender, address, mobile, adhaar));
    System.out.println("....applied successfully........");
    }
    public void view(ArrayList<passport_applicants>  applicants){
        if(applicants.isEmpty()){
            System.out.println("no applications");

        }
        for(passport_applicants p: applicants){
            p.viewapplication();
        }

    }
    public void filterbyId(ArrayList<passport_applicants>  applicants, Scanner sc){
    int applicationId=sc.nextInt();
    boolean  found=false;
    for(passport_applicants q: applicants){
        if(applicationId==q.getApplicationId()){
            q.viewapplication();
            found=true;

        }
    }
    if(found==false){
System.out.println("no applications found");
    }
    }
public void updateapplication(ArrayList<passport_applicants>  applicants, Scanner sc){
System.out.print("Enter Application ID: ");
int applicationid = sc.nextInt();

boolean found = false;

for(passport_applicants p : applicants){
    if(p.getApplicationId() == applicationid){
        found = true;
        System.out.println("1. Update Name");
        System.out.println("2. Update Address");
        System.out.println("3. Update Mobile");
        int updateChoice = sc.nextInt();
        sc.nextLine();
        switch(updateChoice){

            case 1:
                System.out.print("Enter New Name: ");
                p.setName(sc.nextLine());
                break;

            case 2:
                System.out.print("Enter New Address: ");
                p.setAddress(sc.nextLine());
                break;

            case 3:
                System.out.print("Enter New Mobile: ");
                p.setMobile(sc.nextLong());
                break;

            default:
                System.out.println("Invalid Choice");
        }

        System.out.println("Details Updated Successfully");
        break;
    }
}

if(!found){
    System.out.println("Application ID Not Found");
}
}}
