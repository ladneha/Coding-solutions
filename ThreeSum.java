class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
      Set<List<Integer>> l1 = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    l1.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }else if(sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                }
            }
        }
        return new ArrayList<>(l1);
    }
}