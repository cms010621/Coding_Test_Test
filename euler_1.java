public class euler_1 {
    public static void main(String []args) {
        long st = System.currentTimeMillis();
        int total = 0;
        for(int i=0;i<1000;i++) {
            if(i%3==0 || i%5==0) 
                total+=i;
            
        }
        System.out.println(total);
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);
    }
}