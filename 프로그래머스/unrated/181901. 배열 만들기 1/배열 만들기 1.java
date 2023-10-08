class Solution {
    public int[] solution(int n, int k) {
        int[] result = new int[(n/k)];
        int idx = 0;

        for(int i=1; i<=n; i++) {
            if(i%k == 0) {
                result[idx] = i;
                idx += 1;
            }
        }
        return result;
    }
}