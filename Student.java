import java.io.PrintWriter;

public class Student {
	private String name;
	private String address;
	private double gpa;
	
	public Student(String name, String address, double gpa) {
		setName(name);
		setAddress(address);
		setGPA(gpa);
	}
	
	// getters for private fields
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public double getgpa() throws Exception {
		return this.gpa;
	}
	
	public void printStudent(PrintWriter printWriter) {
        printWriter.println(name);
        printWriter.println("  " + address);
        printWriter.println("  " + gpa + " GPA");      
	}
	
	public void listStudent() {
        System.out.println(name);
        System.out.println("  " + address);
        System.out.println("  " + gpa + " GPA");      
	}
	
	// setters for private fields
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setGPA(double gpa) {
		try {
			if (gpa < 0.0 || Double.isNaN(gpa)) {
				this.gpa = 0.0;
				throw new Exception("Invalid GPA.");
			} else {
				this.gpa = gpa;
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("GPA has not been udpated. Exiting...");
		}
	}
}
