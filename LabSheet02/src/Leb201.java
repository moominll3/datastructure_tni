import java.util.ArrayList;

public class Leb201 {

	public static void main(String[] args) {
       ArrayList<String> names = new ArrayList<>();
        
        names.add("Alice");
        names.add("Emma");
        names.add("Leon");
        names.add("John");
        
        System.out.println("Length = " + names.size());
        System.out.println("All names in ArrayList = " + names);
    }
}
//เขียนโปรแกรมสร้าง ArrayList ชื่อ names สำหรับเก็บชื่อเล่นของนักเรียนในห้อง ซึ่งประกอบด้วย Alice, Emma, Leon และ John 
//จากนั้นแสดงผล ขนาดข้อมูล และ ข้อมูลทั้งหมดใน ArrayList