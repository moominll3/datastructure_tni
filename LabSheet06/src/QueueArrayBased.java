
public class QueueArrayBased {
	
	// attributes in Queue Array-Based
	private int[] queue; 
	private final int MAX_SIZE = 50;//ขนาดพื้นที่ที่จอง
	private int size;//ขนาดข้อมูลว่ามีกี่ตัว
	
	// create an empty queue with default capacity
	public QueueArrayBased() {
		queue = new int[MAX_SIZE];
		size = 0;  // no element in queue
	}
	
	// create an empty queue with a specific capacity
	public QueueArrayBased(int capacity) {
		queue = new int[capacity];
		size = 0;  // no element in queue
	}
	
	public boolean isEmpty() { //เช็คว่ามีข้อมูลหรือไม่
		if (size == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {//เช็คว่าคิวเต็มหรือป่าว มีที่ว่างหรือป่าว
		if (size == queue.length) { 
			return true;
		}

		return false;
	}
	
	public boolean enqueue(int new_element) {
		if (isFull() == false ) {
			queue[size] = new_element;
			size++;
			return true;
		}

		return false;
	}
	
	public int peek() {//ดึงข้อมูลจากคิวมาเช็คว่าตัวล่าสุดคืออะไร มีค่าไหม
		if (isEmpty() == false) {
			return queue[0];
		}

		return -1;//ถ้าเป็นจำนวนเต็มบวกให้ใช้ -1 แต่ถ้าเป็นเลขอื่นๆติดลบหรืออะไรก็แล้วแต่ใช้ -9999
	}

	public int dequeue() {//เอาข้อมูลออกและลบออกไปด้วย ดูข้อมูลและลบข้อมูลที่ดู
		if(isEmpty() == false) {
			int temp = queue[0]; //เก้บข้อมูลไว้ในtemp
			for (int i=1; i<size; i++) {//เริ่มวนลูปเช็ค iเริ่มที่1  ให้คิวindex 1 = คิวindex i-1 คือ 1-1 เท่ากับเก็บในindexที่ 0
				queue[i-1] = queue[i];
			}
			size--;
			return temp;
		}

		return -1;
	}
}







