import java.math.BigInteger;

public class euler_53 {
    public static void main(String args[]) {
        long st = System.currentTimeMillis();

        int total = 0;
        for(int n = 1;n<=100;n++) {
            for(int r = 1;r<=n;r++) {
                BigInteger rFactogram = BigInteger.ONE;
                BigInteger nrFactogram = BigInteger.ONE;
                BigInteger nFactogram = BigInteger.ONE;

                for(int l = 1;l<=r;l++) {
                    rFactogram = rFactogram.multiply(BigInteger.valueOf(l));
                }
                for(int l = 1;l<=n-r;l++) {
                    nrFactogram = nrFactogram.multiply(BigInteger.valueOf(l));
                }
                for( int l = 1;l<=n;l++) {
                    nFactogram = nFactogram.multiply(BigInteger.valueOf(l));
                }
                BigInteger onBig = nFactogram;
                BigInteger underBig = rFactogram.multiply(nrFactogram);
                if(onBig.divide(underBig).compareTo(BigInteger.valueOf(1000000)) == 0 || onBig.divide(underBig).compareTo(BigInteger.valueOf(1000000)) == 1) {
                    total++;
                }
            }
        }
        System.out.println(total);
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);
    }
    
}