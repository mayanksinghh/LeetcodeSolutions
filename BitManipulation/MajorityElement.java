class Solution {
    public int majorityElement(int[] nums) {

        int majorityEle = nums[0];
        int count = 1;

        for(int i =1;i<nums.length;i++){

            if(nums[i]==majorityEle){
                count++;
                majorityEle = nums[i];
            }else{
                if(count==0){
                    majorityEle = nums[i];
                    count=1;
                }else{
                    count--;
                }


            }

        }

        return majorityEle;
    }
}