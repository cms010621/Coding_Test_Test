import java.math.BigInteger;
import java.util.Arrays;

public class euler_62 {
    public static void main(String[] args) {
        String arr[][] = new String[1000000][3];
        int countNum = 345;
        int presLength = 1;
        while(true) {
            BigInteger num = BigInteger.valueOf((long)Math.pow(countNum, 3));
            int check = 0;
            String clean[] = String.valueOf(num).split(""); //한자씩 배열 저장
            String cleanStr = "";   //arr을 string으로 만들어서 넣을 값 string 형식으로 저장할 예정.
            int intClean[] = new int[clean.length]; //정렬할 숫자가 담기는 배열
            for(int i=0;i<clean.length;i++) {   
                cleanStr +=clean[i];
                intClean[i] = Integer.valueOf(clean[i]);
            }
            Arrays.sort(intClean);
            String cleanIntToStr = "";
            for(int i=0;i<intClean.length;i++) {
                cleanIntToStr+=intClean[i];
            }
            for(int i=0;i<presLength;i++) {
                if(cleanIntToStr.equals(arr[i][1])) {
                    check = 1;
                    arr[i][2] = String.valueOf(Integer.parseInt(arr[i][2])+1);
                    if(arr[i][2].equals("5")) {
                        System.out.println(arr[i][0]);
                    }
                    break;
                }
            }
            if(check ==2) break;
            if(check == 0) {
                arr[presLength-1][0] = cleanStr;
                arr[presLength-1][1] = cleanIntToStr;
                arr[presLength-1][2] = "1";
                presLength++;
            }
            countNum++;
        }
    }
}