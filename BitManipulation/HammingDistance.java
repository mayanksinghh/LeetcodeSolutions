class Solution {
    public int hammingDistance(int x, int y) {

        int z = x^y;
        int count =0;

        for(int i=0;i<32;i++){

            if((z&(1<<i))==(1<<i)){

                count++;

            }
        }

        return count;

    }
}