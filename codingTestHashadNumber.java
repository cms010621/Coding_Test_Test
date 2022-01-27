public class codingTestHashadNumber {
    public static void main(String[] args) {
        int x = 11;
        boolean answer = true;
        int sum = 0;
        String[] str = String.valueOf(x).split("");
        for(int i=0;i<str.length; i++) {
            sum += Integer.valueOf(str[i]);
        }
        if(x%sum != 0) answer = false;
        System.out.println(answer);
    }
}
