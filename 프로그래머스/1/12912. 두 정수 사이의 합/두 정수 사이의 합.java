import java.util.*;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        int[] ints = new int[]{a, b};

        Arrays.sort(ints);

        for(int i=ints[0]; i<=ints[1]; i++) {
            answer += i;
        }

        return answer;
    }
}