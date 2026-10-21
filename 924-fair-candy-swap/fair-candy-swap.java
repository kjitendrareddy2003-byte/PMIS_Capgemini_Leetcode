class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0;
        int sumBob = 0;

        for (int candy : aliceSizes) {
            sumAlice += candy;
        }

        for (int candy : bobSizes) {
            sumBob += candy;
        }

        int diff = (sumAlice - sumBob) / 2;

        for (int alice : aliceSizes) {
            for (int bob : bobSizes) {
                if (alice - bob == diff) {
                    return new int[]{alice, bob};
                }
            }
        }

        return new int[0];
    }
}       