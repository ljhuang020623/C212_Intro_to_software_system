public class Matrix {
    private int[][] matrix ;
    public int getRows(){
        return this.matrix.length;
    }
    public int getColumns(){
        return this.matrix[0].length;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public Matrix(int m, int n, int[][] initialArray){
        matrix = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = initialArray[i][j];
            }
        }
    }
    public void set(int i, int j, int val){
        if(i > this.matrix.length || i < 0 || j > this.matrix[0].length || j < 0){
            return;
        }
        this.matrix[i][j] = val;
    }

    public void add(Matrix m){
        if (m.matrix.length == 0 || m.matrix[0].length == 0) {
            System.out.println("Matrix is empty or not initialized properly. Cannot perform transpose.");
            return;
        }
        if(this.matrix.length != m.matrix.length || this.matrix[0].length != m.matrix[0].length){
            return;
        }
        for(int i = 0; i < this.matrix.length; i++){
            for(int j = 0; j < this.matrix[0].length ; j++){
                this.matrix[i][j] += m.matrix[i][j];
            }
        }
    }
    public void multiply(Matrix m){
        if (matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Matrix is empty or not initialized properly. Cannot perform transpose.");
            return;
        }
//        if(this.matrix[0].length != m.matrix.length){
//            return;
//        }

        if(this.getColumns() != m.getRows()){
            return;
        }

        int[][] result = new int[this.matrix.length][m.matrix[0].length];

        for(int i = 0; i < this.matrix.length; i++){
            for(int j = 0; j < m.matrix[0].length ; j++) {
                result[i][j] = 0;
                for(int k = 0; k < m.matrix.length; k ++){
                    result[i][j] += this.matrix[i][k] * m.matrix[k][j];
                }
            }
        }

        // Replace the original matrix
        this.matrix = result;
    }
    public void transpose(){
        if (matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Matrix is empty or not initialized properly. Cannot perform transpose.");
            return;
        }
        else{
            int [][] newMatrix = new int[this.matrix[0].length][this.matrix.length];
            for(int i = 0; i < this.matrix[0].length ; i++){
                for(int j = 0; j < this.matrix.length; j++){
                    newMatrix[i][j] = this.matrix[j][i];
                }
            }
            this.matrix = newMatrix;
        }
    }
    public void rotate(){

        if (matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("The matrix is empty or improperly initialized.");
            return;
        }else{
            // Step 1: transpose matrix
            int [][] newMatrix = new int[this.matrix[0].length][this.matrix.length];
            for(int i = 0; i < this.matrix[0].length ; i++){
                for(int j = 0; j < this.matrix.length; j++){
                    newMatrix[i][j] = this.matrix[j][i];
                }
            }
            this.matrix = newMatrix;

            // Step 2: reverse the row
            for(int m = 0; m < newMatrix.length; m++){
                int start = 0;
                int end = newMatrix[m].length - 1;
                while (start < end) {
                    int temp = newMatrix[m][start];
                    newMatrix[m][start] = newMatrix[m][end];
                    newMatrix[m][end] = temp;
                    start++;
                    end--;
                }
            }
            this.matrix = newMatrix;
        }
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        for (int[] row : matrix) {
            for (int cell : row) {
                builder.append(cell).append("\t"); // Appending each cell followed by a tab
            }
            builder.append("\n"); // New line after each row
        }
        return builder.toString();
    }
}
