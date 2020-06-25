import java.math.BigInteger;

public class euler_63 {
    public static void main(String args[]) {
        long st = System.currentTimeMillis();
        double count = 0;
        for(int i=1;i<10;i++) 
            for(int j=1;j<100000000;j++) {
                BigInteger first = BigInteger.valueOf(i);
                BigInteger n = first.pow(j);
                String s = n.toString();
                if(s.length() < j) 
                    break;
                if(s.length() == j)  //길이같을때
                    // System.out.println("밑 수 : " +i+  "위 수 : "+j+"  숫자 : "+s);
                    count++;
            }
        
        System.out.println(count);
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);
    }
}