import java.util.ArrayList;

class euler_32 {
    public static void main (String[] args) throws java.lang.Exception {
        long st = System.currentTimeMillis();
        int Pendigital = 0;
        int Pend[] = new int[66];
        int PendCount = 0;
        for(int i=10;i<=99;i++) {
            for(int j=100;j<=999;j++) {
                if(i*j>9999) break;
                String str = String.valueOf(i)+String.valueOf(j)+String.valueOf(i*j);
                String strArr[] = str.split("");
                if(!String.valueOf(i).contains("0") && !String.valueOf(j).contains("0")) {
                    for(int k=0;k<9;k++) {
                        for(int l=0;l<9;l++) {
                            if(k!=l&&strArr[k].equals(strArr[l])) {
                                Pendigital = 1;
                                break;
                            }
                        }
                        if(Pendigital ==1) break;
                    }
                    if(Pendigital == 0&& !String.valueOf(i*j).contains("0")) {
                        Pend[PendCount] = i*j;
                        PendCount++;
                    }
                    Pendigital = 0;
                }
            }
        }
        for(int i=1;i<10;i++) {
            for(int j=1000;j<=9999;j++) {
                if(i*j>9999) break;
                String str = String.valueOf(i)+String.valueOf(j)+String.valueOf(i*j);
                String strArr[] = str.split("");
                if(!String.valueOf(i).contains("0") && !String.valueOf(j).contains("0")) {
                    for(int k=0;k<9;k++) {
                        for(int l=0;l<9;l++) {
                            if(k!=l&&strArr[k].equals(strArr[l])) {
                                Pendigital = 1;
                                break;
                            }
                        }
                        if(Pendigital ==1) break;
                    }
                    if(Pendigital == 0&& !String.valueOf(i*j).contains("0")) {
                        Pend[PendCount] = i*j;
                        PendCount++;
                    }
                    Pendigital = 0;
                }
            }
        }   
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arrRemove = new ArrayList<Integer>();
        for(int temp:Pend){
            arr.add(temp);
        }
        for(int i=0;i<arr.size();i++) {
            if(!arrRemove.contains(arr.get(i))) {arrRemove.add(arr.get(i));}
        }
        int removeTotal = 0;
        for(int i=0;i<arrRemove.size();i++) {
            removeTotal+=arrRemove.get(i);
        }
        System.out.println(removeTotal);
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);
    }
}