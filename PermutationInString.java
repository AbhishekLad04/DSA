public class PermutationInString {

	public boolean checkInclusion(String s1, String s2) {
       		HashMap<Character,Integer> s1Map = new HashMap<>();
       		for(char c : s1.toCharArray()){
            		s1Map.put(c,s1Map.getOrDefault(c,0)+1);
       		}
        	for(int i=0;i<s2.length();i++){
            		HashMap<Character,Integer> s2Map = new HashMap<>();
            		for(int j=i;j<s2.length();j++){
                		char c = s2.charAt(j);
                		s2Map.put(c,s2Map.getOrDefault(c,0)+1);
                		if (s1Map.size() == s2Map.size()){
                    			if (match(s1,s1Map,s2Map)){
                        			return true;
                    			}
                		}
                		if (s2Map.size() > s1.length()) break;
            		}
        	}
        	return false;
    	}
    	private boolean match(String s,HashMap<Character,Integer> s1,HashMap<Character,Integer> s2){
        	for(int i=0;i<s2.size();i++){
            		char c = s.charAt(i);
            		if (s2.getOrDefault(c,0) != s1.get(c)){
                		return false;
            		}
        	}
        	return true;
    	}
}