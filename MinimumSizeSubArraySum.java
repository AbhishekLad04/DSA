public class MinimumSizeSubArraySum {

	public int minSubArrayLen(int target, int[] nums) {
        	int ans = Integer.MAX_VALUE;
        	int l=0,sum=0,sumAll=0;
        	for (int r=0;r<nums.length;r++){
            		sum += nums[r];
            		sumAll+=nums[r];
            		while (sum >= target){
                		ans = Math.min(ans,r-l+1);
                		sum -= nums[l];
                		l++;
            		}    
        	}
        	if (sumAll<target){
           		return 0;
        	}
        	return ans;
    	}
}