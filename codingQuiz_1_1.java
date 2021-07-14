import java.math.BigInteger;

public class codingQuiz_1_1 {
    public static void main(String args[]) {
        BigInteger count = BigInteger.ZERO;
        BigInteger value = BigInteger.ZERO;
        for(int i=1;i<=9999;i++) {
            if(Squared(i) == 1) {
                count = count.add(BigInteger.ONE);
                value = value.add(BigInteger.valueOf(i));
            }
        }
        // System.out.println("1 :  "+count+" 개");
        // System.out.println("총합 : "+value);
        System.out.println("1 ~ 9999범위의 행복 수는 "+count+"개이고 총합은 "+count.multiply(value)+"입니다.");
    }
    public static int Squared(int number) {
        String arr[] = String.valueOf(number).split("");
        int res = 0;
        while(true) {
            res = calc(arr);
            if(res == 89 || res == 1) 
                return res;
            arr = String.valueOf(res).split("");
        }
    }
    public static int calc(String[] array) {
        int powNum = 0;
        for(int i=0;i<array.length;i++) {
            powNum += (int)Math.pow(Double.valueOf(array[i]), 2);
        }
        return powNum;
    }
}