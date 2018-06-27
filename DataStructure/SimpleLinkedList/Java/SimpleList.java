
public class SimpleList{
	protected SimpleListNode head = new SimpleListNode();
	protected SimpleListNode tail = new SimpleListNode();

	public SimpleList() {
		head.setPrev(null); //Initializing the data
		tail.setNext(null);
		
		head.setNext(tail); //As we initializing the list, the thing after heqd is tail and the thing before 
		tail.setPrev(head); // tail is head
		
	}

	public int add(Object obj) {
		SimpleListNode newNode = new SimpleListNode(obj);
		SimpleListNode tailNode = tail.getPrev();
		
		if(tailNode != null){
			tailNode.setNext(newNode);  // Make tail point to the last element which we want to add
			newNode.setPrev(tailNode);  // Make node we want to add point to the one element
			newNode.setNext(tail);      // before it and one element after it which should be tail
			tail.setPrev(newNode);
			return 0;
		}
		return -1;

	}

	public Object get(int index) {
		int currentIndex = 0;  //The index of list all start from 0
		SimpleListNode currentNode = head.getNext();  
		
		while(currentNode!=tail){   // make sure we have at least one element in list then get out of loop
			if(currentIndex==index)
				break;
			else {
				currentIndex++;     // otherwise we need to let Index do self-increment 
				currentNode=currentNode.getNext();// and make currentNode get the object after it by using
			}									 // pointers
		}
		
		if(currentNode != tail){    // make sure the node we try to get is at the specific index and 
			return currentNode.getObj();// not the last index which is the tail that has no data in it
		}
		return null;
	}

	public Object remove(int index) {
		int currentIndex=0;
		SimpleListNode currentNode=head.getNext();
		
		while(currentNode!=tail){
			if(currentIndex==index)
				break;
			else {
				currentIndex++;
				currentNode=currentNode.getNext();
			}
		}	
		
		if(currentNode!=tail){
			currentNode.getPrev().setNext(currentNode.getNext()); //Redirect the pointers so after we remove
			currentNode.getNext().setPrev(currentNode.getPrev()); //the object there won't be error
			
			currentNode.setPrev(null); // Redirect the pointers of the currentNode that make them point
			currentNode.setNext(null); // to nothing so in some ways we remove them because we can't find
			return currentNode.getObj();// them in the list any more			
		}
		return null;
	}

	public void dump() {
		SimpleListNode currentNode = head.getNext();
		
		while(currentNode != tail){
			System.out.println("The Items in the list are" + currentNode.getObj().toString());//System.out.prinln can only output string
			currentNode = currentNode.getNext();
		}

	}
}
