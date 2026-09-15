import java.util.ArrayDeque;
import java.util.Deque;

public class Sorting {
	private int[] array;
	
	public Sorting(int[] array) {
		this.array = array;
	}
	
	public void printSortedData() {
		for (int i = 0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public void bubbleSort() {
		for (int i=0; i<array.length; i++) { // วนตัวแรกถึงตัวสุดท้าย loop through all elements
			boolean is_swapped = false;
			 for (int j = 0; j < array.length - i - 1; j++) { 
				 int current_index = j;//current_index = j
				 if(array[j] > array[j+1]) {//น้อยไปมาก
					 int temp = array[j]; //สลับ swap the elements
		             array[j] = array[j + 1];
		             array[j + 1] = temp;
		                
		                is_swapped = true;
		                
				 }//end if
				 
			 }//end for
			 if (is_swapped == false) {
				 break;
			 }
			 
		}
		
		
	}
	
	public void bubbleSort(boolean order) {
		for (int i=0; i<array.length; i++) { // วนตัวแรกถึงตัวสุดท้าย loop through all elements
			boolean is_swapped = false;
			 for (int j = 0; j < array.length - i - 1; j++) { 
				 if (order == true) {
				 int current_index = j;//current_index = j
				 if(array[j] < array[j+1]) { //มากไปน้อย
					 int temp = array[j]; //สลับ swap the elements
		             array[j] = array[j + 1];
		             array[j + 1] = temp;
		               
		                is_swapped = true;
		                
				 }//end if
				 
			 }//end for
				 
		}
			 if (is_swapped == false) {
				 break;
			 }
			 
		 }
		
		
	}
	
	
	public void selectionSort() {
		  for (int i = 0; i < array.length - 1; i++) { // วนตัวแรกถึงตัวสุดท้าย loop through all elements
			  int current_index = i ;
			  int minimum_index = i;
			  for (int j = i; j < array.length ; j++) {// j มีค่าเริ่มที่ i
				  if (array[j] < array[minimum_index]) {
					  minimum_index = j;
				  }
				  
			  }
			  //swap the elements of array[i] and array[minimum_index]
		
			  int temp = array[i];
		        array[i] = array[minimum_index];
		        array[minimum_index] = temp;
		        
			  
		  }
		
	}
	
	public void insertionSort() {
		for (int i = 1; i < array.length ; i++) {
			int key = array[i];
			int walker_index = i-1;
			while (walker_index >= 0 && array[walker_index]> key) {
				array[walker_index +1 ] = array[walker_index];//เอาข้อมูลไปใส่ในด้านขวา
				walker_index = walker_index -1; //ขยับไปซ้าย
			}
			array[walker_index+1] = key;//เอาkeyไปใส่ด้านขวาของwalker
		}
	
	}
	
	public void quicksort() {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		
		stack.push(array.length - 1);//push ต่ำแหน่งสุดท้าย
		stack.push(0);//push ต่ำแหน่งแรก
		 
		 
		 while (!stack.isEmpty()) {
		     int low = stack.pop();
			 int high = stack.pop();
			 if(high - low < 1) {
				 continue;
				 
			 }
			 int j = partition(low,high);
			 stack.push(high);
			 stack.push(j + 1);
			 stack.push(j);
			 stack.push(low);
		 }

	}
	
	private int partition(int low, int high) {
		 int pivot = array[low];
		    int i = low;
		    int j = high;
		    
		    while (true) {
		    	 while (array[i] < pivot) {
		             i++;
		    }
		    	 
		    while (array[j] > pivot) {
		             j--;
		    }
		    
		    if (i >= j) {
	            break;
	        }//swap the elements array[i] and array[j]
		    int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;

	        i++;
	        j--;
	   	
	    }
			 return j;
		   
	 }
	
}
