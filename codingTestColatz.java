public class codingTestColatz {
    public static void main(String[] args) {
        int num = 1;
        long numL = Long.parseLong(String.valueOf(num));
        int answer = 1;
        if(numL == 1) {
            answer = 0;
        } else {
            while(answer <= 501) {
                if(numL%2 == 0) {
                    numL = numL/2;
                } else {
                    numL = (numL*3)+1;
                }
                System.out.println(numL);
                if(numL == 1) break;
                answer++;
            }
            if(answer > 501) answer = -1;
               
        }
        System.out.println(answer);
        
    }
}
