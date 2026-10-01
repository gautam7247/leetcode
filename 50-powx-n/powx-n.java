class Solution {
    public double myPow(double x, long n) {

        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 1 / myPow(x, -(n + 1)) / x;
        }

        if (n % 2 == 0) {
            double smallPow = myPow(x, n / 2);
            return smallPow * smallPow;
        }

        double smallPow = myPow(x, n / 2);
        return x * smallPow * smallPow;
    }
}