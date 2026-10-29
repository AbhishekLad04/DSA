import java.util.HashMap;
public class LongestSubstringWithoutRepeatingOptimized {

	public static void main(String[] args){
		String s = "abcabcbb";

		int max = 0,l = 0;
		HashMap<Character,Integer> map = new HashMap<>();

		for (int r=0;r<s.length();r++){
			char c = s.charAt(r);
			if (map.containsKey(c)){
				l = r;
			}
			map.put(c,r);

			max = Math.max(max,r-l+1);
		}		
		System.out.println(max);
	}
}