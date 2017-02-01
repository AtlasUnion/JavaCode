import java.util.ArrayList;


public class MergeSort {
	
	public static void sortLowToHigh(int[] a)
	{
		int[] temp = new int[a.length];
		mergeSortHelper1(a, 0, a.length-1, temp);
	}
	
	public static void mergeSortHelper1(int[] a, int from, int to, int[] temp)
	{
		if(from < to){
			int center = (from+to)/2;
			mergeSortHelper1(a, from, center, temp);
			mergeSortHelper1(a, center+1, to, temp);
			merge(a, from, center+1, to, temp);
		}
	}
	
	private static void merge(int[] a, int from, int middle, int to, int[] temp)
	{
		int leftEnd = middle - 1;
        int k = from;
        int num = to - from + 1;

        while(from <= leftEnd && middle <= to)
            if(a[from]<=(a[middle]))
                temp[k++] = a[from++];
            else
                temp[k++] = a[middle++];

        while(from <= leftEnd)    // Copy rest of first half
            temp[k++] = a[from++];

        while(middle <= to)  // Copy rest of right half
            temp[k++] = a[middle++];

        // Copy tmp back
        for(int i = 0; i < num; i++, to--)
            a[to] = temp[to];
	}
	
	@SuppressWarnings("rawtypes")
	public static void sortLowToHigh(ArrayList<Comparable> a)
	{

		mergeSortHelper(a, 0, a.size()-1, copyArray(a));
	}
	
	@SuppressWarnings("rawtypes")
	private static ArrayList<Comparable> copyArray(ArrayList<Comparable> a)
	{	
		ArrayList<Comparable> temp = new ArrayList<Comparable>();
		for(int i = 0;i<a.size();i++){
			temp.add(i, a.get(i));
		}
		return temp;
	}
	
	@SuppressWarnings("rawtypes")
	public static void mergeSortHelper(ArrayList<Comparable> a, int from, int to,ArrayList<Comparable> b)
	{
		if( from < to )
		{
			int center = (from + to) / 2;
			mergeSortHelper(a, from, center, b);
			mergeSortHelper(a, center+1,to, b);
			merge(a, from, center+1, to, b);
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void merge(ArrayList<Comparable> a, int from, int middle, int to, ArrayList<Comparable> temp)
	{
		int leftEnd = middle - 1;
        int k = from;
        int num = to - from + 1;

        while(from <= leftEnd && middle <= to)
            if(a.get(from).compareTo(a.get(middle)) <= 0)
                temp.set(k++, a.get(from++));
            else
            	temp.set(k++, a.get(middle++));

        while(from <= leftEnd)    // Copy rest of first half
        	temp.set(k++, a.get(from++));

        while(middle <= to)  // Copy rest of right half
        	temp.set(k++, a.get(middle++));

        // Copy tmp back
        for(int i = 0; i < num; i++, to--)
        a.set(to, temp.get(to));

}
}
