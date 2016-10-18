public class MatrixChecker{



	public boolean isSymmetrical(int[] myArray){
		
		boolean flag = true;
			
		for(int i = 0; i < myArray.length; i++){	
		
			// [0] == [length - 1]
			// [1] == [length -2]	
			
			if(myArray[i] != myArray[myArray.length -1 - i]){
			
				flag = false;
			
			}
		}
		
		return flag;
	
	}
	











}