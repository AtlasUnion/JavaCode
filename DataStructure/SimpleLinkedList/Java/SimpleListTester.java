
public class SimpleListTester {

	public static Integer i = new Integer(10);
	public static Integer j = new Integer(25);
	public static Integer k = new Integer(50);
	public static Integer l = new Integer(100);
	
	public static void testList()
	{
		System.out.println("Testing SimpleList...");
		SimpleList sl = new SimpleList();
		
		sl.add(i);
		sl.add(j);
		sl.add(l);
		sl.add(k);
		
		sl.dump();
		
		System.out.println("Getting 2, should be 100, is: " + sl.get(2).toString());
		System.out.println("Getting 3, should be 50, is: " + sl.get(3).toString());
		System.out.println("Getting 0, should be 10, is: " + sl.get(0).toString());
		System.out.println("Getting 1, should be 25, is: " + sl.get(1).toString());
		if (sl.get(5) == null)
			System.out.println("Getting 5, is correctly null.");
		if (sl.get(100) == null)
			System.out.println("Getting 100, is correctly null.");
		
		System.out.println("Removing 1, should be 25, is: " + sl.remove(1).toString());
		sl.dump();
		System.out.println("Removing 2, should be 50, is: " + sl.remove(2).toString());
		sl.dump();
		
		System.out.println("Removing 0, should be 10, is: " + sl.remove(0).toString());
		sl.dump();
		System.out.println("Removing 0, should be 100, is: " + sl.remove(0).toString());
		sl.dump();
		if (sl.get(0) == null)
			System.out.println("Getting 0, is correctly null.");
		if (sl.remove(0) == null)
			System.out.println("Removing 0, is correctly null.");
		
		System.out.println();
		System.out.println();
	}
	
	
	public static void testStack()
	{
		System.out.println("Testing SimpleStack...");
		SimpleStack st = new SimpleStack();
		
		st.push(i);
		st.push(j);
		st.dump();
		st.add(l);
		st.push(k);
		
		st.dump();
		
		System.out.println("Getting 0, should be 50, is: " + st.get(0).toString());
		System.out.println("Getting 1, should be 100, is: " + st.get(1).toString());
		System.out.println("Getting 2, should be 25, is: " + st.get(2).toString());
		System.out.println("Getting 3, should be 10, is: " + st.get(3).toString());
		if (st.get(5) == null)
			System.out.println("Getting 5, is correctly null.");
		if (st.get(100) == null)
			System.out.println("Getting 100, is correctly null.");
		
		System.out.println("Poppinh, should be 50, is: " + st.pop().toString());
		st.dump();
		System.out.println("Removing 2, should be 100, is: " + st.remove(2).toString());
		st.dump();
		
		System.out.println("Popping, should be 25, is: " + st.pop().toString());
		st.dump();
		System.out.println("Removing 0, should be 10, is: " + st.remove(0).toString());
		st.dump();

		if (st.get(0) == null)
			System.out.println("Getting 0, is correctly null.");
		if (st.remove(0) == null)
			System.out.println("Removing 0, is correctly null.");
		
		System.out.println();
		System.out.println();
	}
	
	public static void testQueue()
	{
		System.out.println("Testing SimpleQueue...");
		SimpleQueue st = new SimpleQueue();
		
		st.enqueue(i);
		st.enqueue(j);
		st.dump();
		st.add(l);
		st.enqueue(k);
		
		st.dump();
		
		System.out.println("Getting 0, should be 10, is: " + st.get(0).toString());
		System.out.println("Getting 1, should be 25, is: " + st.get(1).toString());
		System.out.println("Getting 2, should be 100, is: " + st.get(2).toString());
		System.out.println("Getting 3, should be 50, is: " + st.get(3).toString());
		if (st.get(5) == null)
			System.out.println("Getting 5, is correctly null.");
		if (st.get(100) == null)
			System.out.println("Getting 100, is correctly null.");
		
		System.out.println("Dequeueing, should be 10, is: " + st.dequeue().toString());
		st.dump();
		System.out.println("Removing 2, should be 25, is: " + st.remove(2).toString());
		st.dump();
		
		System.out.println("Dequeueing, should be 100, is: " + st.dequeue().toString());
		st.dump();
		System.out.println("Removing 0, should be 50, is: " + st.remove(0).toString());
		st.dump();

		if (st.get(0) == null)
			System.out.println("Getting 0, is correctly null.");
		if (st.remove(0) == null)
			System.out.println("Removing 0, is correctly null.");
		
		System.out.println();
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		testList();
		testStack();
		testQueue();
	}

}
