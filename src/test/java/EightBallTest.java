import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class EightBallTest {

    EightBall eightBall;
    ArrayList<String> answers;

    @Before
    public void before(){
        answers = new ArrayList<>();
        answers.add("Yes!");
        eightBall = new EightBall(answers);
    }

    @Test

    public void hasLength(){
        assertEquals(0, eightBall.getAnswerCount());
    }

//    @Test
//
//    public void canAddItem(){
//        eightBall.addAnswer("Yes");
//        assertEquals("Yes", eightBall.)
//
//    }

}

