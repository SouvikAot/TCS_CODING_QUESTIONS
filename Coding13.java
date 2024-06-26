import java.util.Scanner;

/*A parking lot in a mall has RxC number of parking spaces. Each parking space will either be  empty(0) or full(1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find index of the prpeinzta row(R) in the parking lot that has the most of the parking spaces full(1).

Note :
RxC- Size of the matrix
Elements of the matrix M should be only 0 or 1.

Example 1:
Input :
3   -> Value of R(row)
3    -> value of C(column)
[0 1 0 1 1 0 1 1 1] -> Elements of the array M[R][C] where each element is separated by new line.
Output :
3  -> Row 3 has maximum number of 1’s*/
public class Coding13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ROW");
        int row = sc.nextInt();
        System.out.println("ENTER COLUMN");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("ENTER MATRIX");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int max=0,r=0;
        for(int i=0;i<row;i++){
            int count=0;
            for(int j=0;j<col;j++){
                if(matrix[i][j]==1){
                    count++;
                }
                if(max<count){
                    max=count;
                    r=i;
                }
            }
        }
        System.out.println("MAX NUMBER OF 1 PRESENT:"+(r+1));

    }
}
