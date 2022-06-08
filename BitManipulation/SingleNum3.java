public class Solution {
    public int[] singleNumber(int[] nums) {

        int xor = 0;
        for(int num: nums){
            xor^=num;
        }

        //find rightmost set bit of xor to obtain mask
        int rightIndex = 0;

        //My approach to find rightmost set bit mask(Slower)
        // for(int i=0;i<32;i++){
        //     if((xor & (1<<i)) == (1<<i)){
        //         rightIndex = i;
        //         break;
        //     }
        // }
        // int mask = 1<<rightIndex;

        //Twice faster approach to find rightmost set bit mask
        int mask = xor & ~(xor-1);

        int num1 = 0;
        int num2 = 0;

        //divide num of array in 2 sets and xor each set to get numbers

        for(int num : nums){

            if((num&mask)==0){

                num1 ^= num;

            }else{
                num2 ^= num;
            }

        }

        int[] res = new int[2];
        res[0] = num1;
        res[1] = num2;

        return res;
    }
}