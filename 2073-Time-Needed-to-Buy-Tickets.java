class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int sec = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                sec += Math.min(tickets[i], tickets[k]);
            } else {
                sec += Math.min(tickets[i], tickets[k] - 1);
            }
        }

        return sec;
    }
}