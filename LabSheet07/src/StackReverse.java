import java.util.Stack;

public class StackReverse {

    public static void main(String[] args) {
        String original = "Hello World";       //กำหนดข้อความที่ต้องการกลับลำดับ
        System.out.println("Original String: " + original);       
        String reversed = reverseCharacter(original);//เรียกใช้ฟังชั่นกลับตัวอักษร
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseCharacter(String original) { //สร้างstack เก็บตัวอักษร	
        Stack<Character> stack = new Stack<Character>();      
        
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));//ดันตัวอักษรใส่stackที่ละตัววนลูจาก ซ้ายไปขวา
        }

        String reversedResult = "";
        while (!stack.isEmpty()) {
            reversedResult = reversedResult + stack.pop();//ดึงตัวอักษรออกมาstack
        }
        
        return reversedResult;
    }
}