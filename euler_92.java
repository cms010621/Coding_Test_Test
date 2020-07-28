public class euler_92 {
    public static void main(String args[]) {
        int count = 0;
        for(int i=1;i<10000000;i++) {
            if(Squared(i) == 89) {
                count++;
            }
        }
        System.out.println("89 :  "+count+" 개");
    }
    public static int Squared(int number) {
        String arr[] = String.valueOf(number).split("");
        int res = 0;
        while(true) {
            res = calc(arr);
            if(res == 89 || res == 1) 
                return res;
            arr = String.valueOf(res).split("");
        }
    }
    public static int calc(String[] array) {
        int powNum = 0;
        for(int i=0;i<array.length;i++) {
            powNum += (int)Math.pow(Double.valueOf(array[i]), 2);
        }
        return powNum;
    }
}