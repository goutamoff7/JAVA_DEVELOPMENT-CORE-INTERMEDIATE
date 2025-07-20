import java.util.Scanner;

public class QuestionService {

    public void setQuestion(Question[] questions, Answer[] answers) {

        answers[0] = new Answer( "2", "6", "4", "8");
        questions[0] = new Question(1, "size of int", answers[0], "4" );

        answers[1] = new Answer("2", "6", "4", "8");
        questions[1] = new Question(2, "size of double",answers[1], "8" );

        answers[2] = new Answer( "2", "6", "4", "8");
        questions[2] = new Question(3, "size of char",answers[2], "2");

        answers[3] = new Answer(  "2", "6", "4", "8");
        questions[3] = new Question(4, "size of long",answers[3], "8");

        answers[4] = new Answer(   "1", "2", "4", "8");
        questions[4] = new Question(5, "size of boolean",answers[4], "1");

    }
    
}
