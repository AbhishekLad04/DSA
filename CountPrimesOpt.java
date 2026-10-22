import java.util.ArrayList;
public class CountPrimesOpt{

	public int countPrimes(int n) {
        	boolean[] arr = new boolean[n+1];
        	Arrays.fill(arr,true);
        	if (n >= 0) arr[0] = false;
        	if (n >= 1) arr[1] = false;
        	for (int i=2;i*i<n;i++){
            		if (arr[i]){
                		for (int j=i*i;j<n;j+=i){
                    			arr[j] = false;
                		}
            		}
        	}
        	List<Integer> primes = new ArrayList<>();
        	for (int i=2;i<n;i++){
            		if (arr[i]){
                		primes.add(i);
            		}
        	}
        	return primes.size();
    	}
}