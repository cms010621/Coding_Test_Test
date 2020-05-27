public class euler_2 {
    public static void main(String []args) {
        long st = System.currentTimeMillis();
        int total = 1;
        int tot = 2;
        int last = 2;
        while(tot<=4000000) {
            total = total+tot;
            tot = total+tot;
            if(tot%2 == 0) 
            last+=tot;
            if(total%2==0)
            last+=total;
        }
        System.out.println(last);
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);
    }
}