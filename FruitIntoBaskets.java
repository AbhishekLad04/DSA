import java.util.HashSet;
public class FruitIntoBaskets {

	public int totalFruit(int[] fruits) {
        	int max = 0;

        	for (int i=0;i<fruits.length;i++){
            		HashSet<Integer> set = new HashSet<>();
            		for (int j=i;j<fruits.length;j++){
             		   	set.add(fruits[j]);
               			if (set.size()<=2){
                   			max = Math.max(max,j-i+1);
        		        }else {
                 			break;
           			}
          		}
        	}
       		return max;
  	}
}