class Solution {
    public int majorityElement(int[] nums) {

        //Much faster approach
        
//         int majorityEle = nums[0];
//         int count = 1;
        
//         for(int i =1;i<nums.length;i++){
            
//             if(nums[i]==majorityEle){
//                 count++;
//                 majorityEle = nums[i];
//             }else{
//                 if(count==0){
//                     majorityEle = nums[i];
//                     count=1;
//                 }else{
//                     count--;
//                 }
                
                
//             }
            
//         }
        
//         return majorityEle;
        
        int res = 0;
        for(int i=0;i<32;i++){
            
            int numOfOnes = 0;
            
            for(int j =0;j<nums.length;j++){
                
                if((nums[j]&(1<<i))==(1<<i)){
                    
                    numOfOnes++;
                    
                }
                
            }
            
            if(numOfOnes>nums.length/2){
                res |=(1<<i);
            }
            
        }
        return res;
    }
}