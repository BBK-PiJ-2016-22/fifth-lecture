public class ArrayCopier{
	
	public static void main(String[] args){
	
		ArrayCopier myInstance = new ArrayCopier();
		myInstance.launch();
	

	}

	
	// launch method

	public void launch(){
		
		// instance one
		int[] myArray = {1,2,3,4,5,6,7,8,9,10};
		
		int[] myArray2 = new int[20];
		
		copy(myArray, myArray2);
		
		printArray(myArray2);
		
		
		// instance two
		
		int[] myArray3 = {1,2,3,4,5,6,7,8,9,10,11};
		
		int[] myArray4 = new int[myArray3.length];
		
		copy(myArray3, myArray4);
		
		printArray(myArray4);
		
		
		
	

	}
	// print method for arrays
	
	public void printArray(int[] myArray){
		
		for(int i = 0; i < myArray.length; i++){
			
			
		System.out.print(myArray[i]);
			
			
		}
		
	 	
		
	}
	
	//
	
	
	public void copy(int[] src, int[] dst){
		
		for(int i = 0; i < src.length; i++){
			
			
			dst[i] = src[i];
			
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

