class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";

        String[] arrStrings = my_string.split("");

        for(int i=0; i< indices.length; i++) {
            arrStrings[indices[i]] = "";
        }

        for(String str : arrStrings) {
            answer += str;
        }

        return answer;
    }
}