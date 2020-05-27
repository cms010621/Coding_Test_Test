
class euler_31 {
    public static void main(String args[]) {
        long st = System.currentTimeMillis();
            int Money[] = {200,100,50,20,10,5,2,1};
            int arr[] = {1,0,0,0,0,0,0,0};
            // System.out.println(Money[0]*arr[0]);
            int count = 1; //나올 수 있는 방법 개수
            int tot = 0; //계산하는 변수
            int total = 0; //200에서 점점 빼서 0이 되는 값.
            while(true) {
                for(int i=6;i>=0;i--) {
                    total = 0;
                    if(arr[i]!=0) {
                        arr[i] = arr[i]-1; //1 빼고
                        for(int j=0;j<=6;j++) {
                            total += arr[j]*Money[j]; //빼고 현재 배열에 저장되어 있는 총합.
                        }
                        tot = 200-total;
                        arr[i+1] = tot/Money[i+1];
                        int divv = i+1;
                        while(true) {
                            if(tot%Money[divv]!= 0 && divv!= 7) { //나머지가 0이 아니면 = 그 뒤에 나올 값이 있으면
                                divv++;
                                total = 0;
                                for(int j=0;j<=6;j++) {
                                    total+=arr[j]*Money[j];
                                }
                                arr[divv] = (200-total)/Money[divv];
                                total+=arr[divv];
                            }
                            if(tot%Money[divv]==0) {
                                if(divv==7) {
                                    arr[divv] = 200-total;
                                }
                                else {
                                    arr[7] = 0;
                                }
                                total = 200;
                                break;
                            }
                        }
                    }
                    if(total == 200) break;
                            total = 0;
                }
                count++;
                if(arr[0] == 0 && arr[1]==0 && arr[2]==0 && arr[3]==0 && arr[4]==0&& arr[5]==0 && arr[6]==0) break;
            }
            System.out.println(count);
            long end = System.currentTimeMillis();
            System.out.println("실행시간 : "+(end-st)/1000.0);
    
    }
}