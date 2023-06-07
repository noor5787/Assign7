package in.ineuron.in;

public class StringReverser {

	    public static String reverseString(String s, int k) {
	        char[] chars = s.toCharArray();
	        int n = chars.length;

	        for (int i = 0; i < n; i += 2 * k) {
	            int start = i;
	            int end = Math.min(i + k - 1, n - 1);

	            // Reverse the first k characters
	            while (start < end) {
	                char temp = chars[start];
	                chars[start] = chars[end];
	                chars[end] = temp;
	                start++;
	                end--;
	            }
	        }

	        return new String(chars);
	    }

	    public static void main(String[] args) {
	        String s = "abcdefg";
	        int k = 2;
	        String reversedString = reverseString(s, k);
	        System.out.println(reversedString);
	    }
	}


