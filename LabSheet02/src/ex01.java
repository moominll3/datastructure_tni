
public class ex01 {
	public static void main(String[] args) {
		
		int[] nums = {23, 67, 8, 91, 45, 12, 78 };
		
		System.out.println("Length ="+ nums.length);//ขนาดข้อมูลของอาร์เรย์ nums
		
		System.out.println("First element ="+ nums[0]);//ข้อมูลตัวแรกของอาร์เรย์ nums
		
		System.out.println("Last element ="+ nums[nums.length-1]); //ข้อมูลตัวสุดท้ายของอาร์เรย์ nums
		
		System.out.println("Middle element ="+ nums[nums.length/2]);//ข้อมูลตัวที่อยู่ตรงกลางของอาร์เรย์ nums

		System.out.println("Display all elements:");
		
		for (int i=0; i<nums.length; i++) {
			if (i !=0) {
				System.out.print(", ");
			}
			System.out.print(nums[i]); //ข้อมูลตัวที่อยู่ตรงกลางของอาร์เรย์ nums
			}
	}
}
