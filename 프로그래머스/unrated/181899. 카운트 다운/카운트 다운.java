import java.util.*;

class Solution {
    public int[] solution(int start, int end_num) {
        List<Integer> integerList = new ArrayList<>();

        for(int i=start; i>=end_num; i--) {
            integerList.add(i);
        }

        int[] answer = integerList.stream()
                .mapToInt(Integer :: intValue)
                .toArray();


        return answer;
    }
}