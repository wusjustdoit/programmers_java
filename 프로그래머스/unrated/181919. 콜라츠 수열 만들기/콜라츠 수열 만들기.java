import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> arrInt = new ArrayList<>();

        while(true) {
            if(n != 1) {
                arrInt.add(n);
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
            } else {
                arrInt.add(n);
                break;
            }
        }

        int[] answer = Arrays.stream(arrInt.toArray(new Integer[arrInt.size()])).mapToInt(i->i).toArray() ;

        return answer;
    }
}