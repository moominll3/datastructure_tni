
public class QueueLinkedList {

	// pointer of the front and rear node
	private Node front;//ตัวแรก
	private Node rear;//ตัวสุดท้าย
	
	// create an empty queue
	public QueueLinkedList() {
		front = null;
		rear  = null;
	}
	
	public boolean isEmpty() {//เช็คว่าเป็นค่าว่างมั้ย
		if(front == null) {
			return true;
		}
		return false;
	}
	
	public void enqueue(int value) {//เพิ่มข้อมูลต่อท้าย
		Node new_node = new Node(value);//สร้างตัวแปรnodeใหม่
		if (isEmpty() == true) { //ถ้ามีข้อมูล
			front = new_node;
			rear = new_node;
		}else {
			rear.next = new_node;
			rear = new_node;
		}

	}
	
	public int peek() {
		if (isEmpty() == false) {
			return front.data;
		}
        return -1;
	}
	
	public int dequeue() {
		if (isEmpty() == false) {//เช้คว่ามีข้อมูล
			Node temp_node = front;//ชี้ไปnodeตัวแรก back up the first node
			int temp_data = temp_node.data;//back up in the first node
			
			front = front.next; //move front to the next node 
			
			temp_node = null; //remove from computer memory
			
			return temp_data;
		}

		return -1;
	}
	
}

