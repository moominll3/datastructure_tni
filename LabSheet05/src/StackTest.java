
public class StackTest {

	public static void main(String[] args) {
		StackLinkedList num_stack = new StackLinkedList();
		
		num_stack.push(15); //เพิ่มเลข 15 เข้าไปในstack
		num_stack.push(16);
		num_stack.push(17);
		
		System.out.println("pop stack = " + num_stack.pop());//เอาเลข17มาแต่ก็ลบเลข 17ไปด้วย
		//System.out.println("peek stack = " + num_stack.peek());//พอลบ17ไปแล้ว 16จะเป็นค่าล่าสุด หรือ top
		//System.out.println("peek stack = " + num_stack.peek());
		//System.out.println("pop stack = " + num_stack.pop());
		//System.out.println("peek stack = " + num_stack.peek());
		//System.out.println("pop stack = " + num_stack.pop());
		//System.out.println("peek stack = " + num_stack.peek());
	}

}
