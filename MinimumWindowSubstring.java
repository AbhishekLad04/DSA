public class MinimumWindowSubstring {

	public String minWindow(String s, String t) {
        	Map<Character,Integer> tMap = new HashMap<>();
        	for (char c : t.toCharArray()){
            		tMap.put(c,tMap.getOrDefault(c,0)+1);
        	}
        	String ans = "";
        	for (int i=0;i<s.length();i++){
            		Map<Character,Integer> sMap = new HashMap<>();
            		for (int j=i;j<s.length();j++){
                		char c = s.charAt(j);
                		sMap.put(c,sMap.getOrDefault(c,0)+1);
                		if (isPresent(tMap,sMap)){
                    			String sub = s.substring(i,j+1);
                    			if (ans.length() == 0 || sub.length() < ans.length()){
                        			ans = sub;
                    			}
                    			break;
                		}
            		}
        	}
        	return ans;
    	}

	private boolean isPresent(Map<Character,Integer> tMap,Map<Character,Integer> sMap){
        	for (char c : tMap.keySet()){
            		if (sMap.getOrDefault(c,0) < tMap.get(c)){
                		return false;
            		}	
        	}
        	return true;
    	}
}