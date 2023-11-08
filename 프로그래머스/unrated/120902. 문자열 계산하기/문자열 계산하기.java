class Solution {
    public int solution(String my_string) {
        String[] strings = my_string.split(" ");

        int answer = Integer.parseInt(strings[0]);

        for(int i=1; i<strings.length; i++) {
            if(strings[i].equals("-")) {
                answer -= Integer.parseInt(strings[i+1]);
            } else if(strings[i].equals("+")) {
                answer += Integer.parseInt(strings[i+1]);
            }
        }

        return answer;
    }
}