public class MinimumWindowSubstringOpt {

	public String minWindow(String s, String t) {
        	Map<Character,Integer> tMap = new HashMap<>();
        	for (char c : t.toCharArray()){
            		tMap.put(c,tMap.getOrDefault(c,0)+1);
        	}
        	Map<Character,Integer> sMap = new HashMap<>();
        	int min = Integer.MAX_VALUE;
        	String ans = "";
        	int l = 0, count = t.length();
        	for (int r=0;r<s.length();r++){
            		char c = s.charAt(r);
            		sMap.put(c,sMap.getOrDefault(c,0)+1);
            		if (tMap.containsKey(c) && sMap.get(c) <= tMap.get(c)){
                		count--;
            		}
            		while (count == 0){
                		if (r-l+1 < min){
                    			min = r-l+1;
                    			ans = s.substring(l,r+1);
                		}
                		char ch = s.charAt(l);
                		sMap.put(ch,sMap.getOrDefault(ch,0)-1);

                		if (tMap.containsKey(ch) && sMap.getOrDefault(ch,0) < tMap.get(ch)){
                    			count++;
                		}
                		l++;
            		}
        	}
        	return ans;
    	}
}