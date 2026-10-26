import java.util.HashMap;
public class LongestSubstringWithoutRepeatingBRUT {

	public int lengthOfLongestSubstring(String s) {
        	int max = 0;
        	for (int i=0;i<s.length();i++){
            		int count = 0;
            		HashMap<Character,Integer> map = new HashMap<>();
            		for (int j=i;j<s.length();j++){
                		char ch = s.charAt(j);
                		if (map.getOrDefault(ch,0) >= 1) break;
                		map.put(ch,map.getOrDefault(ch,0)+1);
                		count++;
                		max = Math.max(max,count);
            		}
        	}
        	return max;
    	}
}