public class codingTestSqaurt {
    public static void main(String[] args) {
        String s = "50000000000000";
        long n = Long.valueOf(s);
        long answer = -1;
        double d = Math.sqrt(Double.parseDouble(String.valueOf(n)));
        if(d%1 == 0 && d != 0) {
            String value = String.valueOf(((d+1)*(d+1)));
            answer = Long.parseLong(value.substring(0, value.length()-2));
        }
        System.out.println(answer);
        //?
        
    }
}
