import java.util.ArrayList;

public class SelectionSort {
	
	public static void sortLowToHigh(int[] a)
	{
		for (int i = 0; i < a.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[index])
                    index = j;
      
            int smallerNumber = a[index]; 
            a[index] = a[i];
            a[i] = smallerNumber;
        }
	}
	
	public static void sortHighToLow(int[] a)
	{

		for (int i = 0; i < a.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] > a[index])
                    index = j;
      
            int smallerNumber = a[index]; 
            a[index] = a[i];
            a[i] = smallerNumber;
        }
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void sortLowToHigh(ArrayList<Comparable> a)
	{
		int min;
	      Comparable temp;

	      for (int index = 0; index < a.size(); index++)
	      {
	         min = index;
	         for (int scan = index+1; scan < a.size(); scan++)
	            if (a.get(scan).compareTo(a.get(min)) < 0)
	               min = scan;

	         // Swap the values
	         temp = a.get(min);
	         a.set(min, a.get(index));
	         a.set(index, temp);
	      }
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void sortHighToLow(ArrayList<Comparable> a)
	{
		int max;
	      Comparable temp;

	      for (int index = 0; index < a.size(); index++)
	      {
	         max = index;
	         for (int scan = index+1; scan < a.size(); scan++)
	            if (a.get(scan).compareTo(a.get(max)) > 0)
	               max = scan;

	         // Swap the values
	         temp = a.get(max);
	         a.set(max, a.get(index));
	         a.set(index, temp);
	      }
	}


}
