/* Max Points on a Line */
/* Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane, return the maximum number of points that lie on the same straight line.

Input: points = [[1,1],[2,2],[3,3]]
Output: 3
 */


import java.util.*;

class Solution {
public static int maxPoints(int[][] points) {
    int n = points.length;
    if (n < 3) return n;
    int res = 0;
    for (int i = 0; i < n; i++) {
    Map<String, Integer> map = new HashMap<>();
    int vertical = 0, duplicate = 0;
    for (int j = i + 1; j < n; j++) {
    if (points[i][0] == points[j][0] && points[i][1] == points[j][1]) {
    duplicate++;
    } else if (points[i][0] == points[j][0]) {
    vertical++;
    } else {
    int xDiff = points[i][0] - points[j][0];
    int yDiff = points[i][1] - points[j][1];
    int gcd = gcd(xDiff, yDiff);
    xDiff /= gcd;
    yDiff /= gcd;
    String key = xDiff + "," + yDiff;
    map.put(key, map.getOrDefault(key, 0) + 1);
    }
    }
    res = Math.max(res, duplicate + 1);
    for (String key : map.keySet()) {
    res = Math.max(res, map.get(key) + duplicate + 1);
    }
    res = Math.max(res, vertical + duplicate + 1);
    }
    return res;
    }

    private static int gcd(int a, int b) {
    return (b == 0) ? a : gcd(b, a % b);
}
}
