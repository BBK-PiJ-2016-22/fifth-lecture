public class Launcher{


	public static void main(String[] args){
	
		int[] myArray = {5,4,3,2,1,2,3,4,5};
		
		MatrixChecker myMatrixChecker = new MatrixChecker();
		
	 	boolean symmetrical = myMatrixChecker.isSymmetrical(myArray);
	 	
	 	if(symmetrical == true){
			
			System.out.println("It is symmetrical");
		
		}else{
			
			System.out.println("Is not symmetrical");
		
		} 
					
		
		
		
		Matrix myMatrix = new Matrix(3,3);
		
		//int[][] TwoDArray = myMatrix.twoDArray;
		
		
		
		/* first instance made with Matrix
	       int[][] TwoDArray = { { 1, 2, 3}, { 2, 4, 5},{ 3, 5, 6} }; */
		
		//myMatrix.Matrix(3,3);
		
		
		myMatrix.setRow(0, "123");
		myMatrix.setRow(1, "245");
		myMatrix.setRow(2, "356");
		
		myMatrix.prettyPrint();
		
		boolean symmetrical2 = myMatrixChecker.isSymmetrical(myMatrix.twoDArray);
		
		if(symmetrical2 == true){
			
			System.out.println("It is symmetrical");
		
		}else{
			
			System.out.println("Is not symmetrical");
		
		} 
		
		
		/* second instance made with Matrix
		   int[][] TwoDArray2 = { { 1, 2, 3}, { 0, 4, 5},{ 0, 0, 6} } */
		
		Matrix myMatrix2 = new Matrix(3,3);
				
		myMatrix2.setRow(0, "123");
		myMatrix2.setRow(1, "045");
		myMatrix2.setRow(2, "006");
		 
		myMatrix2.prettyPrint();
		
		
			
		
		boolean Triangular = myMatrixChecker.isTriangular(myMatrix2.twoDArray);
		
		if(Triangular == true){
			
			System.out.println("It is triangular");
		
		}else{
			
			System.out.println("Is not triangular");
		
		} 
		
	
	
	
	}
	
}
