/**
 * Problem: Longest Consecutive Sequence
 *
 * Solution approach:
 * [Add your explanation here]
 */

class Solution {     public int longestConsecutive(int[] nums) {         HashMap<Integer, Boolean> hmap = new HashMap<>();         for (int n : nums) {             hmap.put(n, Boolean.FALSE);         }          int longestc = 0;          for (int num : nums) {             int currentc = 1;              int number = num + 1;             while (hmap.containsKey(number) && hmap.get(number) == false) {                 currentc++;                 hmap.put(number, Boolean.TRUE);                 number++;             }              int rev_num = num - 1;             while (hmap.containsKey(rev_num) && hmap.get(rev_num) == false) {                 currentc++;                 hmap.put(rev_num, Boolean.TRUE);                 rev_num--;             }              longestc = Math.max(longestc, currentc);         }         return longestc;      } }