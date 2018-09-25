class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new LinkedList<Integer>();
        
        if (matrix.length == 0) {
            return result;
        }
        
        int rowBegin=0;
        int colBegin=0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1; 
        
        while (rowBegin<=rowEnd && colBegin<=colEnd) {
            
            //traverse right
                for (int i=colBegin; i<=colEnd; i++) {
                    result.add(matrix[rowBegin][i]);
                }
                rowBegin++;
            //traverse down
                for (int i=rowBegin; i<= rowEnd; i++) {
                    result.add(matrix[i][colEnd]);
                }
            colEnd--;
            
            //traverse left
            if (rowBegin<=rowEnd) {
                for (int i=colEnd; i>=colBegin; i--) {
                    result.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            
            //traverse up 
            if (colEnd>=colBegin) {
                for (int i=rowEnd; i>=rowBegin; i--) {
                    result.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return result;
    }
}

