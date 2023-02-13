/* Given an integer numRows, return the first numRows of Pascal's triangle. 
Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                temp.add((j == 0 || j == i) ? 1 : (result.get(i - 1).get(j -1) + result.get(i - 1).get(j)));
            }
            result.add(temp);
        }
        return result;
    }
}
