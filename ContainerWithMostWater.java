class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int res, max=0, high=height.length-1, low=0 ;
        while(low<high){
                //res = (j-i)*Math.min(height[i-1], height[j-1]);
                max = Math.max(max, (high-low)*Math.min(height[low], height[high]));
                if(height[low]<height[high]){
                    low++;
                }else{
                    high--;
                }
            }
        return max;
    }
}