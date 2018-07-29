/*
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:
What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
*/
class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1==null || nums2==null){
            return new int[0];
        }
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> result = new ArrayList<Integer>();
        int ind1=0, ind2=0;
        while(ind1<nums1.length && ind2<nums2.length){
            if(nums1[ind1] == nums2[ind2]){
                result.add(nums1[ind1]);
                ind1++;
                ind2++;
            }else if(nums1[ind1]<nums2[ind2]){
                ind1++;
            }else{
                ind2++;
            }
        }
        
        int[] res = new int[result.size()];
        for(int i=0; i<res.length; i++){
            res[i]=result.get(i);
        }
        return res;
    }
}