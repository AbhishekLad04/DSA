public class MaximumSumCircularSubArrayOpt {

	public int maxSubarraySumCircular(int[] nums) {        
        	int totalSum = 0;
        	for (int n : nums){
            		totalSum += n;
        	}
        	int maxSum = maxSubArraySum(nums);
        	for (int i=0;i<nums.length;i++){
            		nums[i] *= -1;
        	}
        	int minSum = -maxSubArraySum(nums);
        	int circularSum = totalSum - minSum;
        	if (maxSum > 0) return Math.max(circularSum,maxSum);
        	return maxSum;
    	}

    	private int maxSubArraySum(int[] nums){
        	int max = nums[0];
        	int sum = nums[0];
        	for(int i=1;i<nums.length;i++){
            		if (sum < 0) sum = 0;
            		sum += nums[i];
            		max = Math.max(max,sum);
        	}
        	return max;
    	}
}