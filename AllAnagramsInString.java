public class AllAnagramsInString{

	public List<Integer> findAnagrams(String s, String p) {
        	List<Integer> result = new ArrayList<>();
        	int k = p.length();

        	int[] pCount = new int[26];
        	for(char c : p.toCharArray()){
            		pCount[c - 'a']++;
        	}    

        	for (int i=0;i<=s.length()-k;i++){
            		int[] sCount = new int[26];
            		for (int j=i;j<i+k;j++){
                		sCount[s.charAt(j) - 'a']++;
            		}
            		if (Arrays.equals(pCount,sCount)){
                		result.add(i);
            		}
        	}
        	return result;
    	}
}