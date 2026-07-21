
public class TodoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkedList todoList = new DoublyLinkedList();
		todoList.insert("Finish Homework");
		todoList.insert("Laundry");
		todoList.insert("Group Meeting");
		System.out.println("TO-DO List = "+todoList.traversal());
		
		todoList.insert(0,"Submit Report"); //เพิ่มSubmit Report"ในตำแหน่งแรกหรือ index 0
		System.out.println("TO-DO List = "+todoList.traversal());
		
		todoList.insert(2,"Buy Food");//เพิ่ม"Buy Food"ในตำแหน่งหลัง"Finish Homework"หรือ index 2
		System.out.println("TO-DO List = "+todoList.traversal());
		
		todoList.insert("Go to Gym");//เพิ่ม"Go to Gym"ในตำแหน่งสุดท้าย 
		System.out.println("TO-DO List = "+todoList.traversal());
		
		todoList.remove();
		System.out.println("TO-DO List = "+todoList.traversal());
		
		todoList.remove(3);//ลบ"Laundry" ออก 3 คือตำแหน่งของ "Laundry"
		System.out.println("TO-DO List = "+todoList.traversal());
		
		todoList.remove(0);
		System.out.println("TO-DO List = "+todoList.traversal());
		
		System.out.println("BackwardTraversal = "+todoList.backwardTraversal());
	}
	

}
