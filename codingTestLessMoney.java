public class codingTestLessMoney {
    public static void main(String[] args) {
        int price = 2500;
        int money = 1000000000;
        int count = 0;
        long result = 0;
        long monTotal = 0;

        for(int i=1;i<=2500; i++) {
            count++;
            monTotal += price * i;
            if(monTotal >= money) {
                result = Math.abs(monTotal-money);
                break;
            }
        }
    }
}
