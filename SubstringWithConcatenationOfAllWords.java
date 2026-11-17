public class SubstringWithConcatenationOfAllWords {

	public List<Integer> findSubstring(String s, String[] words) {
        	HashMap<String,Integer> map = new HashMap<>();
        	for (String str : words){
            		map.put(str,map.getOrDefault(str,0)+1);
        	}
        	int n = words.length;
        	int m = words[0].length();
        	int length = m*n;
        	List<Integer> ans = new ArrayList<>();
        	for (int i=0;i<=s.length()-length;i++){
            		HashMap<String,Integer> copyMap = new HashMap<>(map);
            		for (int j=0;j<words.length;j++){
                		String str = s.substring(i+j*m,i+j*m+m);
                		if (copyMap.containsKey(str)){
                    			if (copyMap.get(str) == 1) copyMap.remove(str);
                    			else copyMap.put(str,copyMap.get(str)-1);
                    			if (copyMap.size() == 0){
                        			ans.add(i);
                        			break;
                    			}
                		}else {
                    			break;
                		}
            		}
        	}
        	return ans;
    	}
}