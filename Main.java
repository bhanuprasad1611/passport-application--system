
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
public static void main(String[] args){
    ArrayList<passport_applicants> applicants=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    application app=new application();
    while(true){
        System.out.println("welcome to passport application system");
        System.out.println("1--> apply ");
        System.out.println("2-->view");
        System.out.println("3--> search");
        System.out.println("4-->update application");
        System.out.println("5-->exit");
        int choice= sc.nextInt();
        int option;
        switch (choice) {
            case 1:
             do {
                System.out.println("1---fresh and ordinary passport");
                System.out.println("2---Tatkaal Passport");
                System.out.println("3---apply  passport for abroad");
                System.out.println("4--exit");
                option =sc.nextInt();
            switch (option) {
                case 1:
                System.out.println("------applying for  fresh passport-----");
                // System.out.println("applicationId");
                // System.out.println("name");
                // System.out.println("dob");
                // System.out.println("gender");
                // System.out.println("address");
                // System.out.println("mobile");
                // System.out.println("adhaar");
                app.adddetails(applicants, sc);
                break;
                case 2:
                System.out.println("------applying through tatkal-----");
                // System.out.println("applicationId");
                // System.out.println("name");
                // System.out.println("dob");
                // System.out.println("gender");
                // System.out.println("address");
                // System.out.println("mobile");
                // System.out.println("adhaar");
                app.adddetails(applicants, sc);
                break;
                case 3:
                System.out.println("------applying passport abraod passport-----");
                // System.out.println("applicationId");
                // System.out.println("name");
                // System.out.println("dob");
                // System.out.println("gender");
                // System.out.println("address");
                // System.out.println("mobile");
                // System.out.println("adhaar");
                app.adddetails(applicants, sc);
                break;
                case 4:
                    break;
                default:
                    System.out.println("enter valid option");
                    break;
            }
             } while (option!=4);
                break;
            
            case  2:
                System.out.println("view applicants here");
                app.view(applicants);
                break;
            case 3:
                System.out.println("search applicants here");
                app.filterbyId(applicants, sc);
                break;
                case  4:
                    System.out.println("update your detail");
                    app.updateapplication(applicants, sc);
                    break;
            case 5:
                System.out.println("exit");
                return;
            default:
               System.out.println("enter valid option");
               break;
        }
     
    }
}}

    
