import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public double solution(int[] arr) {
        OptionalDouble answer;

        answer = IntStream.of(arr).average();

        return answer.getAsDouble();
    }
}