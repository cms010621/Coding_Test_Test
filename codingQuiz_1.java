import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class codingQuiz_1 {
    public static void main(String[] args) {
        int calNum = 0; //곱한 값을 더하는 변수
        int presNum = 0; //현재 수 == i
        int count = 0; //반복 횟수
        int totCount = 0; //행복수의 총 개수
        int totVal = 0; //행복수의 총 합
        String arr[];
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        
        for(presNum=1;presNum<=num; presNum++) {
            count = 0;
            arr = Integer.toString(presNum).split("");
            while(true) {
                calNum = 0;
                for(int i=0;i<arr.length; i++) {
                    calNum += Math.pow(Integer.parseInt(arr[i]), 2);
                }
                arr = Integer.toString(calNum).split("");
                if(calNum == presNum || calNum == 1 || calNum == 89)  {
                    if(calNum == 1) {
                        totCount +=1;
                        totVal += presNum;
                    }
                    break;
                }
                count ++;
            }
        }
        System.out.println("totCount : "+totCount);
        System.out.println("totVal : "+totVal);
        System.out.println("total : "+BigInteger.valueOf(totCount*totVal));
        //1622531837
        //1622531837
        
    }
}
