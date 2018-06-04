class SingleNumber {
    public int singleNumber(int[] nums) {
     for(int i=0; i<nums.length-1; i++){
         for(int j=i+1; j<nums.length; j++){
             if(nums[i]==nums[j]){
                 nums[i]=0;
                 nums[j]=0;
             }
         }
    }
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[0]= nums[i];
            }
        }
        return nums[0];
}
}