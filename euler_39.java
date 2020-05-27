// import java.util.*;
// import java.lang.*;
// import java.io.*;

class euler_39 {
    public static void main (String[] args) throws java.lang.Exception {
        long st = System.currentTimeMillis();
        // int border = 100;
        int max = 0; //최대값 
        int maxValue = 0; //최대 둘레값.
        int meCount = 0; //현재 값.
        for(int border = 10;border<=1000;border++) {
            for(int c=border/3; c<=border/2-1;c++) { //c가 가장 긴 변일 때.
                for(int a = 1;a<=border-c-1;a++) {
                    int b = border-c-a;
                    if(Math.pow(a, 2)+Math.pow(b,2)==Math.pow(c,2)) {
                        // System.out.println("a : "+a+" b : "+b+" c : "+c);
                        meCount++; //a/b 자리 위치 중복으로 /2 해야 맞는결과 나온다.
                    }
                }
            }
            if(max<meCount) {
                max = meCount;
                maxValue = border;
            }
            meCount = 0;
        }
        System.out.println(maxValue); 
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);
    }
}