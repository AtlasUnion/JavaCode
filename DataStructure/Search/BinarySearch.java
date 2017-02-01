
public class BinarySearch {
	
	
	public static boolean find(int[] a, int val)
	{
		return find(a, val, 0, a.length - 1);
	}
	
	public static boolean find(int[] a, int val, int start, int end)
	{
		 
	      int index = (start + end)/2;
	      if (a[index] == val){
	    	  return true;
	      }
	      else if (start==end){
	    	  return false;
	      }
	      else if (a[index] < val){
	         return find(a, val, index+1, end);
	      }
	      else{
	         return find(a, val, start, index-1);
	      }
	}

}
