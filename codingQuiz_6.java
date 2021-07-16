import java.math.BigInteger;
import java.util.ArrayList;

public class codingQuiz_6 {
    public static void main(String[] args) {
        ArrayList<BigInteger> Fibo = new ArrayList<BigInteger>();
        Fibo.add(BigInteger.ONE);
        Fibo.add(BigInteger.valueOf(2));
        BigInteger cal = BigInteger.ZERO;
        BigInteger tot = BigInteger.ZERO;
        int count = 2;

        while(true) {
            cal = Fibo.get(count-2).add(Fibo.get(count-1));
            if(cal.compareTo(BigInteger.valueOf(12345678999L))==1 && cal.compareTo(BigInteger.valueOf(99987654321L))==-1) 
                tot = tot.add(cal);
            
            Fibo.add(cal);
            count++;
            if(cal.compareTo(BigInteger.valueOf(99987654321L))==1) break;
        }

        System.out.println(tot);

    }
}
