/* In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

 

Example 1:


Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]
*/
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int numOfElem = nums.length*nums[0].length;
        if(numOfElem != r*c){
            return nums;
        }
        int [] expandArray = new int[numOfElem];
        int k = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j< nums[i].length; j++){
                expandArray[k] = nums[i][j];
                k++;
            }
        }
        int [][] ans = new int[r][c];
        int i = 0;
        int j = 0;
        for(k = 0; k<numOfElem; k++){
            ans[i][j] = expandArray[k];
            j++;
            if(j == c){
                j = 0;
                i++;
            }
        }
        return ans;
    }
}
