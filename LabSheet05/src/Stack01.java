import java.util.Arrays;

public class Stack01 {

    public static void main(String[] args) {

        int[] carriage = {1, 2, 3, 4, 5};

        // Stack
        int[] stack = new int[carriage.length];
        int top = -1;

        // Push
        for (int i = 0; i < carriage.length; i++) {
            System.out.println("Siding onto dead-end track: Car " + carriage[i]);
            stack[++top] = carriage[i];
        }

        System.out.println();
        System.out.print("Stack -> [");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i]);
            if (i < top) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println();

        // Pop
        while (top >= 0) {
            System.out.println("Exiting a dead-end: Car " + stack[top]);
            top--;
        }

        System.out.println();
        System.out.println("Stack -> []");
    }
}