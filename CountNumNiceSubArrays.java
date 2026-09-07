public class CountNumNiceSubArrays {

	public int numberOfSubarrays(int[] nums, int k) {
        	int count=0;
        	for (int i=0;i<nums.length;i++){
            		int oddCount=0;
            		for (int j=i;j<nums.length;j++){
                		if (nums[j]%2 == 1){
                    			oddCount++;
                		}
                		if (oddCount == k){
                    			count++;
                		}
            		}
        	}
        	return count;
    	}
}