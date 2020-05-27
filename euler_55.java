import java.math.BigInteger;

public class euler_55 {
    public static void main(String args[]) {
        long st = System.currentTimeMillis();
        int total = 0;
        for(int i=10;i<=9999;i++) {
            BigInteger orgin = BigInteger.valueOf(i); //원본 수
            int check = 0; //숫자가 같은지 확인.
            for(int count=0;count<=50;count++) { //최대 50회 반복.\
                String array_cal[] = String.valueOf(orgin).split("");
                String cal="";
                for(int j=array_cal.length-1;j>=0;j--) {
                    cal+=array_cal[j];
                }
                BigInteger result = orgin.add(new BigInteger(cal)); //뒤집은 수와 더한 수
                String strResult = String.valueOf(result);
                String arr[] = strResult.split("");
                    String left = "";
                    String right = "";
                        left = strResult.substring(0,arr.length/2);
                    if(arr.length%2== 0)  //짝수
                        for(int p = arr.length;p>arr.length/2;p--) {
                            right += arr[p-1]; 
                        }
                    else  //홀수
                        for(int p = arr.length;p>arr.length/2+1;p--) {
                            right += arr[p-1]; 
                        }
                    if(left.equals(right)) {
                        check = 1;
                        break;
                    }
                if(check!=0) break;
                orgin = result;
            }
            if(check == 0){
                 total++;
            }
        }
        System.out.println(total);
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);
    }
}