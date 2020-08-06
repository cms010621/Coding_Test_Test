public class euler_27 {
    public static void main(String args[]) {
        long st = System.currentTimeMillis();
        int count = 0;
        int Max = 0;
        int cal = 0;
        for(int a=-999; a<1000; a++) {
            for(int b=-999; b<1000; b++) {
                while(true) {
                    int num = Math.abs(((int)Math.pow(count, 2))+( count*a)+b);
                    int check = 0;
                    for(int i=2;i<=Math.sqrt(num); i++) {
                        if(num%i == 0) {
                            check = count-1;
                            break;
                        }
                    }
                    if(check == 0) 
                        count++;
                    else if(check != 0) {
                        if(Max<check) {
                            Max = check;
                            cal = a*b;
                        }
                        break;
                    }
                }
                count =0;
            }
        }
        System.out.println("cal : "+cal+"  Max : "+Max);
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);
    }
}