// Intuition- so here we need to find 2 numbers from an array whose product shoould be equal to the target.
//In order to do so we can either do it in O(n^2) using two for loops or we can do some work previously so that we can do it in O(n) complexity.
// That work here is that we will use a HashMap which will have all the numbers of the array and simultaneously we subtract the arr[i] from target which will basically
// give us the second number that is to be found in the array and hashmap helps us with that.
// lookup in the hashmap is O(1) complexity in java and doing it n number of time(size of the array) will give us O(n) complexity.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            
            if (prevMap.containsKey(nums[i])) {
                return new int[]{prevMap.get(num), i};
            }
            
            prevMap.put(target - num, i);
        }
        
        return new int[]{};
    }
}
