
public class SimpleQueue extends SimpleList {

	public SimpleQueue() {
		super();
	}
	
	public Object dequeue(){
		if(head.getNext()!=tail){			
			return super.remove(0); // Remove the first element
		}
		return null;
	}
	
	public int enqueue(Object obj){
		return super.add(obj); // add object to the last index
	}
	
	 @Override
	public int add(Object obj) {
		return enqueue(obj);
	}
	 
	 @Override
	public Object remove(int index) {
		return dequeue();
	}

}
