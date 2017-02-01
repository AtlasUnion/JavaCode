
public class SimpleStack extends SimpleList {
	
	//Default Constructor
	public SimpleStack() {
		super();
	}
	
	public Object pop(){
		if(tail.getPrev()!=head)
		{			
			return super.remove(0); //remove top and return
		}
		return null;
	}
	
	public int push(Object obj){
		return super.add(obj);  // Push object onto the top of stack means insert it to the last index
	}
	
	@Override
	public Object remove(int index) { // index is not important because no matter what we will get the top element 
		return pop();
	}
	
	@Override
	public int add(Object obj) {
		
		return push(obj);
	}
	

}
