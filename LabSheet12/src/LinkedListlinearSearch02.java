import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
 
public class LinkedListlinearSearch02 {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        LinkedList<Integer> nums = random();
        System.out.print("Elements : ");
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }
        

        System.out.print("\nEnter target: ");
        int target = scan.nextInt();
        
        int index = linearSearch(nums, target);
        
        if (index != -1) {
            System.out.println("The target (" + target + ") at index " + index);
        } else {
            System.err.println("Cannot found " + target + " in this linked list");
        }
        
    }
 
    public static LinkedList<Integer> random() {
        Random rnd = new Random();
        LinkedList<Integer> nums = new LinkedList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            nums.add(rnd.nextInt(100)); 
        }
        
        return nums;
    }
 
    public static int linearSearch(LinkedList<Integer> nums, int target) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == target) {
                return i;
            }
        }
        return -1;
    }
}