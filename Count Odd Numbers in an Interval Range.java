/* Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).

 

Example 1:

Input: low = 3, high = 7
Output: 3
Explanation: The odd numbers between 3 and 7 are [3,5,7].

*/



class Solution {
  public int countOdds(int low, int high) {
    return (high - low) / 2 + (low % 2 != 0 || high % 2 != 0 ? 1 : 0);
  }
}
