
public class SimpleListNode 
{
	private Object obj;
	private SimpleListNode next;
	private SimpleListNode prev;

	SimpleListNode()
	{
		obj = null;
		next = null;
		prev = null;
	}
	
	SimpleListNode(Object obj)
	{
		this.obj = obj;
		next = null;
		prev = null;
	}
	
	public SimpleListNode getNext()
	{
		return next;
	}
	
	public SimpleListNode getPrev()
	{
		return prev;
	}
	
	public Object getObj()
	{
		return obj;
	}
	
	public void setNext(SimpleListNode n)
	{
		next = n;
	}
	
	public void setPrev(SimpleListNode p)
	{
		prev = p;
	}
}
