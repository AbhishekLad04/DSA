public class SubArrayWithKDiffIntegersOpt {

	public int subarraysWithKDistinct(int[] nums, int k) {
        	return max(nums,k)-max(nums,k-1);
    	}

    	private int max(int[] nums,int k){
            	int count=0,l=0;
     	    	HashMap<Integer,Integer> map = new HashMap<>();
        	for (int r=0;r<nums.length;r++){
                	map.put(nums[r],map.getOrDefault(nums[r],0)+1);
			while(map.size()>k){
                   		map.put(nums[l],map.get(nums[l])-1);
				if (map.get(nums[l]) == 0){
					map.remove(nums[l]);
				}
				l++;
                	}
                	count += r-l+1;
        	}
       		return count;
    	}
}