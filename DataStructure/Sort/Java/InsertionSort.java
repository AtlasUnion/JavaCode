import java.util.ArrayList;


public class InsertionSort {

	public static void sortLowToHigh(int[] a)
	{
		for (int i = 1; i < a.length; i++)
	    {
	        // a temporary copy of the current element
	        int tmp = a[i];
	        int j;
	 
	        // find the position for insertion
	        for (j = i; j > 0; j--)
	        {
	            if (a[j - 1] < tmp)
	                break;
	            // shift the sorted part to right
	            a[j] = a[j - 1];
	        }
	 
	        // insert the current element
	        a[j] = tmp;
	    }
	}
	
	public static void sortHighToLow(int[] a)
	{
		for (int i = 1; i < a.length; i++)
	    {
	        // a temporary copy of the current element
	        int tmp = a[i];
	        int j;
	 
	        // find the position for insertion
	        for (j = i; j > 0; j--)
	        {
	            if (a[j - 1] > tmp)
	                break;
	            // shift the sorted part to right
	            a[j] = a[j - 1];
	        }
	 
	        // insert the current element
	        a[j] = tmp;
	    }
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void sortLowToHigh(ArrayList<Comparable> a)
	{
		for (int i=0; i < a.size(); i++) {
	        /* Insert a[i] into the sorted sublist */
	        Comparable v = a.get(i);
	        int j;
	        for (j = i - 1; j >= 0; j--) {
	            if (a.get(j).compareTo(v) <= 0) 
	            	break;
	            a.set(j+1, a.get(j));
	        }
	        a.set(j+1, v);
	    }
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void sortHighToLow(ArrayList<Comparable> a)
	{
		for (int i=0; i < a.size(); i++) {
	        /* Insert a[i] into the sorted sublist */
	        Comparable v = a.get(i);
	        int j;
	        for (j = i - 1; j >= 0; j--) {
	            if (a.get(j).compareTo(v) > 0) 
	            	break;
	            a.set(j+1, a.get(j));
	        }
	        a.set(j+1, v);
	    }
	}

}
