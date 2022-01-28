public class codingTest123Country {
    public static void main(String[] args) {
        int n = 10;
        String answer = "";
        long value = 1;

        int val = (n-1)/3;
        int val1 = (n-1)%3;
        value += 10*val;
        if(val1 == 1) value += 1;
        else if(val1 == 2) value += 3;

        if(n == 1) answer = "1";
        else if (n == 2) answer = "2";
        else if (n == 3) answer = "4";
        else answer = String.valueOf(value);
        System.out.println(answer);

    }
}
