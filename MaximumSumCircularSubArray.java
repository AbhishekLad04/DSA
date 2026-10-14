public class MaximumSumCircularSubArray{

	public int maxSubarraySumCircular(int[] nums) {
        	int n = nums.length;
        	int max = Integer.MIN_VALUE;
        	for (int i=0;i<n;i++){
            		int sum = 0,count = 0;
            		for (int j=i;j<nums.length;j=((j+1)%n)){
                		if (count == n) break;
                		sum += nums[j];
                		max = Math.max(max,sum);
                		count++;
            		}
        	}
        	return max;
    	}
}