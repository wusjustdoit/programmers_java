import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> answer1 = new ArrayList<>();

        for(String str : strArr) {
            if(!str.contains("ad")) {
                answer1.add(str);
            }
        }

        String[] answer = answer1.toArray(new String[answer1.size()]);

        return answer;
    }
}