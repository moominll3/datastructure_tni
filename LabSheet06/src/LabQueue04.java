import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class LabQueue04 {
	public static Queue<String> q_printer = new ArrayDeque<String>();
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Press 1 Add a file to the queue");
		System.out.println("Press 2 View the file");
		System.out.println("Press 3 Print the file");
		
		while (true) {
			System.out.print("\nEnter an option: ");
			int option = input.nextInt();
			if (option == 1) {  addFile();  } 
			else if (option == 2) { viewNextFile();  } 
			else if (option == 3) { printFile(); } 
			else { System.out.println("Exit"); break; }
		}
	}
	
	public static void addFile() {
		// write your code below here
		System.out.println("Enter File Name: ");
		String fileName = input.next();
		q_printer.add(fileName);//เพิ่มไฟล์เข้าคิว
		System.out.println(q_printer);

	}
	public static void viewNextFile() {
		// write your code below here
		if (q_printer.isEmpty()) {//เช็คว่าคิวว่างมั้ย
			System.out.println("No file in queue");
		}else {
			System.out.println("View " + q_printer.peek());//ดูไฟล์โดยไม่ลบ
			System.out.println("printer queue => " +q_printer);
		}


	}
	public static void printFile() {
		// write your code below here
		if (q_printer.isEmpty()) {//เช็คว่าคิวว่างมั้ย
			System.out.println("No file in queue");
		}else {
			String fileName = q_printer.poll();
			System.out.println("printing" + fileName);
			if (q_printer.isEmpty()) {//เช็คว่าคิวว่างมั้ย
				System.out.println("No file in queue");
			}else {
				System.out.println("printer Queue => " + q_printer);
			}
		}

	}

}