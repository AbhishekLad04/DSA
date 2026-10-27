import java.util.HashMap;
import java.util.ArrayList;
public class AllAnagramsInStringOpt2{

	public List<Integer> findAnagrams(String s, String p) {
        	HashMap<Character,Integer> map = new HashMap<>();
        	List<Integer> result = new ArrayList<>();

        	int count = p.length();
        	int l = 0;
        	for (char c : p.toCharArray()){
            		map.put(c,map.getOrDefault(c,0)+1);
        	}

        	for (int r=0;r<s.length();r++){
            		char c = s.charAt(r);
            		if (map.getOrDefault(c,0) > 0){
                		count--;
            		}
            		map.put(c,map.getOrDefault(c,0)-1);

            		if (r-l+1 > p.length()){
                		char ch = s.charAt(l);
                		map.put(ch,map.get(ch)+1);
                		l++;
                		if (map.get(ch) > 0){
                    			count++;
                		}
            		}

            		if (count == 0){
                		result.add(l);
            		}
        	}
        	return result;
    	}
}