import java.util.ArrayList;


public class SelectionSearch {
	public static int findHighest(int[] a){
		if(a.length==0){
			return Integer.MIN_VALUE;
		}
		else{
			int max = 0;
			for(int i = 0;i<a.length;i++){
				max = a[i];
				for(int j =0;j<a.length;j++){
					if(max<a[j]){
						max = a[j];
					}
				}
				
			}
			return max;
		}
	}
	
    public static int findLowest(int[] a){
    	if(a.length==0){
			return Integer.MIN_VALUE;
		}
		else{
			int min = 0;
			for(int i = 0;i<a.length;i++){
				min = a[i];
				for(int j =0;j<a.length;j++){
					if(min>a[j]){
						min = a[j];
					}
				}
				
			}
			return min;
		}
    	
    }
    
    public static int findHighest(ArrayList<Integer> a){
    	if(a.size()==0){
			return Integer.MIN_VALUE;
		}
		else{
			int max = 0;
			for(int i = 0;i<a.size();i++){
				max = a.get(i);
				for(int j =0;j<a.size();j++){
					if(max<a.get(j)){
						max = a.get(j);
					}
				}
				
			}
			return max;
		}
    	
    	
    	
    }
    
    public static int findLowest(ArrayList<Integer> a){
    	if(a.size()==0){
			return Integer.MIN_VALUE;
		}
		else{
			int min = 0;
			for(int i = 0;i<a.size();i++){
				min = a.get(i);
				for(int j =0;j<a.size();j++){
					if(min>a.get(j)){
						min = a.get(j);
					}
				}
				
			}
			return min;
    	
    }
    }
}
