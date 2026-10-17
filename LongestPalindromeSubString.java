public class LongestPalindromeSubString {

	public String longestPalindrome(String s) {
        	int left = 0;
        	int right = s.length()-1;
        	String result = "";
        	for(int i=0;i<s.length();i++){
            		for (int j=i;j<s.length();j++){
                		if (isPalindrome(s,i,j)){
                    			if (j-i+1 > result.length()){
                        			result = s.substring(i,j+1);
                    			}
                		}
            		}
        	}
        	return result;
    	}

    	private boolean isPalindrome(String s,int l,int r){
        	while (l<r){
            		if (s.charAt(l) != s.charAt(r)){
                		return false;
            		}
            		l++;
            		r--;
        	}
        	return true;
    	}
}