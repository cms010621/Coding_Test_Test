import java.util.*;
// import java.lang.*;
// import java.io.*;
// import java.math.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class euler_23
{
	public static void main (String[] args) throws java.lang.Exception
	{
        System.out.println(10%2);
        int arr[] = new int [6963];
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> sumList = new ArrayList<>();
        String sum[] = new String [16452140];
        int ss = 0;
        for(int i=12;i<=28121;i++) { //일단 정확히 얼만큼 반복해야하는지 모름. 끝에 아마 반복될거같은데..?
            int me = i;
            int total = 1; //1포함.
            int count = 2; //반복하는 약수
            while(true) {
                if(me%count == 0){
                    total += count;
                    count++;
                }
                else {
                    count++;
                }
                if(me <= count)break;
            }
            if(i<total) {
                arrayList.add(i);
                // System.out.println(arrayList.get(ss++));
            }
        }
        int sumCount = 0;
        for(int i=0;i<arrayList.size();i++) {
            // for(int j=6962-i;j<=0;j--) {
            for(int j=0;j<arrayList.size();j++){
                if(arrayList.get(i)+arrayList.get(j)>=28123) break;
                else {
                    sumList.add(arrayList.get(i)+arrayList.get(j));
                    // System.out.println(sumList.get(sumCount++));
                }
            }
        }

        Collections.sort(sumList);
        // System.out.println(sumList.get(sumList.size()-1));

        TreeSet<Integer> test = new TreeSet<Integer>(sumList);
        sumList = new ArrayList<Integer>(test);

        int now = 0;
        int nowMinus = 0;
        int last = 0;
        for(int i = sumList.size()-1;i>=1;i--) {
            now = sumList.get(i);
            nowMinus = sumList.get(i-1);

            if(now-nowMinus!= 1) {
                // System.out.println(sumList.get(i+1));
                // System.out.println(now);
                // System.out.println(nowMinus); //i-1
                last = i-1;
                break;
            }
        }
        long big = 0;
        long notBig = 0;
        for(int i=0;i<=last;i++) {
            big+=sumList.get(i);
        }
        for(int i=0;i<now;i++) {
            notBig+=i;
        }

        System.out.println(notBig-big);
	}
}