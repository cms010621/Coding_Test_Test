public class euler_5 {
    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        int number = 2520;
        int check = 0;
        while(true) { //여기서 너무 오래걸린다. 
            for(int i=2;i<=20;i++) {
                if(number%i!=0){
                    check = 1;
                    break;
                }
            }
            if(check==0) {
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