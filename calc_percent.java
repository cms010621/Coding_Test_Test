import java.util.Scanner;

public class calc_percent {
    public static void main(String[] args) {
        Float totalVal, totalMonth, totalInter;
        Float calcVal = 0F;
        Float Inter = 0F;
        Float monthInter = 0F;
        Float test = 1F;

        boolean isNum = false;

        totalVal = printMsg("총 액 입력 : ");
        totalMonth = printMsg("기간(개월수) 입력 : ");
        totalInter = printMsg("총 이자 입력 : ");

        Float monthMon = (totalVal - totalInter) / totalMonth;

        //1만 2만 3만...

        for(Float i=totalMonth; i>0; i--) {
            calcVal += i;
        }

        // test = totalInter / calcVal;
        // System.out.println(test);

        // for(int i=1; i<totalMonth;i++) {
        //     monthInter += (monthMon + monthInter*0.1F); 
        //     System.out.println(monthInter);
        // }
        // System.out.println(test);
        // System.out.println("월 납입금액 : " + (totalVal - totalInter) / totalMonth);
        // System.out.println("총 계산 : " + calcVal);
        // Inter = totalInter / calcVal;

        // for(Float i=2F; i<=totalMonth; i++) {
        //     monthInter += Inter * i;
        //     System.out.println("(" + i + ")달차 : " + monthInter);
        // }

        

    }

    public static Float printMsg(String msg) {
        Scanner sc = new Scanner(System.in);
        String regExp = "^[-+]?[0-9]*\\.?[0-9]+";
        Float result = 0F;
        boolean isNum = false;

        System.out.print(msg);
        String scVal = sc.next();
        isNum = scVal.matches(regExp);

        if(!isNum) {
            System.out.println("숫자 및 소수점만 입력해주세요");
            System.exit(0);
        }
        return Float.parseFloat(scVal);
    }
}
