
public class TestApp {

	public static void main(String[] args) {
		
		
		int [] nums =  {11, 9, 23, 87, 38, 22, 92, 10};//สร้างอาร์เรย์สำหรับเก็บข้อมูล
		Sorting sort = new Sorting(nums);
		sort.bubbleSort();//ให้ทำการเรียงข้อมูลตามรูปแบบที่เขียนไว้
		sort.printSortedData();
		
		System.out.println();
		Sorting sort1 = new Sorting(nums);
		sort1.bubbleSort(true);
		sort1.printSortedData();

		//NO.2  Selection Sort
		int [] nums2 =  {25, 11, 45, 6, 87, 20, 78, 64};
		System.out.println();
		Sorting sort2 = new Sorting(nums2);
		sort2.selectionSort();
		sort2.printSortedData();
		
		//No.4 Insertion Sort
		int [] nums4 ={68, 10, 87, 75, 14, 36, 98, 76};
		System.out.println();
		Sorting sort4 = new Sorting(nums4);
		sort4.selectionSort();
		sort4.printSortedData();
		
		//No.6 Quick Sort
		 int[] nums6 = {87, 11, 26, 35, 49, 85, 21, 46};
		 System.out.println();
	     Sorting sort6 = new Sorting(nums6);
	     sort6.quicksort();
	     sort6.printSortedData();
		
		
	}

}
