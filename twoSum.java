public class twoSum {
    public int[] two_Sum(int[] nums, int target) {
        
        int len, i;
        int sol[] = new int[2];
        
        len = nums.length;
        for(i=0; i<len;i++)
        {
            for(int j=i+1; j<len; j++){
                if((nums[i]+nums[j])==target){
                  sol[0]=i;
                  sol[1]=j;
                }
            }
        }
        return sol;
        
    }
}