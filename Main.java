import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static StudentLinkedList linkedList = new StudentLinkedList();
	
	// write list to designated file
	public static void writeToFile() throws Exception {
		try {
    		FileWriter fileWriter = new FileWriter("C:/log/log.txt");
    		PrintWriter printWriter = new PrintWriter(fileWriter);
    		
    		linkedList.printList(printWriter);
    		
    		System.out.println("Successfully saved to file.");
    		printWriter.close();
    	} catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
	}
	
	public static void main(String args[]) throws Exception {
		Scanner scnr = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("You will be prompted to enter data for five students...");
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter student name (Last, First)");
			String name = scnr.nextLine();
			
			System.out.println("Enter student address (City, State Abbrev)");
			String address = scnr.nextLine();
			
			System.out.println("Enter student GPA");
			double gpa = scnr.nextDouble();
			
			scnr.nextLine();
			
			linkedList.add(new Student(name, address, gpa));
		}
		
		scnr.close();
		
		linkedList.sortList();
		
		try {
			writeToFile();
		} catch(Exception exception) {
			System.out.println(exception.getMessage());
			System.out.println("File not saved. Exiting...");
		}
	}
}