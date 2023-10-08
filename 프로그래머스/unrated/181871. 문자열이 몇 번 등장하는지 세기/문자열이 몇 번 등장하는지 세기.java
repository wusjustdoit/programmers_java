class Solution {
    public int solution(String myString, String pat) {
        
        int answer = 0;
        int checkNum = pat.length();

        for(int i=0; i<=myString.length() - pat.length(); i++) {
            if(myString.substring(i, checkNum).contains(pat)) answer++;
            checkNum++;
        }

        return answer;
    }
}