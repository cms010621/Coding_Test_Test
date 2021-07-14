import java.math.BigInteger;

public class codingQuiz_1 {
    public static void main(String[] args) {
        int calNum = 0; //곱한 값을 더하는 변수
        int presNum = 0; //현재 수 == i
        BigInteger totCount = BigInteger.ZERO; //행복수의 총 개수
        BigInteger totVal = BigInteger.ZERO; //행복수의 총 합
        String arr[];
        
        for(presNum=1;presNum<10000; presNum++) {
            arr = Integer.toString(presNum).split("");
            while(true) {
                calNum = 0;
                for(int i=0;i<arr.length; i++) {
                    calNum += Math.pow(Integer.parseInt(arr[i]), 2);
                }
                arr = Integer.toString(calNum).split("");
                if(calNum == presNum || calNum == 1 || calNum == 89)  {
                    if(calNum == 1) {
                        totCount = totCount.add(BigInteger.ONE);
                        totVal = totVal.add(BigInteger.valueOf(presNum));
                    }
                    break;
                }
            }
        }
        BigInteger total = totCount.multiply(totVal);
        System.out.println(total);
        //1622531837? -> 변수가 BigInteger가 아니어서 21억까지 나타낼 수 있는 integer로는 표현을 못한 것.

        
    }
}
