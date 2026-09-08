public class CountNumNiceSubArraysOpt {

	public int numberOfSubarrays(int[] nums, int k) {
        	return count(nums,k)-count(nums,k-1);
    	}

    private int count(int[] nums,int k){
        int count=0,oddCount=0;
        int l=0;
        for (int r=0;r<nums.length;r++){
            if (nums[r]%2 == 1){
                oddCount++;
            }
            while(oddCount>k){
                if (nums[l]%2 == 1) oddCount--;
                l++;
            }
            count += r-l+1;
        }
        return count;
    }
}