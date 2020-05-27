import java.math.BigInteger;

public class euler_6 {
    public static void main(String []args) {
        long st = System.currentTimeMillis();
        int squardSum=0; //제곱의 합
        int sumSquard=0; //합의 제곱

        for(int i=1;i<=100;i++) {
            squardSum+= Math.pow(i, 2);
            sumSquard+=i;
        }
        Long l = (new Double(Math.pow(sumSquard, 2)-squardSum)).longValue();
        System.out.println(l);

        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);
    }
}