class Solution {
    public int[] decode(int[] encoded) {

        int totalXor = 0;
        int first = 0;
        int evenXor = 0;
        int res[] = new int[encoded.length+1];

        for(int i=1;i<=encoded.length;i++){

            totalXor ^= i;

        }

        for(int i=1; i<encoded.length; i=i+2){

            evenXor ^= encoded[i];

        }

        first = evenXor ^ totalXor ^ (encoded.length+1);

        res[0] = first;

        for(int i=1;i<=encoded.length;i++){

            res[i] = res[i-1]^encoded[i-1];

        }

        return res;

    }
}