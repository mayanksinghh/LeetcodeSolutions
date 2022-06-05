class Solution {
    public int rangeBitwiseAnd(int left, int right) {

        int x = left;
        int y = right;
        int count =0;

        while(x!=y){

            x>>=1;
            y>>=1;

            count++;

        }

        return x<<count;
    }
}