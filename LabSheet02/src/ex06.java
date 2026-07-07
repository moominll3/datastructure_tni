
public class ex06 {

	public static void main(String[] args) {
		NumArrayController nums = new NumArrayController();
		nums.display("Display inital detaset : ");
		
		int[] coppy_nums = new int[nums.getSize()-1];
		
		//Coppy index 0 and 1
		for (int i=0; i<2; i++) {
			coppy_nums[i] = nums.getNumArray()[i];
		}
       //Coppy index 3 - 6 to coppy_nums index 2 - 5
		for (int i=2+1; i<nums.getSize(); i++) {
			coppy_nums[i-1] = nums.getNumArray()[i];
			
		}
		nums.setNumbers(coppy_nums);
		nums.display("\n\nAfter deleted date in index 2 : ");
		
	}

}
