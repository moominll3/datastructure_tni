
public class QueueTest {

	public static void main(String[] args) {
		
		//QueueArrayBased queue = new QueueArrayBased(); 
		QueueLinkedList queue = new QueueLinkedList();
		
		
		queue.enqueue(10);//เพิ่มข้อมูลเเข้าไปในคิว
		queue.enqueue(11);
		
		System.out.println(queue.peek());//แสดงผลโดยดึงข้อมูลตัวล่าสุดมาเช็ค
		System.out.println(queue.dequeue());// ดูข้อมูลล่าสุดและลบข้อมูลที่ดู
		System.out.println(queue.peek());//แสดงผลโดยดึงข้อมูลตัวล่าสุดมาเช็ค
		
	}

}
