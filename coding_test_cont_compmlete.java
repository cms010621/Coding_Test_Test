import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class coding_test_cont_compmlete {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String answer = "";

        ArrayList<String> participantList = new ArrayList<>(Arrays.asList(participant));
        ArrayList<String> completionList = new ArrayList<>(Arrays.asList(completion));

        Collections.sort(participantList);
        Collections.sort(completionList);

        for(int i=0;i<completionList.size(); i++) {
            if(!participantList.get(i).equals(completionList.get(i))) {
                answer = participantList.get(i);
                break;
            }
        }
        if(answer.equals("")) answer = participantList.get(participantList.size()-1);

        System.out.println(answer);


    }
    
}
