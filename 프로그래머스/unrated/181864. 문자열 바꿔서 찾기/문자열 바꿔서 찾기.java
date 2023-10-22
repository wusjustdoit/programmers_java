import java.util.*;
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        String[] splitArray = myString.split("");

        for(int i=0; i<splitArray.length; i++) {
            if(splitArray[i].equals("A"))
                splitArray[i] = "B";
            else if(splitArray[i].equals("B"))
                splitArray[i] = "A";
        }

        String reversedStr = String.join("", splitArray);
        
        if(reversedStr.contains(pat))
            answer = 1;

        return answer;
    }
}