class Solution {
    public int[] countBits(int n) {

        int[] res = new int[n+1];

        for(int i =0;i<=n;i++){

            int numOfOnes = 0;

            for(int j=0;j<32;j++){

                if((i&(1<<j))==1<<j){

                    numOfOnes++;

                }



            }

            res[i] = numOfOnes;

        }

        return res;

    }
}