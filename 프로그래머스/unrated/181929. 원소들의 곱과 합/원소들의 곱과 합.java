class Solution {
    public int solution(int[] num_list) {
        int num1 = 1;
        int num2 = 0;

        for(int a : num_list) {
            num1 *= a;
            num2 += a;
        }

        return num1 < Math.pow(num2, 2) ? 1 : 0;
    }
}