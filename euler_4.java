public class euler_4 {
    public static void main(String []args) {
        long st = System.currentTimeMillis();
        int arr[] = new int[1000];
        int cal = 0;
        for(int i=999;i>=500;i--) {
            for(int j=999;j>=500;j--) {
                int mul = j*i;
                String str = String.valueOf(mul);
                if(str.charAt(0)==(str.charAt(5))) 
                    if(str.charAt(1)==(str.charAt(4))) 
                        if(str.charAt(2)==(str.charAt(3))) 
                            arr[cal++] = mul;
            }
        }
        int max = 0;
        for(int i=0;i<cal-1;i++) {
            if(max<arr[i])
                max = arr[i];
        }
        System.out.println(max);
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);
    }
    
}