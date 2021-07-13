import java.math.BigInteger;
import java.util.Arrays;

public class codingQuiz_1 {
    public static void main(String[] args) {
        int calNum = 0; //곱한 값을 더하는 변수
        int presNum = 0; //현재 수 == i
        int count = 0;
        String arr[];
        for(presNum=2;presNum<3; presNum++) {
            arr = Integer.toString(presNum).split("");
            while(true) {
                calNum = 0;
                for(int i=0;i<arr.length; i++) {
                    calNum += Math.pow(Integer.parseInt(arr[i]), 2);
                }
                arr = Integer.toString(calNum).split("");
                // System.out.println("calNum : "+calNum);
                // System.out.println("presNum : "+presNum);
                if(calNum == presNum || calNum == 1) 
                    break;
                count ++;
            }
            System.out.println("calNum : "+calNum);
            System.out.println("presNum : "+presNum);
        }
        
    }
}
