import java.util.Arrays;

public class codingTestXnPlusNumber {
    public static void main(String[] args) {
        long x = 1; 
        int n = 2;
        long[] answer = new long[n];
        long num = x;

        for(int i=1; i<=n; i++) {
            answer[i-1] = num;
            num += x;
        }

        System.out.println(Arrays.toString(answer));
    }
}
