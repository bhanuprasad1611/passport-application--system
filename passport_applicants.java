public class passport_applicants {
    private int applicationId;
    private String name;
    private String dob;
    private String gender;
    private String address;
    private long mobile;
    private long adhaar;
    public passport_applicants(int applicationId,String name,String dob, String gender,String  address,long mobile,long adhaar){
        this.applicationId=applicationId;
        this.name=name;
        this.dob=dob;
        this.gender=gender;
        this.address=address;
        this.mobile=mobile;
        this.adhaar=adhaar;
    }
    public void viewapplication(){
        System.out.println("job id is "+this.applicationId);
        System.out.println("name  is  "+this.name);
        System.out.println("dob is "+this.dob);
        System.out.println("gender  "+this.gender);
        System.out.println("address is  "+this.address);
        System.out.println("year is "+this.mobile);
        System.out.println("enter your  adhaar"+this.adhaar);

    }
    public int getApplicationId(){
        return  applicationId;
    }
    public void setName(String name){
    this.name = name;
}

public void setAddress(String address){
    this.address = address;
}

public void setMobile(long mobile){
    this.mobile = mobile;
}
    
}
