class Solution {
    public String solution(String myString) {
        char[] chars =  myString.toLowerCase().toCharArray();

        for(int i=0; i<chars.length; i++) {
            if(chars[i] == 'a')
                chars[i] = 'A';
        }

        String answer = new String(chars);

        return answer;
    }
}