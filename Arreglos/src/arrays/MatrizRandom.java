package arrays;

public class MatrizRandom {
	//======================== Attributes
	//For rows and columns
	private int matrixRows =0;
	private int matrixColumns=0;
	
	//======================== Constructor Method
	public MatrizRandom(){
		this.matrixRows=3;
		this.matrixColumns=3;
		createMatrix(this.matrixRows,this.matrixColumns);		
	}
	//======================== Methods
	public static void createMatrix(int matrixRows, int matrixColumns) {
		int matrix [][]=new int [matrixRows] [matrixColumns];
		
		//We create a n x m matrix with random values
		
		for(int j=0;j<matrixRows;j++) {
			for(int i=0;i<matrixColumns;i++) {
				//We use Math.random to get random numbers
				int randomValue=(int)(Math.random()*100);
				matrix[i][j]=randomValue;
				
			}
		}
		
		getMatrixInfo(matrix,matrixRows,matrixColumns);
	
	}//Method CreateMatrix
	
	
	public static void getMatrixInfo(int [][] matrix, int matrixRows, int matrixColumns) {
		System.out.println("La matriz que se generó es: ");
		for(int j=0; j<matrixRows;j++) {
			for(int i=0;i<matrixColumns;i++) {
				System.out.println(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	} //Method getMatrixInfo

}// Class
