import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class codingTestMostBigNumberLastTry {
    public static void main(String[] args) {
        int num[] = {3, 30, 34, 5, 9,1000};
        Integer numbers[] = Arrays.stream(num).boxed().toArray(Integer[]::new); 
        int numbersArr[][] = new int[numbers.length][4];
        String answer = "";

        Arrays.sort(numbers, Collections.reverseOrder());

        for(int i=0;i<numbers.length; i++) {
            String arr[] = String.valueOf(numbers[i]).split("");
            for(int j=0;j<arr.length; j++) {
                numbersArr[i][j] = Integer.valueOf(arr[j]);
            }
            for(int j=arr.length;j<4; j++) {
                numbersArr[i][j] = numbersArr[i][j-1] < 0 ? numbersArr[i][j-1] : numbersArr[i][j-1] * -1;
                if(numbersArr[i][j] == 0) {
                    numbersArr[i][j] = -1;
                }
            }
        }

        Arrays.sort(numbersArr, Comparator.comparing(o1 -> o1[0]));

        Arrays.sort(numbersArr, (o1, o2) -> {
            if(o1[0] == o2[0]) {
                if(Math.abs(o1[1]) == Math.abs(o2[1])) {
                    return Integer.compare(Math.abs(o2[2]), Math.abs(o1[2]));
                } else {
                    return Integer.compare(Math.abs(o2[1]), Math.abs(o1[1]));
                }
            } else {
                return Integer.compare(Math.abs(o2[0]), Math.abs(o1[0]));
            }
        });

        for(int i=0;i<numbersArr.length; i++) {
            for(int j=0;j<4; j++) {
                if(numbersArr[i][j] > -1) {
                    answer += numbersArr[i][j];
                } else {
                    break;
                }
            }
        }
        
        System.out.println(answer);


     
        
    }
}
