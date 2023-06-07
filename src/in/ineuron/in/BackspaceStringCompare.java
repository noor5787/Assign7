package in.ineuron.in;
import java.util.Stack;
public class BackspaceStringCompare {


	
	    public static boolean backspaceCompare(String s, String t) {
	        return buildString(s).equals(buildString(t));
	    }

	    private static String buildString(String str) {
	        Stack<Character> stack = new Stack<>();
	        for (char ch : str.toCharArray()) {
	            if (ch != '#') {
	                stack.push(ch);
	            } else if (!stack.isEmpty()) {
	                stack.pop();
	            }
	        }
	        return String.valueOf(stack);
	    }

	    public static void main(String[] args) {
	        String s = "ab#c";
	        String t = "ad#c";
	        boolean result = backspaceCompare(s, t);
	        System.out.println(result);
	    }
	}



