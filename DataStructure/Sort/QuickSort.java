import java.util.ArrayList;

public class QuickSort 
{
	public static void sortLowToHigh(int[] a)
	{
		quickIntSort(a,0,a.length-1);
	}
	
	public static void quickIntSort(int[] a, int start, int end)
	{
		int i = start, j = end;
	    // Get the pivot element from the middle of the list
	    int pivot = a[start + (end-start)/2];

	    // Divide into two lists
	    while (i <= j) {
	      while (a[i] < pivot) {
	        i++;
	      }
	
	      while (a[j] > pivot) {
	        j--;
	      }

	      if (i <= j) {
	    	  int temp = a[i];
	    	    a[i] = a[j];
	    	    a[j] = temp;
	        i++;
	        j--;
	      }
	    }
	    // Recursion
	    if (start < j)
	      quickIntSort(a,start, j);
	    if (i < end)
	      quickIntSort(a,i, end);
	}
	
	
	@SuppressWarnings("rawtypes")
	public static void sortLowToHigh(ArrayList<Comparable> a)
	{
		// This method calls a recursive helper method
		quickArrayListSort(a,0,a.size()-1);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void quickArrayListSort(ArrayList<Comparable> a, int start, int end)
	{
		// This is the recursive method for ArrayLists
		int i = start, j = end;
	    // Get the pivot element from the middle of the list
	    Comparable pivot = a.get(start + (end-start)/2);

	    // Divide into two lists
	    while (i <= j) {
	      while (a.get(i).compareTo(pivot)<0) {
	        i++;
	      }
	
	      while ((a.get(j).compareTo(pivot)>0)) {
	        j--;
	      }

	      if (i <= j) {
	    	  Comparable temp = a.get(i);
	    	    a.set(i, a.get(j));
	    	    a.set(j, temp);
	        i++;
	        j--;
	      }
	    }
	    // Recursion
	    if (start < j)
	    	quickArrayListSort(a,start, j);
	    if (i < end)
	    	quickArrayListSort(a,i, end);
		
	}
}
	
	
	