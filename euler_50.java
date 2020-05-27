import java.util.ArrayList;

public class euler_50 {

    public static void main(String args[] ){ 
        long st = System.currentTimeMillis();
        int check = 0;
        ArrayList<Integer> Prime = new ArrayList<>();
        Prime.add(2);
        Prime.add(3);
        int Max = 0; 
        int MaxCount = 0;
        int calc = 0;
        for(int i=5;i<1000000;i++) {
            for(int j=2;j<=Math.sqrt(i);j++) {
                if(i%j==0) {
                    check = 1;
                    break;
                }
            }
            if(check==0) 
                Prime.add(i);
            check = 0;
        }
        for(int i=0;i<Prime.size()-1;i++) {
            calc+=Prime.get(i);
            if(calc+Prime.get(i+1)>=1000000) {
                Max = calc;
                MaxCount =i;
                break;
            }
        }

        int left = Max;
        int right = Max;
        int leftCount = 0;
        int rightCount = 0;

        for(int j=MaxCount;j>=0;j--) {
            for(int k=2;k<Math.sqrt(right);k++) {
                if(right%k==0) {
                    rightCount = 1;
                    break;
                }
                if(rightCount ==1){ 
                    break;
                }
            }
            if(rightCount == 0) 
                break;
            
            if(rightCount == 1) 
                right-=Prime.get(j);
            rightCount = 0;
        }

        for(int j=0;j<=MaxCount;j++) {
            for(int k=2;k<=Math.sqrt(left);k++) {
                if(left%k==0) {
                    leftCount = 1;
                    break;
                }
                if(leftCount ==1)
                    break;
            }
            if(leftCount == 0) 
                break;
            
            if(leftCount == 1) 
                left-=Prime.get(j);
            
            leftCount = 0;
        }
        System.out.println(right>left?right:left);
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);
    }
}