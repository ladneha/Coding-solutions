class SearchInRotatedSortedArray {
    public boolean search(int[] nums, int target) {
      HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        return hs.contains(target);
    }
}
// when you need to return index and array has no duplicates
class Solution {
    public int search(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], i);
        }
        if(hm.containsKey(target)){
            return hm.get(target);
        }
        return -1;
    }
}