package practices;
public class MatrixTraversal {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
            for (int i = 0; i < matrix.length; i++)
            {
                // length returns number of rows
                System.out.print("row " + i + " : ");
                for (int j = 0; j < matrix[i].length; j++)
                {
                    // here length returns # of columns corresponding to current row
                    System.out.print("col " + j + "  ");
                }
                System.out.println();
            }
        }
    }


