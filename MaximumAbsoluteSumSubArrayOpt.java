public class MaximumAbsoluteSumSubArrayOpt {

	public int maxAbsoluteSum(int[] nums) {
        	int max = MinMax(nums);
        	for (int i=0;i<nums.length;i++){
            		nums[i] *= -1;
        	}
        	max = Math.max(max,MinMax(nums));
        	return max;
    	}
    
	private int MinMax(int[] nums){
        	int max = 0,sum = 0;
        	for (int i=0;i<nums.length;i++){
            		sum += nums[i];
            		max = Math.max(max,sum);
            		if (sum < 0) sum = 0;
        	}
        	return max;
    	}
}