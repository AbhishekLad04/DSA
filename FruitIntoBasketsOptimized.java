public class FruitIntoBasketsOptimized {

	public int totalFruit(int[] fruits) {
     	 	int max = 0;
     	  	Map<Integer,Integer> map = new HashMap<>();

        	int l=0,r=0;
	        while (r<fruits.length){
        		int i = map.getOrDefault(fruits[r],0)+1;
		        map.put(fruits[r],i);
		        if (map.size() > 2){
                		while (map.size() > 2){
			                int j = map.get(fruits[l])-1;
			                map.put(fruits[l],j);
			                if (map.get(fruits[l])==0){
                        			map.remove(fruits[l]);
                    			}
                    			l++;
                		}
            		}
		        if (map.size() <= 2){
                	max = Math.max(max,r-l+1);
            		}
            		r++;
        	}
        	return max;
    	}
}