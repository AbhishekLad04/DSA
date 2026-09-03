public class SubArrayWithKDiffIntegers {

	public int subarraysWithKDistinct(int[] nums, int k) {
        	int count=0;
        	for (int i=0;i<nums.length;i++){
            		HashMap<Integer,Integer> map = new HashMap<>();
            		for (int j=i;j<nums.length;j++){
                		map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                		if (map.size()==k){
                    			count++;
                		}else if (map.size()>k){
                   			break;
                		}
            		}	
        	}
        	return count;
    	}
}