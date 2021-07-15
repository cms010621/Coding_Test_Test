public class codingQuiz_2 {
    public static void main(String args[]) {

        
        String arrt[] = {"천조", "백조", "십조", "조", "천억", "백억", "십억", "억", "천만", "백만", "십만", "만", "천", "백", "십", ""};
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
            String arr[] = {"천조", "백조", "십조", "조", "천억", "백억", "십억", "억", "천만", "백만", "십만", "만", "천", "백", "십", ""};
            int numCount = 1;
            int calCount = 0;
            //arr배열의 값 앞에 value배열의 값을 하나씩 입력.
            for(int j=strArr.length-1;j>=0; j--) {
                numCount = Integer.parseInt(strArr[j]);
                    arr[arr.length-arrCount] = arrNum[numCount]+arr[arr.length-arrCount];
                
                arrCount++;
            }

            //함수호출 후 stringbuilder변수 선언
            String calArr = toStr(arr, arrt);
            StringBuilder sb = new StringBuilder();

            //함수를 통해 하나씩만 남은 조억만 바로 뒷자리에 빈칸 추가.
            //그냥 for문안에 if문 넣어서 조억만 뒤에 빈칸을 넣었어도 됏었을거 같음. 어차피 한번만 도는데.
            sb.append(calArr);
            if(sb.indexOf("조") != -1 && sb.indexOf("조")!= sb.length()-1) 
                sb.insert(sb.indexOf("조")+1, " ");
            if(sb.indexOf("억") != -1 && sb.indexOf("억")!= sb.length()-1) 
                sb.insert(sb.indexOf("억")+1, " ");
            if(sb.indexOf("만") != -1 && sb.indexOf("만")!= sb.length()-1) 
                sb.insert(sb.indexOf("만")+1, " ");
            sb.insert(sb.length(), "원");
            calArr = new String(sb);

            //조, 억과는 다르게 만은 일만이 올 수 없다. 일조, 일억은 가능. 
            //일만 중에서도 십일만 백일만 같은 경우가 나올 수 있어서 앞자리가 빈칸인 경우에만 만으로 바꿧다.
            //이경우에는 11,111원이라는 값이 입력될 경우에는 에러가 난다. 맨앞이 일만이기때문,,
            if(calArr.contains("일만")) {
                int index = calArr.indexOf("일만");
                if(calArr.substring(index-1, index).equals(" ")) 
                    calArr = calArr.replace("일만", "만");
            }

            int calSum = calArr.length() - calArr.replace(" ", "").length()+1;
            calArr = calArr.replace(" ", "");
            calCount = calArr.length();
            totValue += calSum * calCount;
        }

        System.out.println(totValue);
    }

    public static String toStr(String[] arr, String[] arrt) {
        //arr배열 길이만큼 반복하면서 조, 억, 만의 일의자리대가 아니고 일의 자리가 아니면서 값이 "일x" 인 배열의 값의 "일" 값을 제거.
        for(int i=0;i<arr.length; i++) {
            if(arr[i].equals(arrt[i])) 
                arr[i] = "";
        
            if(!arr[i].contains("조") || !arr[i].contains("억") || !arr[i].contains("만")) 
                if(arr[i].contains("일") && (!arr[i].equals("일"))) {
                    if(arr[i].replace("일","").equals("조") || arr[i].replace("일","").equals("억") || arr[i].replace("일","").equals("만")) {
                    }
                    else 
                        arr[i] = arr[i].replace("일", "");
                }
        }

        //조, 억, 만이 중복되어 들어있는 배열의 조억만을 하나만 남겨두기 위해서 작성.
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

        //정리.
        String calcStr = "";
        for(int i=0;i<arr.length; i++) {
            calcStr += arr[i];
        }
        return calcStr;
    }
}
