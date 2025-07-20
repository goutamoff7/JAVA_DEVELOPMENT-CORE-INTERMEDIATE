import java.util.Scanner;

public class PlayQuizService {

    private Question[] questions = new Question[5];
    private Answer[] answers = new Answer[5]; 
    private String selection[] = new String[5];   


    public PlayQuizService(Question[] questions, Answer[] answers) {
        this.questions = questions;
        this.answers = answers;
    }

    public void playQuiz(){
        
        int counter = 0;       
        for(Question question : questions ){
            System.out.println("Question No. : "+question.getId());
            System.out.println(question.getQuestion());
            System.out.println(answers[counter]);

            Scanner scanner = new java.util.Scanner(System.in);
            selection[counter++] = scanner.nextLine();            
        }

        System.out.println("\nUser Selections:\n");

        for(int q=0,s=0; q<questions.length && s<selection.length; q++,s++){
            System.out.println("Question No. : "+questions[q].getId());
            System.out.println(questions[q].getQuestion());
            System.out.println("Selected answer : "+ selection[s]); 
            
        }
    }

    public void printScore(){

        int score =0;
        for(int i=0;i<questions.length;i++){
            String correctAnswer = questions[i].getCorrectAnswer();
            String userAnswer = selection[i];

            if(correctAnswer.equals(userAnswer))
                score++;
        }
        System.out.println("Your Score is : "+score);
    }
    
}
