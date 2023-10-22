class Solution {
    public int solution(String binomial) {
        int answer = 0;

        String[] parts = binomial.split(" ");

        int firstNo = Integer.parseInt(parts[0]);
        int lastNo = Integer.parseInt(parts[2]);
        String math = parts[1];

        if(math.equals("+"))
            answer = firstNo + lastNo;
        else if(math.equals("-"))
            answer = firstNo - lastNo;
        else
            answer = firstNo * lastNo;

        return answer;
    }
}