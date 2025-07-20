public class Question {
    private int id;
    private String question;    
    private Answer answer;
    private String correctAnswer;
    
    


    public Question(int id, String question, Answer answer, String correctAnswer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.correctAnswer = correctAnswer;
    }


    
    @Override
    public String toString() {
        return "Question [id=" + id + ", question=" + question + ", answer=" + answer + ", correctAnswer="
                + correctAnswer + "]";
    }



    public int getId() {
        return id;
    }


    public String getQuestion() {
        return question;
    }


    public Answer getAnswer() {
        return answer;
    }



    public String getCorrectAnswer() {
        return correctAnswer;
    }
       
    

}
