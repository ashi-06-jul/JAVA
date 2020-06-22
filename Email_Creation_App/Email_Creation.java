package Email_Creation_App;
import java.util.*;
public class Email_Creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random(); 
		int randPassword = rand.nextInt(1000);
		password p = new password();
		p.setPswd(randPassword);
		System.out.println("Enter your First Name");
		String f_name=sc.next();
		System.out.println("Enter your Last Name");
		String l_name=sc.next();
		System.out.println("Enter your Department Name");
		String d_name=sc.next();
		department d = new department();
		d.setDepartment_Name(d_name);
		employeeName e = new employeeName();
		e.setFirstName(f_name);
		e.setLastName(l_name);
		mailBox m = new mailBox();
		String emailId=(e.getFirstName().concat(e.getLastName().concat(d.department_Name).concat("@gmail.com")));
		System.out.println("Name:"+e.getFirstName()+" "+e.getLastName());
		System.out.println("Mail Box Capacity:"+m.getMbCapacity());
		System.out.println("Email Id:"+emailId);
		System.out.println("Password:"+p.getPswd());
		System.out.println("Enter a new password");
		p.setPswd(sc.nextInt());
		System.out.println("Password changed successfully");
	}

}
class department
{
	String department_Name;
	public String getDepartment_Name() {
		return department_Name;
	}
	public void setDepartment_Name(String department_Name) {
		this.department_Name = department_Name;
	}
	
}
class employeeName
{
	String firstName;
	String LastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
}
class password{
	int pswd;
	public int getPswd() {
		return pswd;
	}
	public void setPswd(int pswd) {
		this.pswd = pswd;
	}
}
class mailBox{
	int mbCapacity=20;

	public int getMbCapacity() {
		return mbCapacity;
	}

	public void setMbCapacity(int mbCapacity) {
		this.mbCapacity = mbCapacity;
	}
}