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
	
	
	public boolean isSymmetrical(int[][] TwoDArray){
		
		boolean flag = true;
		
		for(int i = 0; i < TwoDArray.length; i++){			
			// m[i][j] == m[j][i]
	
			for(int k = 0; k < TwoDArray[0].length; k++){
			
				if (TwoDArray[i][k] != TwoDArray[k][i]){
					
					flag = false; 
				} 	
			}	
		}
	
		return flag;
	
	}
	
	public boolean isTriangular(int[][] TwoDArray){
	
		boolean flag = true;
		
		for(int i = 0; i < TwoDArray.length; i++){			
			
			//if m[i][j] == 0 for any value of i > j
			
			for(int j = 0; j < TwoDArray[0].length; j++){
			
				if (TwoDArray[i][j] != 0 && i > j){
					
					flag = false;
					 
				} 	
			}		
		}
	
		return flag;
	}
	
	
	
	
	
	
	











}