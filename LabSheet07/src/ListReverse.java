import java.util.ArrayList;

public class ListReverse {
    
    public static void main(String[] args) {
    	
        ArrayList<Integer> original = new ArrayList<>();         
        for (int i = 11; i <= 20; i++) {
        	           original.add(i);
        }      
        System.out.println("Original List: " + original);         
        ArrayList<Integer> reversed = reverseList(original);         
        System.out.println("Reversed List: " + reversed);
        
    }
    public static ArrayList<Integer> reverseList(ArrayList<Integer> original) {   	
        ArrayList<Integer> reversedResult = new ArrayList<>();            
        for (int i = original.size() - 1; i >= 0; i--) {
            reversedResult.add(original.get(i));
        }   
        return reversedResult;
    }
}