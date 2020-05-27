import java.math.BigInteger;

class euler_57 {
    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        BigInteger x = new BigInteger("3");
        BigInteger y = new BigInteger("2");
        int total = 0;
        for(int i=2;i<=1000;i++) {
            BigInteger j = new BigInteger(""+x+"");
            x = x.add(y.multiply(BigInteger.valueOf(2)));
            y = y.add(j);
            String strX = String.valueOf(x);
            String strY = String.valueOf(y);
            if(strX.length()>strY.length()) {
                // System.out.println("strX : "+strX+" strY : "+strY + " : "+i);
                total++;
            }
        }
        System.out.println(total);
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);

    }
}