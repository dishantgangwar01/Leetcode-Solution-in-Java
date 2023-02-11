/* You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.
Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int endOne = m - 1;
        int endTwo = n - 1;
        int curr = m + n - 1;
        while(endOne >= 0 || endTwo >= 0){
            if(endOne >= 0 && endTwo >= 0) {
                if(nums1[endOne] > nums2[endTwo]){
                    nums1[curr--] = nums1[endOne--];
                }
                else {
                    nums1[curr--] = nums2[endTwo--];
                }
            }
                else if(endOne >= 0 && endTwo < 0){
                    nums1[curr--] = nums1[endOne--];
                }
                else {
                    nums1[curr--] = nums2[endTwo--];
                }
            
        }
    }
}

