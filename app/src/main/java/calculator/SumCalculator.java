package calculator;

public class SumCalculator {
    public int sum(int n) {
        if(n==0) {
            try {
                throw new IllegalAccessException("Aw -> " + n);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }
}
