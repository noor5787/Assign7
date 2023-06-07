package in.ineuron.in;

public class StringShift {

	    public static boolean canShift(String s, String goal) {
	        if (s.length() != goal.length()) {
	            return false; // If the lengths are different, they can't be equal after any number of shifts
	        }

	        String doubledS = s + s; // Concatenate s with itself to handle circular shifts

	        return doubledS.contains(goal);
	    }

	    public static void main(String[] args) {
	        String s = "abcde";
	        String goal = "cdeab";

	        boolean result = canShift(s, goal);
	        System.out.println(result);
	    }
	}


