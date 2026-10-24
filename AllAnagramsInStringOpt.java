public class AllAnagramsInStringOpt {

	public List<Integer> findAnagrams(String s, String p) {
        	List<Integer> result = new ArrayList<>();
        	int count = p.length();
        	HashMap<Character,Integer> pCount = new HashMap<>();
        	HashMap<Character,Integer> sCount = new HashMap<>();

        	for (char c : p.toCharArray()){
            		pCount.put(c,pCount.getOrDefault(c,0)+1);
        	}
        	int left = 0; 
        	for (int right=0;right<s.length();right++){
            		char ch = s.charAt(right);
            		sCount.put(ch,sCount.getOrDefault(ch,0)+1);
            		if (pCount.containsKey(ch) && sCount.get(ch) <= pCount.get(ch)){
                		count--;
            		}
            		if (right - left + 1 > p.length()){
                		char leftChar = s.charAt(left);
                		if (pCount.containsKey(leftChar) && sCount.get(leftChar) <= pCount.get(leftChar)){
                    			count++;
                		}
                		sCount.put(leftChar,sCount.get(leftChar)-1);
                		left++;
            		}
            		if (count == 0){
                		result.add(left);
            		}
        	}
        	return result;
    	}
}