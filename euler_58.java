import java.util.ArrayList;

public class euler_58 {
    public static void main(String []args) {
        long st = System.currentTimeMillis();
        int percent = 0;
        int cal = 2;
        int count = 1;
        int mm = 1;
        int len = 1;
        for(int i=3; i<100000000;i+=2) {
            percent = 0;
            int check = 0;
            for(double k = len+cal;k<=Math.pow(i, 2); k+=cal) {
                count++;
                if(k!= 3) {
                    for(int a=2;a<=Math.sqrt(k);a++) {
                        if( k%a == 0) { //나누어지면
                            check = 1;
                            break;
                        }
                    }
                }
                else check = 1;
                if(check == 0) 
                    mm++;
                
                check = 0;
            }
            cal+=2;
            percent = (int)((double)mm / (double)count*100.0);
            if(percent<10) {
                System.out.println(i);
                break;
            }
            len = (int)Math.pow(i, 2);
        }
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0); //엄청 오래걸린다 2.6초정도
    }
}