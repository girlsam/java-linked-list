public class Node {
	private Node nextNode;
	private Student student;
	
	public Node(Student student) {
		this.nextNode = null;
		this.student = student;
	}
	
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Node getNextNode() {
		return nextNode;
	}
	
	public Student getStudent() {
		return this.student;
	}
	
	public Boolean hasNext() {
		return nextNode != null;
	}
}
