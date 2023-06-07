package in.ineuron.in;
import java.util.HashMap;

public class StrobogrammaticNumber {
	
	
	    public static boolean isStrobogrammatic(String num) {
	        // Create a HashMap to store the strobogrammatic pairs
	        HashMap<Character, Character> map = new HashMap<>();
	        map.put('0', '0');
	        map.put('1', '1');
	        map.put('6', '9');
	        map.put('8', '8');
	        map.put('9', '6');
	        
	        int left = 0;
	        int right = num.length() - 1;
	        
	        while (left <= right) {
	            char leftChar = num.charAt(left);
	            char rightChar = num.charAt(right);
	            
	            // If the characters are not in the strobogrammatic pairs, return false
	            if (!map.containsKey(leftChar) || map.get(leftChar) != rightChar) {
	                return false;
	            }
	            
	            left++;
	            right--;
	        }
	        
	        return true;
	    }
	    
	    public static void main(String[] args) {
	        String num = "69";
	        boolean isStrobogrammatic = isStrobogrammatic(num);
	        System.out.println(isStrobogrammatic);
	    }
	}



