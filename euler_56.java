// import java.lang.Math;
import java.math.BigInteger;
class euler_56 {
    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        BigInteger total = new BigInteger("1");
        int maxValue = 0;
        for(int i=1;i<100;i++) {
            for(int j=1;j<100;j++) {
                total = BigInteger.valueOf(i).pow(j);
                String strTotal = total.toString();
                String[] str = strTotal.split("");
                int count = 0;
                for(int l=0;l<str.length;l++) {
                    count += Integer.parseInt(str[l]);
                } 
                if(count>maxValue) {
                    maxValue = count;
                }
            }
        }
        System.out.println(maxValue);
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);

    }
}