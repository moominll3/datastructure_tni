import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
	 
	public class LinkedListjumpSearch02  {
	 
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
		        
		        int index = jumpSearch(nums, target);
		        
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
		
	    public static int jumpSearch(LinkedList<Integer> nums, int target) {
	        
	        int jump_size = (int) Math.floor(Math.sqrt(nums.size()));
	        int start = 0;
	        int m = 0;
	        
	        
	        while (m < nums.size()) {        
	            if (target == nums.get(m)) {
	                return m;
	            }  
	            if (target > nums.get(m)) {
	                start = m;
	                m = m + jump_size;
	            } else {
	                for (int i = start; i < m; i++) {
	                    if (target == nums.get(i)) {
	                        return i;
	                    }
	                }
	                return -1;
	            }           
	            if (m >= nums.size()) {
	                for (int i = start; i < nums.size(); i++) {                   
	                    if (target == nums.get(i)) {
	                        return i;
	                    }
	                }
	            }
	        }
	        return -1;
	    }
		
	}
	 