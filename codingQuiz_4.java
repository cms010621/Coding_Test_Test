public class codingQuiz_4 {
        public static void main(String[] args) {
        String[] arr = {"","A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int[] intVal = {5, 4, 3, 2, 1, 0};
        int calVal = 0; //26의 승을 계산한 값.
        int totVal = 100000000; //남은 값.
        String str = "";
        for(int i=0;i<intVal.length; i++) {
            calVal = (int)Math.pow(26, intVal[i]);
            for(int j=1; j<=26; j++) {
                if(calVal*j>totVal) {
                    calVal = calVal*(j-1);
                    str = str+arr[j-1];
                    totVal -= calVal;
                    break;
                }
            }
        }
        System.out.println(str);
    }
}
