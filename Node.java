public class Node {
	private Node nextNode;
	private Student student;
	
	public Node(Student student) {
		this.nextNode = null;
		this.student = student;
	}
	
	// getters
	public Node getNextNode() {
		return nextNode;
	}
	
	public Student getStudent() {
		return this.student;
	}
	
	public Boolean hasNext() {
		return nextNode != null;
	}
	
	// setters
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
}
