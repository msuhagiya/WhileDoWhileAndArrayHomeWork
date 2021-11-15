//Write 2d array and then transpose a matrix
public class TransposeAMatrixOfTwoDArray {
    public static void main(String[] args) {
        //declared 2D array
        int arr [][] = {{10,20,30},{20,30,40},{30,40,50}};
        System.out.println("Printing original array: ");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(arr[i][j] + " ");//printing original array
            }
            System.out.println();
        }
        System.out.println("Printing after transpose matrix: ");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(arr[j][i] + " ");//printing transpose matrix
            }
            System.out.println();
        }
    }
}
