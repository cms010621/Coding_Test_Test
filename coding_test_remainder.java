public class coding_test_remainder {
    
    public static void main(String[] args) {
        int n = 12;
        int answer = 0;
        for(int i=2; i<n/2; i++) {
            if(n%i == 1) {
                answer = i;
                break;
            }
        }
        if(answer == 0) answer = n-1;

        System.out.println(answer);
    }
}
