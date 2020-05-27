import java.util.ArrayList;

public class euler_7 {
    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        int number = 3, count = 2, check=0;
        while(true) {
            for(int i=2;i<=Math.sqrt(number);i++) {
                if(number%i==0) {
                    check = 1;
                    break;
                }
            }
            if(check ==0) 
                count++;
            
            if(count == 10002) {
                System.out.println(number);
                break;
            }
            number++;
            check = 0;
        }
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);
    }
    
}