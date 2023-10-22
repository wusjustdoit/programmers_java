import java.util.stream.Stream;
class Solution {
    public int solution(String num_str) {
        String[] strings = num_str.split("");

        int ints = Stream.of(strings).mapToInt(Integer::parseInt).sum();
        
        return ints;
    }
}