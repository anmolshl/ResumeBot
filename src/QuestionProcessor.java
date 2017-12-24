import java.util.ArrayList;

public class QuestionProcessor {

    private static final String[] qtypes = {"personal", "skills", "education", "projects", "awards", "website"};

    private static Score[] scores;

    public QuestionProcessor(){
        scores = new Score[]{};
        for(int i = 0; i < qtypes.length; i++){
            scores[i] = new Score(qtypes[i], 0);
        }
    }

    public Score getMaxScore(){
        Score max = scores[0];
        for(int i = 1; i < scores.length; i++){
            if(scores[i].getScore() > max.getScore()){
                max = scores[i];
            }
        }
        return max;
    }
}
