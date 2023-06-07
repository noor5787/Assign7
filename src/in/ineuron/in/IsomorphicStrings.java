package in.ineuron.in;
import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	
	
	    public static boolean isIsomorphic(String s, String t) {
	        if (s.length() != t.length())
	            return false;
	        
	        Map<Character, Character> map = new HashMap<>();
	        for (int i = 0; i < s.length(); i++) {
	            char c1 = s.charAt(i);
	            char c2 = t.charAt(i);
	            
	            if (map.containsKey(c1)) {
	                if (map.get(c1) != c2)
	                    return false;
	            } else {
	                if (map.containsValue(c2))
	                    return false;
	                
	                map.put(c1, c2);
	            }
	        }
	        
	        return true;
	    }
	    
	    public static void main(String[] args) {
	        String s = "egg";
	        String t = "add";
	        boolean isIsomorphic = isIsomorphic(s, t);
	        System.out.println(isIsomorphic); // Output: true
	    }
	}



