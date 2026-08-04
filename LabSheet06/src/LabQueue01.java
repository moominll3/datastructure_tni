import java.util.Queue;
import java.util.ArrayDeque;

public class LabQueue01 {

	public static void main(String[] args) {
		
		Queue<Integer> q_num = new ArrayDeque<Integer>();//สร้าง Queue<Integer> 
		
		for (int i=101; i<=105; i++) {//ใช้วิธีการวนลูป เพื่อเก็บหมายเลขดังกล่าวเข้าคิว เก็บหมายเลขคิว 101-105
			q_num.add(i);
			System.out.println("Enqueue: "+i);
		}
		System.out.print("Queue => " + q_num);
		
		while (q_num.isEmpty() == false) {
			System.out.println("Calling number: " +q_num.peek());//การดูหมายเลขคิวถัดไป ให้แสดงข้อความว่า “Calling number: [หมายเลขคิว]”
			System.out.println("Providing service number: " +q_num.poll());//การประกาศเรียกคิว ให้แสดงข้อความว่า “Providing service number: [หมายเลขคิว]” 
		}
		System.out.print("Queue => " + q_num);
	}

}
