import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        BigInteger bigInteger1 = new BigInteger(a);
        BigInteger bigInteger2 = new BigInteger(b);

        BigInteger sum = bigInteger1.add(bigInteger2);

        return sum.toString();
    }
}