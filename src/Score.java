public class Score {

    String type;
    double score;

    public Score(String type, double score){
        this.type = type;
        this.score = score;
    }

    public void setScore(double score){
        this.score = score;
    }

    public double getScore(){
        return this.score;
    }

    public String getType(){
        return this.type;
    }
}
