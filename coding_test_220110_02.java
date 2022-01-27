import java.math.BigInteger;
import java.util.*;

public class coding_test_220110_02 {
    
    public static void main(String args[]) {

        String[] answer = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        // for(int i=0;i<answer.length; i++) {
        //     switch(answer[i].substring(0, 6)) {
        //         case "Enter ":
        //             // answer[i] = answer[i].substring(6) + " 님이 들어왔습니다.";
        //             // break;
        //             for(int j = 0;j<i; j++) {
        //                 String[] text = answer[j].split(" ");
        //                 String[] cloneText = answer[i].split(" ");
        //                 if(text[1].equals(cloneText[1])) {
        //                     text[1] = cloneText[1];
        //                     answer[j] = text[0] + " " + text[1] + " " + cloneText[2];
        //                 }
        //             }
        //             break;
        //         case "Change" :
        //             for(int j = 0;j<i; j++) {
        //                 String[] text = answer[j].split(" ");
        //                 String[] cloneText = answer[i].split(" ");
        //                 if(text[1].equals(cloneText[1])) {
        //                     text[1] = cloneText[1];
        //                     answer[j] = text[0] + " " + text[1] + " " + cloneText[2];
        //                 }
        //             }
        //             break;
        //     }
        // } //for
        
        //change remove
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(answer));
        for(int i=0;i<list.size(); i++) {
            if(list.get(i).contains("Change")) {
                for(int j = 0;j<i; j++) {
                    String[] text = list.get(j).split(" ");
                    String[] cloneText = list.get(i).split(" ");
                    if(text[1].equals(cloneText[1])) list.set(j, text[0] + " " + text[1] + " " + cloneText[2]);
                }
                list.remove(i);
            }
        }

        for(int i=0;i<list.size(); i++) {
            // if(list.get(i).contains("Enter")) {
                // list.set(i, list.get(i).split(" ")[2]+"님이 들어왔습니다.");
            // } else {
                for(int j = i - 1; j>=0; j--){
                    System.out.println(list.get(j));
                    System.out.println(list.get(i).split(" ")[1]);
                    System.out.println(list.get(j).contains(list.get(i).split(" ")[0]));
                    if(list.get(j).contains(list.get(i).split(" ")[0])) {
                        list.set(i, list.get(j).split(" ") + " 나갔습니다.");
                        break;
                    }
                }
            // }
        }

        for(int i=0;i<list.size(); i++) {
            if(list.get(i).contains("Enter")) {
                list.set(i, list.get(i).split(" ")[2]+"님이 들어왔습니다.");
            }
        }

        answer = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(answer));

    }
}