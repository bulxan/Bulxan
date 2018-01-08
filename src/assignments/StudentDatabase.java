package assignments;

public class StudentDatabase {

	public static void main(String[]args) {

		Student s1 = new Student("Bulxan","778855222");
		s1.setState("Sanaag");
		s1.setCity("Ceergaabo");
		s1.enroll("HTML");
		s1.enroll("JAVA");
		s1.enroll("SQL");
		s1.enroll("ORACLE");
		s1.pay(2000);
		s1.setPhone("7417769");
		s1.userId();
		System.out.println(s1.toString());
		
	}
}

class Student{
	private String city;
	private String phone;
	private String state;
	private String name;
	private String ssn;
	static private int id = 0;
	private String email;
	private static final double costOfCourse = 800; 
	double balance;
	double amount;
	private String userId;
	private String courses = "";
	Student(String name, String ssn){
		id ++;
		this.ssn = ssn;
		this.name = name;
		email = this.name.substring(0).toLowerCase()+"."+id+"@gmail.com";
		
	}
	
	void checkBalance() {
		System.out.println("Your balance: "+balance);
		
	}
	
	void userId() {
		int max, min;
		max = 9000;
		min = 1000;
		int random = (int) (Math.random() * (max - min));
		userId =name.substring(0, 5).toLowerCase()+"-"+ id +""+ random+ssn.substring(5);
	}
	void setCity(String city) {
		this.city = city;
	}
	
	void setPhone(String phone) {
		this.phone = phone;
	}
	void setState(String state) {
		this.state = state;
	}
	
	void enroll(String course) {
		
		this.courses =this.courses+ course+" ";
		balance = balance + costOfCourse;
	}
	void showCourse() {
		System.out.println("Courses: "+courses);
	}
	void pay(double amount) {
		this.amount =amount;
		balance = balance - amount;
	}
	@Override
	public String toString() {
		System.out.println("");
		System.out.println("==="+name+"'s Profile===");
		return "[State: "+state+"]\n[City: "+city+"]\n[Name: "+name+"]\n[Phone: "+phone+"]\n[Email: "+email+"]\n[Courses: "+courses+"]\n[ID: "+id+"]\n[User-id: "+userId+"]\n[Current Balance: "+(balance+amount)+"]\n[Payment: "+amount+"]\n[Balance: "+balance;
	}
}
