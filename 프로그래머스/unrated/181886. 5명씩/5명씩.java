import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String[] names) {
        List<String> stringList = new ArrayList<>();

        for(int i=0; i< names.length; i++) {
            if((i) % 5  == 0) {
                stringList.add(names[i]);
            }
        }

        String[] answer = stringList.toArray(new String[0]);

        return answer;
    }
}