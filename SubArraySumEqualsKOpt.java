import java.util.HashMap;
public class SubArraySumEqualsKOpt {

	public int subarraySum(int[] nums, int k) {
       		int sum = 0,count = 0;
       		HashMap<Integer,Integer> map = new HashMap<>();
       		map.put(sum,1);
       		for (int i=0;i<nums.length;i++){
            		sum += nums[i];
            		int target = sum - k;
            		if (map.containsKey(target)){
                		count += map.get(target);
            		}
            		map.put(sum,map.getOrDefault(sum,0)+1);
       		}
        	return count;
    	}
}