public class MaxConsecutiveOnes3 {

	public int longestOnes(int[] nums, int k) {
		int l=0,r=0,max=0,sum=0,count=0;
		while (r<nums.length){
			if (nums[r]!=1){
				count++;
			}
			sum++;
			if (count>k){
				while (count!=k){
					if (nums[l]==0){
						count--;
					}
					sum--;
					l++;
				}
			}
			max = Math.max(max,sum);
			r++;
		}
		return max;
	}
}