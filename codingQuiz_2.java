import java.util.Arrays;

public class codingQuiz_2 {
    public static void main(String args[]) {

        
        String arrt[] = {"십조", "조", "천억", "백억", "십억", "억", "천만", "백만", "십만", "만", "천", "백", "십", ""};
        String arrNum[]= {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};

        String value[] = {
            "1원",
            "4원",
            "8원",
            "9원",
            "10원",
            "17원",
            "79원",
            "80원",
            "95원",
            "205원",
            "809원",
            "851원",
            "878원",
            "2,000원",
            "2,800원",
            "7,008원",
            "8,174원",
            "9,718원",
            "45,150원",
            "50,000원",
            "69,700원",
            "382,915원",
            "431,409원",
            "921,500원",
            "5,003,052원",
            "5,039,670원",
            "6,835,623원",
            "8,000,000원",
            "10,000,003원",
            "35,100,000원",
            "39,997,777원",
            "90,021,015원",
            "93,275,690원",
            "403,197,000원",
            "459,176,461원",
            "730,080,000원",
            "999,999,000원",
            "6,887,000,000원",
            "7,000,020,000원",
            "7,700,000,500원",
            "7,848,761,270원",
            "38,048,620,625원",
            "57,000,000,000원",
            "74,778,562,249원",
            "97,417,165,814원",
            "101,000,120,000원",
            "343,000,000,000원",
            "458,807,907,862원",
            "872,818,015,000원",
            "6,278,000,015,000원",
            "7,991,000,844,000원",
            "9,000,400,000,675원",
            "22,018,914,675,100원",
            "78,196,000,000,000원",
            "85,000,904,224,858원",
            "95,000,000,404,918원"
        };
        String str;
        String strArr[];
        int arrCount = 1;
        int totValue = 0;

        for(int i=0;i<value.length; i++) {
            str = value[i].replace("원", "");
            str = str.replaceAll(",", "");
            strArr = str.split("");
            arrCount = 1;
            String arr[] = {"십조", "조", "천억", "백억", "십억", "억", "천만", "백만", "십만", "만", "천", "백", "십", ""};
            int numCount = 1;
            int calCount = 0;
            for(int j=strArr.length-1;j>=0; j--) {
                numCount = Integer.parseInt(strArr[j]);
                    arr[arr.length-arrCount] = arrNum[numCount]+arr[arr.length-arrCount];
                
                arrCount++;
            }

            String calArr = toStr(arr, arrt);
            calCount = calArr.length()+1;
            if(calCount == 0) calCount = 1;
            StringBuilder sb = new StringBuilder();

            sb.append(calArr);
            //조, 억, 만이 없는 경우???? -1를 반환해서 0에 빈칸이 나왔던 것 같음.
            if(sb.indexOf("조") != -1 && sb.indexOf("조")!= sb.length()-1) 
                sb.insert(sb.indexOf("조")+1, " ");
            if(sb.indexOf("억") != -1 && sb.indexOf("억")!= sb.length()-1) 
                sb.insert(sb.indexOf("억")+1, " ");
            if(sb.indexOf("만") != -1 && sb.indexOf("만")!= sb.length()-1) 
                sb.insert(sb.indexOf("만")+1, " ");
            sb.insert(sb.length(), "원");
            calArr = new String(sb);

            System.out.println(sb);


            int calSum = calArr.length() - calArr.replace(" ", "").length()+1;
            int calTot = calSum * calCount;
            System.out.println(calSum * calCount); 
            totValue += calTot;


            
        }
        System.out.println(totValue);//8

    }
    public static String toStr(String[] arr, String[] arrt) {
        for(int i=0;i<arr.length; i++) {
            if(arr[i].equals(arrt[i])) { //값이 없을때.
                arr[i] = "";
            }
            if(!arr[i].contains("조") || !arr[i].contains("억") || !arr[i].contains("만")) {
                if(arr[i].contains("일") && (!arr[i].equals("일"))) 
                    arr[i] = arr[i].replace("일", "");
                
            }
        }

        int joCount = 0;
        int eokCount = 0;
        int manCount = 0;
        for(int i=arr.length-1; i>=0; i--) {
            if(arr[i].contains("조")) {
                joCount+=1;
                if(joCount>1) 
                    arr[i] = arr[i].replaceAll("조", "");
            }

            if(arr[i].contains("억")) {
                eokCount+=1;
                if(eokCount>1)
                    arr[i] = arr[i].replace("억", "");
            }

            if(arr[i].contains("만")) {
                manCount+=1;
                if(manCount>1)
                    arr[i] = arr[i].replace("만", "");
            }
            
        }

        String calcStr = "";
        for(int i=0;i<arr.length; i++) {
            calcStr += arr[i];
        }
        return calcStr;
    }
}
