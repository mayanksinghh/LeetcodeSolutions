class Solution {
    public int singleNumber(int[] nums) {

        int count =0;
        int res = 0;

        for(int i=0;i<32;i++){

            count = 0;

            for(int j = 0;j<nums.length;j++){

                if((nums[j]&(1<<i))==(1<<i)){

                    count ++;

                }

            }
            if(count%3!=0){
                res |= 1<<i;
            }

        }

        return res;

    }
}