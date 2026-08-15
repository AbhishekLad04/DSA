import java.util.*;

public class MaximumSumSubarray {

	public static long maximumSubarraySum(int[] nums, int k) {         
		int l = 0, r = 0, n = nums.length;
        	long sum = 0, maxsum = 0; 
        	HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        	while (r < n) {
            		sum += nums[r];
            
            		if (!hashMap.containsKey(nums[r])) {
                		hashMap.put(nums[r], 1);
                		if (r - l + 1 == k) {
                    			maxsum = Math.max(maxsum, sum);
                    			sum -= nums[l];
                    			hashMap.remove(nums[l]);
                    			l++;
                		}
            		}
            		else {
                		while (nums[l] != nums[r]) {
                    			sum -= nums[l];
                    			hashMap.remove(nums[l]);
                    			l++;
                		}
                		sum -= nums[l];
                		l++; 
            		}
           		 r++;
        	}
        	return maxsum;
	}
}