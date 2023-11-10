class Solution {
    public boolean solution(String s) {
        boolean answer = false;

        String sss = "[0-9]*";

        if(s.length() == 6 || s.length() == 4) {
            answer = s.matches(sss);
        }

        return answer;
    }
}