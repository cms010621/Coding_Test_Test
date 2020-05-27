public class euler_3 {
    public static void main(String []args) {
        long st = System.currentTimeMillis();
        double num = 600851475143d;
        double arr[] = new double[10000];
        int cal = 0;
        for(double i=2;i<=num;i++) {
            if(num%i==0) {
                arr[cal++] = i;
                num = num/i;
            }
        }
        System.out.println((int)arr[cal-1]);
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);
    }
}