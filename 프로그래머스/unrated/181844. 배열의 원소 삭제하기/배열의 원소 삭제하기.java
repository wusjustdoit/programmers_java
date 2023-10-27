import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        for(int i=0; i<arr.length; i++) {
            for(int j : delete_list) {
                if(arr[i] == j)
                    arr[i] = 0;
            }
        }

        List<Integer> integerList = new ArrayList<>();

        for(int i : arr) {
            if(i != 0)
                integerList.add(i);
        }

        int[] answer = integerList.stream().mapToInt(i->i).toArray();

        return answer;
    }
}