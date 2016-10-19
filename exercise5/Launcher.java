public class Launcher{


	public static void main(String[] args){
	
		int[] myArray = {5,4,3,2,1,2,3,4,5};
		
		MatrixChecker myMatrixChecker = new MatrixChecker();
		
	 	System.out.println(myMatrixChecker.isSymmetrical(myArray));
					
		
		
		
		Matrix myMatrix = new Matrix();
		
		int[][] TwoDArray = myMatrix.twoDArray;
		
		
		
		
		
		myMatrix.Matrix(3,3);
		
		//myMatrix.setRow(0, "123");
		//myMatrix.setRow(1, "245");
		//myMatrix.setRow(2, "356");
		
		myMatrix.prettyPrint();
		
		Helper myHelper = new Helper();
		
		myHelper.printer(TwoDArray);
		
		
	
		//int[][] TwoDArray = { { 1, 2, 3}, { 2, 4, 5},{ 3, 5, 6} };
		
		//System.out.println(myMatrixChecker.isSymmetrical(TwoDArray));
		
		
		
		
		
		int[][] TwoDArray2 = { { 1, 2, 3}, { 0, 4, 5},
							 { 0, 0, 6} };
			
		System.out.println(myMatrixChecker.isTriangular(TwoDArray2));
	
	
	
	}
	
}
