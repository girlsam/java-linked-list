import java.io.PrintWriter;

public class StudentLinkedList {
	private Node head;
	private Node tail;
	
	// instantiate list as empty
	public StudentLinkedList() {
		head = null;
		tail = null;
	}
	
	// check for empty list
	public boolean isEmpty() {
		return head == null;
	}
	
	// get size
	public int size() {
		int counter = 0;
		while (!isEmpty()) {
			counter++;
		}
		return counter;
	}
	
	// append new student to end of list
	public void add(Student student) {
		Node newNode = new Node(student);
		// if list is empty, set new node to head
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			// add student to end of list
			tail.setNextNode(newNode);
			tail = newNode;
		}
	}
	
	// loop through list and print each student
	public void printList(PrintWriter printWriter) {
		// start at head
		Node current = head;
		while (current != null) {
			current.getStudent().printStudent(printWriter);
			current = current.getNextNode(); // update pointer to next element
		}
	}
	
	// setters
	public void sortList() {
		Node current = head;
		Node next = null;
		// if list is empty, bail
		if (head == null) {
			return;
		} else {
			do {
				// get next node
				next = current.getNextNode();
				// unless there is no next node
				while (next != null) {
					Student currStudent = current.getStudent();
					Student nextStudent = next.getStudent();
					if (currStudent.getName().compareTo(nextStudent.getName()) > 0) {
						Student temp = currStudent; // temp holder for current
						current.setStudent(nextStudent); // new current 
						next.setStudent(temp); // next with temp
					}
					next = next.getNextNode(); // reset next
				}
				current = current.getNextNode(); // reset current
			} while (current.hasNext());
		}
	}
}
