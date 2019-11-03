import java.io.PrintWriter;

public class StudentLinkedList {
	private Node head;
	private Node tail;
	
	// instantiate list as empty
	public StudentLinkedList() {
		head = null;
		tail = null;
	}
	
	// getters
	public boolean isEmpty() {
		return head == null;
	}
	
	public int size() {
		int counter = 0;
		while (!isEmpty()) {
			counter++;
		}
		return counter;
	}
	
	public void add(Student student) {
		Node newNode = new Node(student);
		// if list is empty, set new node to head
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNextNode(newNode);
			tail = newNode;
		}
	}
	
	public void printList(PrintWriter printWriter) {
		Node current = head;
		while (current != null) {
			current.getStudent().printStudent(printWriter);
			current = current.getNextNode();
		}
	}
	
	// setters
	public void sortList() {
		Node current = head;
		Node next = null;
		if (head == null) {
			return;
		} else {
			while (current.hasNext()) {
				next = current.getNextNode();
				while (next != null) {
					Student currStudent = current.getStudent();
					Student nextStudent = next.getStudent();
					if (currStudent.getName().compareTo(nextStudent.getName()) > 0) {
						Student temp = currStudent;
						current.setStudent(nextStudent);
						next.setStudent(temp);
					}
					next = next.getNextNode();
				}
				current = current.getNextNode();
			}
		}
	}
}
