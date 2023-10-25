import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> integerList = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i]; j++)
            integerList.add(arr[i]);
        }

        int[] answer = integerList.stream()
                      .mapToInt(Integer::intValue)
                      .toArray();

        return answer;
    }
}