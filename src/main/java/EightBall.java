import java.util.ArrayList;

public class EightBall {

    private ArrayList<String> answers;

    public EightBall(){
        this.answers = new ArrayList<>();

    }

    public void addAnswer(String answer) {
        this.answers.add(answer);
    }

    public void removeAnswer(String answer){
        this.answers.remove(answer);
    }

    public int getAnswerCount() {
        return this.answers.size();
    }
}
