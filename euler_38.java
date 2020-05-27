class euler_38 {
    public static void main(String[] args) {
        
        long st = System.currentTimeMillis();
        int start = 9876;
        while(start>4987) {
            int check = 0;
            String srtStr = String.valueOf(start)+String.valueOf(start*2);
            String checkStr[] = srtStr.split("");
            if(checkStr.length==9) {
                for(int i=0;i<9;i++) {
                    for(int j=0;j<9;j++) {
                        if((i!=j&&checkStr[i].equals(checkStr[j]))||(checkStr[i].equals("0")||checkStr[j].equals("0"))) {
                            check = 1;
                            break;
                        }
                    }
                    if(check==1) break;
                }
            }
            if(check!=1) {
                System.out.println(srtStr); break;
            }
            start--;
        }
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : "+(end-st)/1000.0);
        
    }
}