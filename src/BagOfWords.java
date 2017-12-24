import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BagOfWords {

    private static List bag;

    private String question;

    public BagOfWords(String question){
        bag = new ArrayList();
        this.question = question;
        this.question = this.question.concat("\0");
    }

    public void breakQuestion(){
        String question = this.question;
        while(question.charAt(0) != '\0'){
            int space = question.indexOf(" ");
            bag.add(question.substring(0, space));
            question = question.substring(space+1);
        }
    }

    public List getBag(){
        return bag;
    }
}
