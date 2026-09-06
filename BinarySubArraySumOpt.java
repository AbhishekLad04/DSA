public class BinarySubArraySumOpt{

	public int numSubarraysWithSum(int[] nums, int goal) {
        	return count(nums,goal) - count(nums,goal-1);
    	}
    
    	private int count(int[] nums,int goal){
		if (goal < 0) return 0;
        	int sum=0,l=0,count=0;
		for (int r=0;r<nums.length;r++){
			sum += nums[r];
			while (sum>goal){
				sum -= nums[l];
				l++;
			}
			count += r-l+1;
		}
		return count;
	}
}