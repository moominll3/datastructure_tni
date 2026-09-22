import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
 
public class LinkedListbinarySearch02 {
 
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        LinkedList<Integer> nums = random_initial();   
        
        nums.sort(null);
        
        System.out.print("Elements :");
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(" " + nums.get(i));
        }
        
        System.out.print("\nEnter target: ");
        int target = scan.nextInt();
        
        int index = binarySearch(nums, target);
        
        if (index != -1) {
            System.out.println("\nThe target (" + target + ") at index " + index);
        } else {
            System.err.println("Cannot found " + target + " in this linked list");
        }
        
        scan.close();
    }
    public static LinkedList<Integer> random_initial() {
        Random rnd = new Random();
        LinkedList<Integer> nums = new LinkedList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            nums.add(rnd.nextInt(100));
        }
        return nums;
    }
    public static int binarySearch(LinkedList<Integer> nums, int target) {
        int low = 0;
        int high = nums.size() - 1;
        
        while (low <= high) {
            int middle = (low + high) / 2;
            
            if (nums.get(middle) == target) {
                return middle;
            }
            if (target < nums.get(middle)) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        
        return -1;
    }
}