public class LongestSubStringWithoutRepeating {

	public int lengthOfLongestSubstring(String s) {
        	int max = 0;
        	StringBuilder str = new StringBuilder();
        	for (int r=0;r<s.length();r++){
           		char c = s.charAt(r);
            		if (str.toString().indexOf(c) == -1){
                		str.append(c);
            		}else {
                		while (str.toString().indexOf(c) != -1){
                    			str.deleteCharAt(0);
                		}
                		str.append(c);
            		}
            		max = Math.max(max,str.length());
        	}
        	return max;
    	}
}