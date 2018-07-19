class SearchInRotatedSortedArray {
    public boolean search(int[] nums, int target) {
      HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        return hs.contains(target);
    }
}