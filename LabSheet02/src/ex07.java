import java.util.ArrayList;
import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> numlist = new ArrayList<Integer>(); //สร้างตัวแปรของArrayList
		
		System.out.println("Length = " + numlist.size());
		
		numlist.add(11);
		numlist.add(12);
		numlist.add(13);
		numlist.add(14);
		numlist.add(15);
		
		System.out.println("Length = " + numlist.size());
		System.out.println(numlist);
		
		System.out.print("\nEnter index to updeate: ");
		int index_update = scan.nextInt();
		System.out.print("Enter element to update : ");
		int element_update = scan.nextInt();
		
		numlist.set(index_update, element_update);
		System.out.println(numlist);
		
		
		System.out.println("\nEnter index to remove : ");
		int index_remove = scan.nextInt();
		
		numlist.remove(index_remove);
		System.out.print(numlist);
		
		System.out.println("\nEnter element to remove : ");
		int element_remove = scan.nextInt();
		
		numlist.remove(Integer.valueOf(element_remove));
		System.out.print(numlist);
	}

}
