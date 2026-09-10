public class NoOfSubStringContain3Chars {

	public int numberOfSubstrings(String s) {
        	int count=0;
        	for (int i=0;i<s.length();i++){
            		int[] freq = new int[3];
            		for (int j=i;j<s.length();j++){
                		freq[s.charAt(j)-'a'] ++;
                		if (freq[0]>0 && freq[1]>0 && freq[2]>0){
                    			count += s.length()-j;
                    			break;
                		}
            		}
        	}
        	return count;
    	}
}