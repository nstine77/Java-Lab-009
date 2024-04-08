import java.math.BigInteger;
import static java.lang.Math.pow;
public static class BigIntRewrite {

        public static BigInteger pow(BigInteger x, int n) {
            if (n == 0) {
                return BigInteger.ONE; // I'm using BigInteger.ONE for base case
            }
            BigInteger t = pow(BigInteger.valueOf(x), n / 2);

            // Use BigInteger multiplication based on even/odd power
            return (n % 2 == 0) ? t.multiply(t) : t.multiply(t).multiply(BigInteger.valueOf(x));
        }
    }
        BigIntRewrite result = BigIntRewrite.valueOf(x); // Start with x
        BigIntRewrite halfPower = pow(x, n / 2); // Recursive call for half the power

        // I saw someone else using multiplication based on even/odd power.  I think it was on Khan Academy,
        // but I can't find the link in my search history for citation purposes.


    public static void main(String[] args) {

    }
//  I give up on this one.  I have too much packing and cleaning to do before a very long drive.