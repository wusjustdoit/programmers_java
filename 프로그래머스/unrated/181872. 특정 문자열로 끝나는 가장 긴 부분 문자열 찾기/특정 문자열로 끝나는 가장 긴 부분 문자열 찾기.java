class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int cutIdx = myString.lastIndexOf(pat);

        answer = myString.substring(0, cutIdx + pat.length());

        return answer;
    }
}