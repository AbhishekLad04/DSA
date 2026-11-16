public class MinimumWindowSubstringOpt2 {

	public String minWindow(String s, String t) {
        	Map<Character,Integer> map = new HashMap<>();
        	for (char c : t.toCharArray()){
            		map.put(c,map.getOrDefault(c,0)+1);
        	}
        	int min = Integer.MAX_VALUE;
        	String ans = "";
        	int l = 0, count = t.length();
        	for (int r=0;r<s.length();r++){
            		char c = s.charAt(r);
            		if (map.containsKey(c)){
                		if (map.get(c) > 0) count--;
                		map.put(c,map.getOrDefault(c,0)-1);
            		}

            		while (count == 0){
                		if (r-l+1 < min){
                    			min = r-l+1;
                    			ans = s.substring(l,r+1);
                		}
                		char ch = s.charAt(l);
                		if (map.containsKey(ch)){
                    			map.put(ch,map.getOrDefault(ch,0)+1);
                    			if (map.get(ch) > 0) count++;
                		}
                		l++;
            		}
        	}
        	return ans;
    	}
}