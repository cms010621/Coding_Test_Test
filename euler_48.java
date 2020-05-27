import java.math.BigInteger;

class euler_48 {
    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        BigInteger ii = new BigInteger("0");
        for(int i=1;i<=1000;i++) {
            BigInteger inFor = new BigInteger("1");
            for(int j=1;j<=i;j++) {
                inFor = inFor.multiply(BigInteger.valueOf(i));
            }
            ii = ii.add(inFor);
        }
        int f = ii.toString().length();
        System.out.println(ii.toString().substring(f-10, f));
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);


    }
}