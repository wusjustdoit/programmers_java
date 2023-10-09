import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> integerList = new ArrayList<>();

        for(int i=0; i<num_list.length; i++) {
            if(i%n == 0)
                integerList.add(num_list[i]);
        }

        int[] answer = Arrays.stream(integerList.toArray(new Integer[0])).mapToInt(i ->i).toArray();

        return answer;
    }
}