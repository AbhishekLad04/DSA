public class PermutationInStringOpt {

	public boolean checkInclusion(String s1, String s2) {
        	int[] arr1 = new int[26];
        	int[] arr2 = new int[26];

        	if (s1.length() > s2.length()) return false;

        	for(char c : s1.toCharArray()){
        		arr1[c-'a']++;
        	}

        	int left = 0;
        	for (int right=0;right<s2.length();right++){
            		arr2[s2.charAt(right)-'a']++;
            		if (right-left+1 > s1.length()){
	        	        arr2[s2.charAt(left)-'a']--;
        	        	left++;
            		}
            
            		if (right-left+1 == s1.length()){
                		boolean result = true;
                		for (int i=0;i<26;i++){
                    			if (arr1[i] != arr2[i]){
                        			result = false;
                        			break;
                    			}
                		}
                		if (result) return true;
            		}
        	}
        	return false;
    	}
}