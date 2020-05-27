import java.util.ArrayList;
import java.util.List;

public class euler_46 {
    public static void main(String []args) {
        long st = System.currentTimeMillis();
        //홀수인 합성수 : 소수가 아닌 홀수.
        int number = 9;
        int check = 0;
        int lastNum = 4;
        List<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(3);
        while(true) {   
            for(int j=2;j<=Math.sqrt(number);j++) {
                if(number%j==0) {
                    check =1;
                    break;
                }
            }
            if(check == 1) { //홀수인데 소수
                for(int i = lastNum;i<number;i++) {
                    for(int k = 2;k<=Math.sqrt(i);k++) {
                        if(i%k==0) { //나누어지면
                            check = 3;
                            break;
                        }
                    }
                    if(check!=3)
                        array.add(i);
                    check = 1;
                }
                lastNum = number;
            }
            if(check ==1) {
                check = 2;
                for(int i=0;i<array.size();i++) {
                    int cal = number-array.get(i);
                    if(Math.sqrt(cal/2)%1==0) 
                        check = 4;
                }
            }

            number+=2;
            if(check == 2) break;

            check = 0;
        }
        System.out.println(number-2);
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);
    }
}