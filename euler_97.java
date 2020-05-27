import java.math.BigInteger;

class euler_97 {
    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        BigInteger first = new BigInteger("28433");
        BigInteger second = BigInteger.valueOf(2).pow(7830457);
        BigInteger third = first.multiply(second).add(BigInteger.ONE);
        String tt =third.toString();
        System.out.println(tt.substring(tt.length()-10, tt.length()));
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);

    }
}