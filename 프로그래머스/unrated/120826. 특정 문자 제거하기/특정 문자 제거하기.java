class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";

        char[] chars = my_string.toCharArray();

        char target = letter.charAt(0);

        for(char ch : chars) {
            if(ch != target) {
                answer += ch;
            }
        }

        return answer;
    }
}