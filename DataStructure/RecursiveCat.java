
public class RecursiveCat {
	
	public String[] letters;

	public RecursiveCat() {
		letters = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	}
	
	public String CatList(int index){
		if(index > 25){
			return "";            
		}
		else{
			return letters[index] + CatList(index+1);
			
		}
		
	}

}
