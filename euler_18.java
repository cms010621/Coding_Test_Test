import java.util.ArrayList;

public class euler_18 {
    public static void main(String[] args) {
        long st = System.currentTimeMillis();
         //18
            // var arr = new Array();
            // // arr = [0, 75, 95, 64, 17, 47, 82, 18, 35, 87, 10, 20, 04, 82, 47, 65, 19, 01, 23, 75, 03, 34, 88, 02, 77, 73, 07, 63, 67, 99, 65, 04, 28, 06, 16, 70, 92, 41, 41, 26, 56, 83, 40, 80, 70, 33, 41, 48, 72, 33, 47, 32, 37, 16, 94, 29, 53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14, 70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57, 91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48, 63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 89, 40, 31, 04, 62, 98, 27, 23, 09, 70, 98, 73, 93, 38, 53, 60, 04, 23];
            // // alert(arr.length);
            ArrayList<int[]> arrT = new ArrayList<int[]>();
            arrT.add(new int[]{0,                            75});
            arrT.add(new int[]{0,                          68, 64});
            arrT.add(new int[]{0,                        17, 47, 82});
            arrT.add(new int[]{0,                      18, 35, 87, 10});
            arrT.add(new int[]{0,                    20, 04, 82, 47, 65});
            arrT.add(new int[]{0,                  19, 01, 23, 75, 03, 34});
            arrT.add(new int[]{0,                88, 02, 77, 73, 07, 63, 67});
            arrT.add(new int[]{0,              99, 65, 04, 28, 06, 16, 70, 92});
            arrT.add(new int[]{0,            41, 41, 26, 56, 83, 40, 80, 70, 33});
            arrT.add(new int[]{0,          41, 48, 72, 33, 47, 32, 37, 16, 94, 29});
            arrT.add(new int[]{0,        53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14});
            arrT.add(new int[]{0,      70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57});
            arrT.add(new int[]{0,    91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48});
            arrT.add(new int[]{0,  63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31});
            arrT.add(new int[]{0,04, 62, 98, 27, 23,  9, 70, 98, 73, 93, 38, 53, 60, 04, 23});

            
            int i=1; //x좌표
            int count=75;

            for(int j=0;j<=15;j++) { //배열 y좌표 1씩증가.
                int left = arrT.get(j+1)[i]; //왼쪽 자식노드
                int right = arrT.get(j+1)[i+1]; //오른쪽 
                int leftbig = 0; int rightbig = 0;
                if(arrT.get(j+2)[i]>arrT.get(j+2)[i+1]) leftbig = arrT.get(j+2)[i];
                else leftbig = arrT.get(j+2)[i+1];

                if(arrT.get(j+2)[i+1]> arrT.get(j+2)[i+2]) rightbig = arrT.get(j+2)[i+1];
                else rightbig = arrT.get(j+2)[i+2];

                if(left+leftbig>=right+rightbig) 
                    count+=left;
                else {
                    count+=right;
                    i=i+1;
                }
                if(j==12) { //마지막 단 체크
                    if(arrT.get(j+2)[i]>arrT.get(j+2)[i+1])  count+=arrT.get(j+2)[i];
                    else count+=arrT.get(j+2)[i+1];

                    break;
                }
            }
            System.out.println(count);
            long end = System.currentTimeMillis();
            System.out.println("실행시간 : "+(end-st)/1000.0);
    }
}