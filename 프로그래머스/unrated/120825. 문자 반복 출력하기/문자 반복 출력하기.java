class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        char[] chars = my_string.toCharArray();

        for(char ch : chars) {
            for(int i=1; i<=n; i++)
                answer += ch;
        }

        return answer;
    }
}