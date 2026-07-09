import java.util.ArrayList;
import java.util.Scanner;

public class  Leb202 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        addInitialNumbers(numbers, initial_numbers);
        System.out.println("ข้อมูลเริ่มต้น : " + numbers);
        System.out.print("กรอกตัวเลขที่ต้องการเพิ่มต่อท้าย : ");
        int value1 = sc.nextInt();
        addLast(numbers, value1);
        System.out.print("กรอกตัวเลขที่ต้องการแทรก : ");
        int value2 = sc.nextInt();
        insertNumber(numbers, 5, value2);   
        deleteNumber(numbers, 4);         
        updateNumber(numbers, 4, 9);                                               
        display(numbers);
        sc.close();
    }
    public static void addInitialNumbers(ArrayList<Integer> numbers, int[] initial_numbers) {
        for (int i = 0; i < initial_numbers.length; i++) {
            numbers.add(initial_numbers[i]);
        }
    }
    public static void addLast(ArrayList<Integer> numbers, int value) {
        numbers.add(value);
    }
    public static void insertNumber(ArrayList<Integer> numbers, int index, int value) {
        numbers.add(index, value);
    }
    public static void deleteNumber(ArrayList<Integer> numbers, int index) {
        numbers.remove(index);
    }
    public static void updateNumber(ArrayList<Integer> numbers, int index, int value) {
        numbers.set(index, value);
    }
    public static void display(ArrayList<Integer> numbers) {
        System.out.println("\nข้อมูลสุดท้าย");
        System.out.println(numbers);
    }

}

//เขียนคำสั่งสร้างชุดข้อมูล 2 ตัว คือ
//• ArrayList ชื่อ numbers และ 
//• อาร์เรย์ชื่อ initial_numbers เก็บค่าตัวเลข 10 ตัว ประกอบด้วย 10, 11, 12, 13, 14, 15, 16, 17, 18, 19
//เขียนโปรแกรมที่มีการดำเนินการ ดังต่อไปนี้
//o นำตัวเลขทั้งหมดในอาร์เรย์initial_numbers เก็บไว้ใน ArrayList ที่สร้างในตอนแรก (numbers)
//o รับค่าตัวเลขที่ต้องการเพิ่มเข้า numbers ➔ โดยเพิ่มต่อท้ายข้อมูลตัวสุดท้ายใน numbers
//o รับค่าตัวเลขที่ต้องการเพิ่มเข้า numbers ➔ โดยแทรกเข้าไปใน numbers ที่ตำแหน่งตามเลขสุดท้ายของรหัสนักศึกษา
//o ลบข้อมูลใน numbers ➔ โดยลบตำแหน่งตามเลขรองสุดท้ายของรหัสนักศึกษา
//o อัปเดตตัวเลขใน numbers ➔ โดยตำแหน่งที่อัปเดตตามเลขก่อนรองสุดท้ายของรหัสนักศึกษา เป็นวันที่ ณ วันที่เรียน
//o แสดงผลสุดท้าย ข้อมูลใน ArrayList ของนักศึกษา มีเลขอะไรบ้าง?
