import java.math.BigInteger;
import java.util.ArrayList;

public class codingQuiz_6 {
    public static void main(String[] args) {
        ArrayList<BigInteger> Fibo = new ArrayList<BigInteger>();
        Fibo.add(BigInteger.ONE);
        Fibo.add(BigInteger.valueOf(2));
        BigInteger cal = BigInteger.ZERO;
        int count = 2;

        while(true) {
            cal = Fibo.get(count-2).add(Fibo.get(count-1));
            // System.out.println(cal);
            Fibo.add(cal);

            count++;
            if(cal.compareTo(BigInteger.valueOf(100000000000L))==1) break;
        }
        cal = BigInteger.ZERO;
        for(int i=0;i<Fibo.size();i++) {
            if(Fibo.get(i).compareTo(BigInteger.valueOf(12345678999L))==1 && Fibo.get(i).compareTo(BigInteger.valueOf(99987654321L))==-1) {
                cal = cal.add(Fibo.get(i));
            }
        }

        System.out.println(cal);

    }
}
