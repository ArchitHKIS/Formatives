import java.util.Scanner;
public class UserInfo {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in); 	
	UserInfo2 UserInfo2 = new UserInfo2();
	System.out.println("What is your name?");
	UserInfo2.setname(input.nextLine());
	System.out.println(UserInfo2.getname());	
	System.out.println("What is your Date of Birth?");
	UserInfo2.setdob(input.nextLine());
	System.out.println(UserInfo2.getdob());
	System.out.println("What is your StaffID?");
	UserInfo2.setStaffid(input.nextInt());
	System.out.println(UserInfo2.getStaffid());
	System.out.println("Name: " +UserInfo2.getname());
	System.out.println("DOB: " +UserInfo2.getdob());
	System.out.println("Staff ID: " +UserInfo2.getStaffid());
	
	}

}
