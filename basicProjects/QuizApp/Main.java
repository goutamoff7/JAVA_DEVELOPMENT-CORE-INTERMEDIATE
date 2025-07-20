public class Main {

    public static void main(String[] args) {
        Question[] questions = new Question[5];
        Answer[] answers = new Answer[5];

        QuestionService questionService = new QuestionService();
        questionService.setQuestion(questions, answers);

        PlayQuizService playQuizService = new PlayQuizService(questions, answers);
        playQuizService.playQuiz();
        playQuizService.printScore();

    }
    
}
